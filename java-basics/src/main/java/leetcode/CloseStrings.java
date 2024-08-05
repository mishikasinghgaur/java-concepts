package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CloseStrings {

    public static boolean isStringCloseEnough(String word1, String word2) {
        if(word1.length() != word2.length()) {
           return false;
        }

        if(!haveSameCharacters(word1,word2)){
            return false;
        }

        Map<Character, Integer> frequencyMap1 = getCharacterFrequency(word1);
        Map<Character, Integer> frequencyMap2 = getCharacterFrequency(word2);

        return frequencyMap1.equals(frequencyMap2);
    }

    private static boolean haveSameCharacters(String word1, String word2) {

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }

    private static Map<Character, Integer> getCharacterFrequency(String word) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for(char c:word.toCharArray()) {
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {

       System.out.println(isStringCloseEnough("cabbba","abbccc"));
    }
}
