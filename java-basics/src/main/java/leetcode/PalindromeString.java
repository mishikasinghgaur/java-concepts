package leetcode;

public class PalindromeString {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String palindrome1 = "A man, a plan, a canal, Panama";
        String palindrome2 = "racecar";
        String notPalindrome = "hello world";

        System.out.println("Is palindrome1 a palindrome? " + isPalindrome(palindrome1));
        System.out.println("Is palindrome2 a palindrome? " + isPalindrome(palindrome2));
        System.out.println("Is notPalindrome a palindrome? " + isPalindrome(notPalindrome));
    }
}
