package leetcode75.HashMap;

import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;

public class GoodPairs {
        public int numIdenticalPairs(int[] nums) {

            HashMap<Integer,Integer> pairs = new HashMap<>();

            final int[] result = {0};

            for(int n: nums){
                Optional.ofNullable(pairs.get(n))
                        .ifPresentOrElse(
                                value -> pairs.put(n, value + 1),
                                () -> pairs.put(n, 1)
                        );
            }

            pairs.forEach((K,V)->{
                int occurrence = pairs.get(K);
                if (occurrence > 1){
                    result[0] = result[0] + (occurrence * (occurrence - 1))/2;
                }
        });


            return result[0];
        }

        public static void main(String[] args){

            GoodPairs goodPairs = new GoodPairs();

            int[] arr = {1,2,3,1,1,3};
            int[] arr1 = {1,1,1,1};

            System.out.println(goodPairs.numIdenticalPairs(arr));
            System.out.println(goodPairs.numIdenticalPairs(arr1));

        }
}
