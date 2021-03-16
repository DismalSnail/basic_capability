public class RemoveElement {
    /**
     * NAME: Remove Element
     * Description:
     * Given an array nums and a value val, remove all instances of that value in-place
     * and return the new length.
     * <p>
     * Do not allocate extra space for another array,you must do this by
     * modifying the input array in-place with O(1) extra memory.
     * <p>
     * The order of elements can be changed.It doesn't matter what you leave beyond the new length.
     *
     * <p>
     * Example 1:
     * Given nums = [3,2,2,3], val = 3,
     * <p>
     * Your function should return length = 2,with the first two elements of
     * nums being 2.
     * <p>
     * It doesn't matter what you leave beyond the returned length.
     * <p>
     * Example 2:
     * Given nums = [0,1,2,2,3,0,4,2], val = 2
     * Your function should return length = 5,with the first five elements of nums containing
     * 0,1,3,0 and 4.
     * <p>
     * Note that the order of those five elements can be arbitrary.
     *
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

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; ) {
            if (nums[j] == val) {
                j++;
            } else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
        }
        return i;
    }
}
