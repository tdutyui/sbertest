package tasks;

import java.util.Arrays;

public class SecondTask {

    public static boolean areAnagrams(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        char[] firstWordCharacters = firstWord.toCharArray();
        char[] secondWordCharacters = secondWord.toCharArray();
        Arrays.sort(firstWordCharacters);
        Arrays.sort(secondWordCharacters);
        return Arrays.equals(firstWordCharacters, secondWordCharacters);
    }
}
