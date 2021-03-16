/**
 * @author bitye
 */
public class SqrtX {
    /**
     * NAME:Sqrt(x)
     * Description:
     * Implement int sqrt(int x).
     * Compute and return the square root of x, where x is guaranteed to be
     * a non-negative integer.
     * <p>
     * Since the return type is an integer,the decimal digits are
     * truncated and only the integer part of the result is returned.
     * <p>
     * Example 1:
     * Input: 4
     * Output: 2
     * <p>
     * Example 2:
     * Input: 8
     * Output: 2
     * Explanation: the square root of 8 is 2.82842...,and since the
     * decimal part is truncated, 2 is returned.
     */

    public static int mySqrt(int x) {
        return dichotomay(x);

    }

    public static int Newton(double a) {
        double x1 = a;
        double sqrt = (a / x1 + x1) / 2;
        while (Math.abs(x1 - sqrt) >= 1e-6) {
            x1 = sqrt;
            sqrt = (a / x1 + x1) / 2;
        }
        return (int) x1;
    }

    public static int dichotomay(int a) {
        long low = 0;
        long high = a;
        long mid = -1;
        while (low < high) {
            mid = (low + high + 1) >>> 1;
            if (mid * mid > a) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return (int) low;
    }


}
