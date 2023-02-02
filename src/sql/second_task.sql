WITH cte AS (SELECT *, Datetime AS Datetime_start,
                    LEAD(Datetime, 1, CURRENT_TIMESTAMP) OVER (PARTITION BY ID ORDER BY Datetime) Datetime_end,
                    LEAD(Stat, 1, NULL) OVER (PARTITION BY ID ORDER BY Datetime) Stat_next
             FROM table),
cte2 AS (SELECT *
         FROM cte
         WHERE Stat = 1 AND (Datetime_end > Datetime_start OR Stat_next IN (2, 4)))
SELECT ID, Stat, Datetime_start, Datetime_end,
       EXTRACT(EPOCH FROM (Datetime_end - Datetime_start))/60.0 AS Datetime_diff
FROM cte2
WHERE
    CASE
        WHEN Stat_next IN (2, 4) THEN Datetime_end >= Datetime_start
        WHEN Stat_next IS NULL THEN Datetime_end = CURRENT_TIMESTAMP
        ELSE Datetime_end > Datetime_start
        END
  AND EXTRACT(EPOCH FROM (Datetime_end - Datetime_start))/60.0 > 15;