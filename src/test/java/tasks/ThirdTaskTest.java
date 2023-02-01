package tasks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirdTaskTest {

    @Test
    void assertSortOfArrayListIsCorrect() {
        List<Integer> input = List.of(1, 4, 5, 6, 9, 10, 12, 13, 15, 17, 20);
        List<Integer> output = List.of(4, 6, 10, 12, 20, 17, 15, 13, 9, 5, 1);
        assertEquals(output, ThirdTask.sort(input));
    }

    @Test
    void assertSortIsCorrect() {
        int[] input = new int[]{1, 4, 5, 6, 9, 10, 12, 13, 15, 17, 20};
        int[] output = new int[]{4, 6, 10, 12, 20, 17, 15, 13, 9, 5, 1};
        assertArrayEquals(output, ThirdTask.sort(input));
    }
}