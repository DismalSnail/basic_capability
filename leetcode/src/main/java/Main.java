/**
 * @author bitye
 * @data 2020/2/18
 * @time 18:17
 */
public class Main {
    public static void main(String[] args) {
        MergeSortedArray merge = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge.merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.println(num);
        }
    }
}
