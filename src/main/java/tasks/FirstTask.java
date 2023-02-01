package tasks;

public class FirstTask {

    public static String encodeString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            char letter = s.charAt(i);
            while (i < s.length() - 1 && letter == s.charAt(i + 1)) {
                count++;
                i++;
            }
            stringBuilder.append(letter);
            if (count > 1) {
                stringBuilder.append(count);
            }
        }
        return stringBuilder.toString();
    }

    public static String decodeString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            stringBuilder.append(character);
            try {
                if (i < s.length() - 1) {
                    int count = Integer.parseInt(String.valueOf(s.charAt(i + 1)));
                    stringBuilder.append(String.valueOf(character).repeat(Math.max(0, count - 1)));
                }
                i++;
            } catch (NumberFormatException e) {

            }
        }
        return stringBuilder.toString();
    }
}
