public class MaximumSubarray {
    /**
     * NAME: Maximum Subarray
     * Description:
     * Given an integer array nums,find the contiguous subarray(containing at least one
     * number) which has the largest sum and return its sum.
     * <p>
     * Example:
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     */
    public static int maxAmongThree(int a, int b, int c) {
        /*返回三个数中的最大值*/
        return a > b ? a > c ? a : c : b > c ? b : c;
    }

    public static int maximumSubarray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int thisSum = 0;
        for (int i = 0; i < nums.length; i++) {
            thisSum = 0;
            for (int j = i; j < nums.length; j++) {
                thisSum += nums[j];
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    public static int maximumSubarray1(int[] nums) {
        int thisSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            thisSum += nums[i];
            if (thisSum > maxSum) {
                maxSum = thisSum;
            }
            if (thisSum < 0) {
                thisSum = 0;
            }
        }
        return maxSum;
    }

    public static int maximumSubarray2(int nums[]) {
        return divideAndConquer(nums, 0, nums.length - 1);
    }

    public static int divideAndConquer(int[] nums, int left, int right) {
        /*分治法求nums[left]到nums[right]的最大子列和*/
        int maxLeftSum = Integer.MIN_VALUE, maxRightSum = Integer.MIN_VALUE;
        /*存放左右子问题的解*/
        int maxLeftBorederSum = Integer.MIN_VALUE, maxRightBorderSum = Integer.MIN_VALUE;
        /*存放跨分界线的结果*/
        int leftBorderSum = 0, rightBorderSum = 0;
        /*存放跨分界线的临时结果*/
        int center = -1;

        /*递归的终止的条件，子列只有一个数字*/
        if (left == right) {
                return nums[left];
        }

        /*下面是“分”的过程*/
        /*找到中分点*/
        center = (left + right) / 2;

        /*递归求得两边子列的最大和*/
        maxLeftSum = divideAndConquer(nums, left, center);
        maxRightSum = divideAndConquer(nums, center + 1, right);

        /*求跨越分界线的最大子列和*/

        //从中线向左扫描
        for (int i = center; i >= left; i--) {
            leftBorderSum += nums[i];
            if (leftBorderSum > maxLeftBorederSum) {
                maxLeftBorederSum = leftBorderSum;
            }
        }//左边扫描结束

        //从中线向右扫描
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += nums[i];
            if (rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }//右边扫描结束

        /*下面返回“治”的结果*/

        return maxAmongThree(maxLeftSum,maxRightSum,maxLeftBorederSum+maxRightBorderSum);


    }

}
