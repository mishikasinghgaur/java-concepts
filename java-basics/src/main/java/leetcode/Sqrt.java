package leetcode;

public class Sqrt {
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x; // The square root of 0 or 1 is itself.
        }

        long left = 1;
        long right = x;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right; // Return the integer part of the square root.
    }

    public static int straightSqrt (int x) {
        if (x <= 1){
            return x;
        } else {
            double result = Math.sqrt(x);
            return (int) Math.floor(result);
        }
    }

    public static void main (String[] args) {
        int x1 = 4;
        int result1 = mySqrt(x1);
        System.out.println(result1); // Output: 2

        int x2 = 8;
        int result2 = mySqrt(x2);
        System.out.println(result2); // Output: 2
    }
}
