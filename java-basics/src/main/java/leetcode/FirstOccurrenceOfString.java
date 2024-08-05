package leetcode;

public class FirstOccurrenceOfString {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main (String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = strStr(haystack1, needle1);
        System.out.println(result1); // Output: 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = strStr(haystack2, needle2);
        System.out.println(result2); // Output: -1
    }
}
