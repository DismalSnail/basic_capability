/**
 * @author bitye
 */
public class TwoSum {
    /**
     * Name: Tow Sum
     * Description:
     * Given an array of integers,return indices of the two numbers such
     * that they add up to a specific target.
     * <p>
     * you may assume that each input would have exactly one silution,and
     * you may not use the same element twice.
     * <p>
     * Example:
     * Given nums = [2, 7, 11, 15],
     * target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
