/**
 * @author bitye
 * @data 2020/2/19
 * @time 9:31
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        n--;
        m--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] <= nums2[n]) {
                nums1[i] = nums2[n];
                i--;
                n--;
            } else {
                nums1[i] = nums1[m];
                i--;
                m--;
            }
        }
        if (m < 0) {
            while (n >= 0) {
                nums1[i] = nums2[n];
                i--;
                n--;
            }
        }

    }
}
