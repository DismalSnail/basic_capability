/**
 * @author bitye
 */
public class LengthOfLastWord {
    /**
     * NAME:Length of Last Word
     * Description:
     * Given a string s consists of upper/lower-case alphabets and empty space
     * characters ' ',return the length of last word in the string.
     * <p>
     * If the last word does not exist,return 0.
     * <p>
     * Note:A word is defined as a character sequence consists of non-space
     * characters only.
     * <p>
     * Example:
     * Input: "Hello World"
     * Output: 5
     */
    public static int lengthOfLastWord(String s) {
        int length = 0;
        Boolean notSpace =false;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) != ' ') {
                notSpace = true;
                length++;
            }
            if (s.charAt(i)==' ') {
                if (notSpace) {
                    return length;
                }
            }
        }
        return length;
    }
}
