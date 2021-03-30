/**
 * @author 冶鹏豪
 * @date 2021/3/30
 */
public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start1D = 0;
        int end1D = matrix.length - 1;

        if (matrix[0][0] > target) {
            return false;
        }
        if (matrix[end1D][0] < target) {
            return BinarySearch(matrix[end1D], target);
        }

        int mid1D = -1;
        while (start1D <= end1D) {
            mid1D = ((end1D - start1D ) >> 1) + start1D;
            if (matrix[mid1D][0] == target) {
                return true;
            } else if (matrix[mid1D][0] < target) {
                start1D = mid1D + 1;
            } else {
                end1D = mid1D - 1;
            }
        }

        return BinarySearch(matrix[start1D-1], target);

    }

    public boolean BinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        if (target < array[start] || target > array[end]) {
            return false;
        }
        while (start <= end) {
            mid = ((end - start) >> 1) + start;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

}
