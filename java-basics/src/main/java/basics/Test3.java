package basics;

import jakarta.servlet.http.PushBuilder;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {
    public String solution(String message, int K) {
        String[] words = message.split(" ");

        StringBuilder croppedMessage = new StringBuilder();

        for (String word : words) {
            if ((croppedMessage.length() + word.length() + (croppedMessage.length() > 0 ? 1 : 0)) <= K) {
                if (croppedMessage.length() > 0) {
                    croppedMessage.append(" ");
                }

                croppedMessage.append(word);
            } else {
                break;
            }
        }
        return croppedMessage.toString();
    }


    public static void main(String[] args){
        Test3 t3 = new Test3();
        int k =14;
         System.out.println(t3.solution("Codility we are coders",k));
    }
}

//      String croppedMessage = String.join(" ", Arrays.stream(words)
//              .collect(Collectors.toMap(
//                      word -> word,
//                      String::length,
//                      (w1, w2) -> w1, () -> new java.util.TreeMap<String, Integer>((s1, s2) -> Integer.compare(s2.length(), s1.length()))
//              ))+
//              .keySet());

//      if(croppedMessage.length() <= K){
//          return croppedMessage;
//      }
//      else {
//          return croppedMessage.substring(0,K);
//      }

