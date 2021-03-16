public class LongestCommonPrefix {



    /**
     * NAME: Longest Common Prefix
     * Description:
     * Write a function to find the longest common prefix string amongst an array
     * of strings.
     * <p>
     * if there is no common prefix, return an empty string "".
     * <p>
     * Example 1:
     * Input: ["flower","flow","flight"]
     * Output: "fl"
     * <p>
     * Example 2:
     * Input: ["dog","racecar","car"]
     * Output: ""
     * Explanation:There is no common prefix among the input strings.
     * <p>
     * Note:
     * All given inputs are in lowercase letters a-z.
     */

    public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        char letter = '\0';
        int j = 0;
        label:
        while (true) {
            if (strs.length == 0) {
                break label;
            }
            int index = 0;
            for (int i = 0; i < strs.length; i++) {
                if (j == strs[i].length()) {
                    break label;
                }
                if (i == 0) {
                    letter = strs[i].charAt(j);
                } else {
                    if (letter != strs[i].charAt(j)) {
                        break label;
                    }
                }
            }
            index = j;
            commonPrefix += strs[0].charAt(j);
            j++;
        }

        return commonPrefix;
    }

    public static String longestCommonPrefixTest2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
