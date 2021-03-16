/**
 * @author bitye
 */
public class IsPalindrome {
    /**
     * NAME: Palindrome Number
     * Description:
     * Determine whether an integer is palindrome.An
     * integer is a palindrome when it reads the same backward
     * as forward.
     * <p>
     * Example 1:
     * Input: 121
     * Output: true
     * <p>
     * Example 2:
     * Input: -121
     * Output: false
     * Explanation:From left to right,it reads -121.From right to left, it becomes 121-.
     * Therefore it is not a palindrome.
     * <p>
     * Example 3:
     * Input: 10
     * Output: false
     * Explanation: Reads 01 from right to left.
     * Therefore it is not a palindrome
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x >= 0) {
            int initialX = x;
            int tmp = 0;
            int pop = 0;
            while (x != 0) {
                pop = x % 10;
                x /= 10;
                tmp = tmp * 10 + pop;
            }
            if (initialX == tmp) {
                return true;
            }
        }
        return false;
    }
}
