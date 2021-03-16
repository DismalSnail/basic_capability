public class RemoveDuplicates {
    /**
     * NAME: Remove Duplicates from Sorted Array
     * Description:
     * Given a sorted array nums, remove the duplicates in-place such that
     * each element appear only once and return the new length.
     * <p>
     * Do not allocate extra space for another array,you must do this by
     * modifying the input array in-place with O(1) extra memory.
     * <p>
     * <p>
     * The order of elements can be changed.It doesn't matter what you leave beyond the new length.
     * <p>
     * Example 1:
     * Given nums = [1,1,2],
     * <p>
     * Your function should return length = 2,with the first two elements of
     * nums 1 and 2 respectively.
     * <p>
     * It doesn't matter what you leave beyond the returned length.
     * <p>
     * Example 2:
     * Given nums = [0,0,1,1,1,2,2,3,3,4],
     * Your function should return length = 5,with the first five elements of nums being
     * modified to 0,1,2,3 and 4 respectively.
     * <p>
     * It doesn't matter what values are set beyond returned length.
     * <p>
     * Clarification:
     * Confused why the returned value is an integer but your answer is an array?
     * <p>
     * Note that the input array is passed in by reference, which means modification
     * to the input array will be konwn to the caller as well.
     * <p>
     * Internally you can think of this:
     * //nums is passed in by reference.(i.e.,without making a copy)
     * int len = removeDuplicates(nums);
     * <p>
     * // any modification to nums in your function would be known by the caller.
     * <p>
     * //using the length returned by your function, it prints the first len elements.
     * <p>
     * for(int i=0;i<len;i++){
     * print(nums[i])
     * }
     */

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int i = 0;
        int j = 0;
        if (nums.length == 1) {
            return 1;
        } else if (nums.length == 0) {
            return 0;
        } else {
            j = i + 1;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    j++;
                    count++;
                } else {
                    if (count == 0) {
                        i++;
                        j++;
                    } else {
                        i++;
                        nums[i] = nums[j];
                        count--;
                    }
                }

            }
        }
        return i + 1;
    }
}
