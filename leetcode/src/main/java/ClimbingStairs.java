/**
 * @author bitye
 * @data 2020/1/30
 * @time 12:26
 */
public class ClimbingStairs {

    public int climbStairs1(int n) {
        int[] memo = new int[n];
        return sumSteps(n - 1, memo) + sumSteps(n - 2, memo);
    }

    private int sumSteps(int n, int[] memo) {
        if (n == 0) {
            return 1;
        }
        if (n == -1) {
            return 0;
        } else if (memo[n] > 0) {
            return memo[n];
        } else {
            memo[n] = sumSteps(n - 1, memo) + sumSteps(n - 2, memo);
            return memo[n];
        }
    }

    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }


}
