public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int add = Integer.parseInt(number.trim());
                if (add < 0) {
                    throw new IllegalArgumentException("negatives not allowed");
                }
                if (add < 1000) {
                    returnValue += add;
                }
            }
        }
        return returnValue;
    }
}
