public class SearchInsert {

    /**
     * NAME: Search Insert Position
     * Description:
     * Given a sorted array and a target value,return the index if
     * the target is found.If not,return the index where it would be if it were inserted in order.
     * <p>
     * You may assume no duplicates in the array
     * <p>
     * Example 1:
     * Input: [1,3,5,6],5
     * Output: 2
     * <p>
     * Example 2:
     * Input: [1,3,5,6],2
     * Output: 1
     * <p>
     * Example 3:
     * Input: [1,3,5,6], 7
     * Output: 4
     * <p>
     * Example 4:
     * Input: [1,3,5,6],0
     * Output: 0
     */
    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid = -1;

        while (low <= high) {
            mid = (low + high) >>> 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (high < mid) {
            return mid;
        } else {
            return mid + 1;
        }

    }

}
