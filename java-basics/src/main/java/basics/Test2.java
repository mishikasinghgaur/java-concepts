package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test2 {
        public int solution1(int N) {

            //Convert integer to string to perform string operations
            String str = Integer.toString(N);

            //create a list to store integer values
            List<Integer> results = new ArrayList<>();

            //iterate through the string
            for(int i = 0; i < str.length(); i++){

                //check of the character at position i is equal to 5 and delete it and store the result in the list.
                if(str.charAt(i) == '5'){
                    StringBuilder sb = new StringBuilder(str);
                    sb.deleteCharAt(i);
                    int result = Integer.parseInt(sb.toString());
                    results.add(result);
                }
            }
            return  results.stream().mapToInt(Integer::intValue).max().orElse(0);

        }

        public static void main(String[] args){
            Test2 t2 = new Test2();

            System.out.println(t2.solution1(15958));

            System.out.println(t2.solution1(-5859));

            System.out.println(t2.solution1(-5000));

        }
    }

