public class Reverse {
    /**
     * Name: Reverse Integer
     * Description
     * Given a 32-bit signed integer,reverse digits of an integer.
     * <p>
     * Example 1:
     * Input: 123
     * Output: 321
     * <p>
     * Example 2:
     * Input: -123
     * Output: -321
     * <p>
     * Example 3:
     * Input: 120
     * Output: 21
     * <p>
     * Note:
     * Assume we are dealing with an environment which could
     * only store integers within the 32-bit signed integer
     * range:[-2^31, 2^31-1].For the purpose of this problem,
     * assume that your function returns 0 when the reversed integer overflows.
     */
    public static int reverse(int x) {
        int pop = 0;
        int rev = 0;
        if (x == 0) {
            return 0;
        }
        while (x != 0) {

            pop = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }
        return rev;

    }
}
