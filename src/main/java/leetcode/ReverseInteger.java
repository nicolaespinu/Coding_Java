package leetcode;

public class ReverseInteger {

    public static int reverse(int x) {
        long result = 0;
        while (Math.abs(x) > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}