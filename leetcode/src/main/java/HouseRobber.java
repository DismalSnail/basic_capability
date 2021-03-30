/**
 * @author 冶鹏豪
 * @date 2021/3/26
 */
public class HouseRobber {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        switch (nums.length) {
            case 0:
                return 0;
            case 1:
                return nums[0];
            case 2:
                return Math.max(nums[0], nums[1]);
            case 3:
                return Math.max(nums[1], nums[0] + nums[2]);
            default:
                break;
        }

        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1], nums[0] + nums[2]);
        for (int i = 3; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i];
        }
        return Math.max(dp[nums.length - 1], dp[nums.length - 2]);
    }

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int rob = houseRobber.rob(new int[]{1, 2, 3, 1});
        System.out.println(rob);
    }
}
