package basics;

import java.util.stream.Stream;

public class Test1 {
    public int solution(int N) {
        int a = N;
        int sumOfDigitsOfN = sumOfDigits(a);
        while (true){
            N++;
            if((2 * sumOfDigitsOfN) == sumOfDigits(N)){
                return N;
            }
        }
    }

    private int sumOfDigits(int num){

        return String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum();

    }

    public static void main(String[] args){
        Test1 t = new Test1();

        System.out.println(t.solution(17));

        System.out.println(t.solution(10));

        System.out.println(t.solution(99));

    }
}
