import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 冶鹏豪
 * @date 2021/3/31
 */
public class SearchIn2DMatrixTest {
    SearchIn2DMatrix s2;
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
    int[][] matrix1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};

    @Before
    public void init() {
        s2 = new SearchIn2DMatrix();
    }

    @Test
    public void testSearchMatrix() {

        assertFalse(s2.searchMatrix(matrix, 13));
        assertTrue(s2.searchMatrix(matrix, 5));
        assertTrue(s2.searchMatrix(matrix, 3));
        assertTrue(s2.searchMatrix(matrix1,11));
    }


}