SELECT clients.name, contracts.d_number, operations.dt, operations.summa, (summa / SUM(summa) * 100) AS perc
FROM clients
JOIN contracts
ON clients.client_id = contracts.client_id
JOIN operations
ON contracts.d_id = operations.d_id
GROUP BY name