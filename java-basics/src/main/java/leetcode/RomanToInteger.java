package leetcode;

public class RomanToInteger {
    public static String intToRoman(int input) {
        try {
            int num = Integer.parseInt(String.valueOf(input));
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                while (num >= values[i]) {
                    result.append(symbols[i]);
                    num -= values[i];
                }
            }

            return result.toString();
        } catch (NumberFormatException e) {
            return "Invalid input. Please provide a valid integer.";
        }
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 58;
        int num3 = 1994;

        System.out.println("Roman numeral for " + num1 + " is " + intToRoman(num1));
        System.out.println("Roman numeral for " + num2 + " is " + intToRoman(num2));
        System.out.println("Roman numeral for " + num3 + " is " + intToRoman(num3));
    }
}
