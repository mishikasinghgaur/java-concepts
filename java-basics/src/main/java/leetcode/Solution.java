package leetcode;

import java.util.Stack;

public class Solution {
        public static int solution(String letters) {

            char[] arr = letters.toCharArray();
            int count = 0;

            for (char c : arr) {

                int ind = index(arr,c);
                if (Character.isLowerCase(c)) {
                    char n = Character.toUpperCase(c);
                    for (int i = 0; i <= ind ; i++) {
                         if (arr[i] == n){
                             continue;
                         }
                    }
                } else {
                    count ++;
                }
            }

            return count;
        }

        private static int index (char[] arr, char ch){
            for (int i = 0; i < arr.length; i++) {
                if (ch == arr[i]) {
                    return i; // Return the index if the character is found
                }
            }
            return -1; // Return -1 if the character is not found in the array
        }


    public static void main (String[] args) {
            System.out.println(solution("aaAbcCABBc"));
    }
}
