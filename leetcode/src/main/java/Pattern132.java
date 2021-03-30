import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.TreeMap;

/**
 * @author 冶鹏豪
 * @date 2021/3/24
 */
public class Pattern132 {
    public boolean find132pattern1(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length - 1; j++) {
            if (nums[j] < nums[i]) {
                i = j;
            }
            for (int k = j + 1; i != j && k < nums.length; k++) {
                if (nums[k] > nums[i] && nums[k] < nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find132pattern2(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return false;
        }

        int minI = nums[0];

        TreeMap<Integer, Integer> rightAll = new TreeMap<>();

        for (int k = 2; k < len; k++) {
            rightAll.put(nums[k], rightAll.getOrDefault(nums[k], 0) + 1);
        }

        for (int j = 1; j < len - 1; j++) {
            if (minI < nums[j]) {
                Integer next = rightAll.ceilingKey(minI + 1);
                if (next != null && next < nums[j]) {
                    return true;
                }
            }
            minI = Math.min(minI, nums[j]);
            rightAll.put(nums[j + 1], rightAll.get(nums[j + 1]) - 1);
            if (rightAll.get(nums[j + 1]) == 0) {
                rightAll.remove(nums[j + 1]);
            }
        }
        return false;
    }

    public boolean find132pattern3(int[] nums) {
        int n = nums.length;
        Deque<Integer> d = new ArrayDeque<>();
        int k = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < k) {
                return true;
            }
            while (!d.isEmpty() && d.peekLast() < nums[i]) {
                // 事实上，k 的变化也具有单调性，直接使用 k = pollLast() 也是可以的
                k = d.pollLast();
            }
            d.addLast(nums[i]);
        }
        return false;
    }



    public static void main(String[] args) {
        Pattern132 pattern132 = new Pattern132();
        boolean pattern2 = pattern132.find132pattern3(new int[]{3, 1, 4, 2});
        System.out.println(pattern2);
    }
}
