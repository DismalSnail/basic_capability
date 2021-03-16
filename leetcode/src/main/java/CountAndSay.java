public class CountAndSay {

    /**
     * NAME: Count and Say
     * Description:
     * The count-and-say sequence is the sequence of integers
     * with the first five terms as following:
     * <p>
     * 1.       1
     * 2.       11
     * 3.       21
     * 4.       1211
     * 5.       111221
     * <p>
     * 1 is read off as "one 1" or 11.
     * 11 is read off as "two 1s" or 21.
     * 21 is read off as "one 2,then one 1" or 1211.
     * <p>
     * Given an integer n where 1 <= n <= 30, generate the n-th term
     * of the count-and say sequence.
     * <p>
     * Note:Each term of the sequence of integers will be represented
     * as a string.
     * <p>
     * Example 1:
     * Input: 1
     * Output: "1"
     * <p>
     * Example 2:
     * Input: 4
     * Output:"1211"
     */

    public static String countAndSay(int n) {
        int count = 0;
        StringBuilder strCopy = new StringBuilder();
        StringBuilder str = new StringBuilder("1e"); //加一个无关字符来解决最后一个正常字符遍历不到的问题
        StringBuilder mid = null;
        while (n-- != 1) {
            count = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    strCopy.append(count).append(str.charAt(i));
                    count = 1;
                }
            }
            mid = str;
            str = strCopy;
            strCopy = mid;
            strCopy.delete(0, strCopy.length());
            str.append("e");
        }
        str.delete(str.length() - 1, str.length());
        return str.toString();
    }
}
