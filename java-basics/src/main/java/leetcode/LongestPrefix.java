package leetcode;

public class LongestPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return ""; // If the input array is empty, there is no common prefix.
        }

        String firstString = strs[0]; // Take the first string as the reference.

        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    // If the current character doesn't match in any of the strings or we've reached the end of a string, return the prefix up to this point.
                    return firstString.substring(0, i);
                }
            }
        }
        return firstString;
    }

    public static void main (String[] args){

        String[] strs1 = {"flower", "flow", "flight"};
        String result1 = longestCommonPrefix(strs1);
        System.out.println(result1); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        String result2 = longestCommonPrefix(strs2);
        System.out.println(result2); // Output: ""
    }
}
