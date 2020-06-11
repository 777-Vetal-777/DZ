import classes.RowAndColumn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class RowAndColumnTest {
    RowAndColumn rowAndColumn;

    @BeforeEach
    public void setUp() {
        rowAndColumn = new RowAndColumn();
    }

    @Test
    public void checkNullColumn() {
        assertNotNull(rowAndColumn.columnMax(null));
    }

    @Test
    public void checkNullRow() {
        assertNotNull(rowAndColumn.rowMax(null));
    }

    @Test
    public void checkIfAllZero() {
        int[][] matrix = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};

        int count1 = rowAndColumn.rowMax(matrix);
        int count2 = rowAndColumn.columnMax(matrix);
        assertEquals(0, count1);
        assertEquals(0, count2);
    }

    @Test
    public void checkIfAllOne() {
        int[][] matrix = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};

        int count1 = rowAndColumn.rowMax(matrix);
        int count2 = rowAndColumn.columnMax(matrix);
        assertEquals(count1, 6);
        assertEquals(count2, 3);

    }

    @Test
    public void checkIfOneByOneColumn() {
        int[][] matrix = {{1, 0, 1, 0, 1, 0}, {1, 0, 1, 0, 1, 0}, {1, 0, 1, 0, 1, 0}};

        int count1 = rowAndColumn.rowMax(matrix);
        int count2 = rowAndColumn.columnMax(matrix);
        assertEquals(count1, 1);
        assertEquals(count2, 3);

    }

    @Test
    public void checkIfOneByOneColumn2() {
        int[][] matrix = {{0, 1, 0, 1, 0, 1}, {0, 1, 0, 1, 0, 1}, {0, 1, 0, 1, 0, 1}};

        int count1 = rowAndColumn.rowMax(matrix);
        int count2 = rowAndColumn.columnMax(matrix);
        assertEquals(count1, 1);
        assertEquals(count2, 3);

    }


    @Test
    public void checkIfOneByOneRow() {
        int[][] matrix = {{1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1}};

        int count1 = rowAndColumn.rowMax(matrix);
        int count2 = rowAndColumn.columnMax(matrix);


        assertEquals(count1, 6);
        assertEquals(count2, 1);

    }

    @Test
    public void check() {
        int[][] matrix = {{0, 0, 0, 1, 0, 0}, {1, 0, 1, 1, 0, 1}, {0, 0, 0, 1, 0, 0}};

        int count1 = rowAndColumn.rowMax(matrix);
        int count2 = rowAndColumn.columnMax(matrix);

        assertEquals(count1, 2);
        assertEquals(count2, 3);

    }

    @Test
    public void checkIfOneOfThemMore() {
        int[][] matrix = {{0, 0, 0, 1, 0, 0}, {1, 0, 1, 1, 0, 1}, {0, 0, 0, 1, 0, 0}};

        int count1 = rowAndColumn.rowMax(matrix);
        int count2 = rowAndColumn.columnMax(matrix);

        assertEquals(3, Math.max(count1, count2));

    }


}
