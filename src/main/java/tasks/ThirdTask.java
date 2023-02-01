package tasks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdTask {

    public static List<Integer> sort(List<Integer> numbers) {
        List<Integer> oddNumbers = numbers
                .stream()
                .filter(a -> a % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        List<Integer> evenNumbers = numbers
                .stream()
                .filter(a -> a % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        evenNumbers.addAll(oddNumbers);
        return evenNumbers;
    }

    public static int[] sort(int[] nums) {
        int[] sortedNums = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sortedNums[index] = num;
                index++;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0) {
                sortedNums[index] = nums[i];
                index++;
            }
        }
        return sortedNums;
    }
}
