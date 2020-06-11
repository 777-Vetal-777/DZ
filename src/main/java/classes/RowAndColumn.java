package classes;

import interfaces.FindMaxCount;

public class RowAndColumn implements FindMaxCount {

    public int columnMax(int[][] matrix) {
        if(matrix==null){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int tempMax = 0;
            int comparasionMax = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    comparasionMax++;
                }
                if (matrix[j][i] != 1) {
                    if (tempMax < comparasionMax) {
                        tempMax = comparasionMax;
                    }
                    comparasionMax = 0;
                }
            }
            if (tempMax<comparasionMax) {
                tempMax = comparasionMax;
            }
            if (tempMax > max) {
                max = tempMax;
            }
        }
        return max;
    }

    public int rowMax(int[][] matrix) {
        if(matrix==null){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            int tempMax = 0;
            int comparasionMax = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    comparasionMax++;
                }
                if (matrix[i][j] != 1) {
                    if (tempMax < comparasionMax) {
                        tempMax = comparasionMax;
                    }
                    comparasionMax = 0;
                }
            }
            if (tempMax<comparasionMax) {
                tempMax = comparasionMax;
            }
            if (tempMax > max) {
                max = tempMax;
            }
        }
        return max;
    }

}
