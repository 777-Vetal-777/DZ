import classes.RowAndColumn;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0, 1, 0, 0}, {1, 0, 1, 1, 0, 1}, {0, 0, 0, 1, 0, 0}};
        RowAndColumn rowAndColumn = new RowAndColumn();
        System.out.println(Math.max(rowAndColumn.columnMax(matrix), rowAndColumn.rowMax(matrix)));
    }


}
