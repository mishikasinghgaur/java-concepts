package leetcode;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n; // For 1 or 2 steps, there are n ways to climb.
        }

        int[] ways = new int[n + 1];
        ways[1] = 1;
        ways[2] = 2;

        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[n];
    }

    public static void main (String[] args) {
        int n1 = 2;
        int result1 = climbStairs(n1);
        System.out.println(result1); // Output: 2

        int n2 = 4;
        int result2 = climbStairs(n2);
        System.out.println(result2); // Output: 3

    }
}
