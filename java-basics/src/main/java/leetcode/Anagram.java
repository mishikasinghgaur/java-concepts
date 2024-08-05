package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            Map<Character, Integer> charCount = new HashMap<>();

            // Count characters in the first string
            for (char c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            // Decrement character counts in the second string
            for (char c : t.toCharArray()) {
                if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                    return false;  // Character not found in the first string or count is already zero
                }
                charCount.put(c, charCount.get(c) - 1);
            }

            // Check if all character counts are zero
            for (int count : charCount.values()) {
                if (count != 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            String s1 = "anagram";
            String t1 = "nagaram";

            String s2 = "rat";
            String t2 = "car";

            System.out.println("Is t1 an anagram of s1? " + isAnagram(s1, t1));
            System.out.println("Is t2 an anagram of s2? " + isAnagram(s2, t2));
        }
    }

