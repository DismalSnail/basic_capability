/**
 * @author bitye
 */
public class PlusOne {
    /**
     * NAME: Plus One
     * Description:
     * Given a non-empty array of digits representing a non-negative integer,
     * plus one to the integer.
     * <p>
     * The digits are stored such that the most significant digit is at the head of
     * the list,and each element in the array contain a single digit.
     * <p>
     * You may assume the integer does not contain any leading zero,except the number 0 itself.
     * <p>
     * Example 1:
     * Input: [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * <p>
     * Example 2:
     * Input: [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     */

    public static int[] plusOne(int[] digits) {
        int[] newList = new int[digits.length + 1];
        for (int i = 0; i < digits.length; i++) {
            newList[digits.length - 1 - i] = digits[i];
        }
        newList[digits.length] = 0;

        newList[0]++;
        for (int i = 0; i < digits.length; i++) {
            if (newList[i] == 10) {
                newList[i + 1]++;
                newList[i] = 0;
            }
        }

        if (newList[digits.length]==0) {
            int[] trueNum = new int[digits.length];
            for (int i = 0; i < digits.length; i++) {
                trueNum[i]=newList[digits.length-1-i];
            }
            return trueNum;
        }else {
            int[] trueNum = new int[digits.length+1];
            for (int i = 0; i <= digits.length; i++) {
                trueNum[i] = newList[digits.length-i];
            }
            return trueNum;
        }
    }
}
