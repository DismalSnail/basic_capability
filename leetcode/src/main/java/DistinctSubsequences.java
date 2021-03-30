/**
 * @author 冶鹏豪
 * @date 2021/3/17
 */
public class DistinctSubsequences {
    private char[] s;
    private char[] t;
    private int lengthS;
    private int lengthT;

    public int numDistinct(String s, String t) {
        lengthS = s.length();
        lengthT = t.length();
        this.s = new char[1000];
        this.t = new char[1000];
        if (lengthS < lengthT) {
            return 0;
        }
        for (int i = 0; i < lengthS; i++) {
            this.s[i] = s.charAt(i);
        }
        for (int i = 0; i < lengthT; i++) {
            this.t[i] = t.charAt(i);
        }
        int i;
        for (i = 0; i < lengthT; i++) {
            if (this.s[i] == this.t[0]) {
                break;
            }
        }
        return numDistinct(i, 0);
    }

    public int numDistinct(int currentS, int currentT) {
        int i = currentS;
        int count = 0;
        if (currentT == lengthT) {
            return 1;
        }
        if (i == lengthS) {
            return 0;
        }
        for (; i < lengthS && currentT < lengthT; i++) {
            if (lengthS - i < lengthT - currentT) {
                break;
            }
            if (s[i] == t[currentT]) {
                count += numDistinct(i + 1, currentT + 1);
            }

        }

        return count;
    } //700531452

    public static void main(String[] args) {
        DistinctSubsequences ds = new DistinctSubsequences();
        String s = "adbdadeecadeadeccaeaabdabdbcdabddddabcaaadbabaaedeeddeaeebcdeabcaaaeeaeeabcddcebddebeebedaecccbdcbcedbdaeaedcdebeecdaaedaacadbdccabddaddacdddc";
        String t = "bcddceeeebecbc";
        int count = ds.numDistinct3(s, t);
        System.out.println(count);

    }

    public int numDistinct3(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n) {
            return 0;
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }
        for (int i = m - 1; i >= 0; i--) {
            char sChar = s.charAt(i);
            for (int j = n - 1; j >= 0; j--) {
                char tChar = t.charAt(j);
                if (sChar == tChar) {
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }

}
