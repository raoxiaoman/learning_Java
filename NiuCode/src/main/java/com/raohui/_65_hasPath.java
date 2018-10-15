package com.raohui;

public class _65_hasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || rows < 0 || cols < 0 || str == null) {
            return false;
        }

        int viewed[] = new int[matrix.length];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (hasPathHelper(matrix, row, rows, col, cols, str, 0, viewed)) {
                    return true;
                }

            }
        }
        return false;

    }

    private boolean hasPathHelper(char[] matrix, int row, int rows, int col, int cols, char[] str, int k, int[] viewed) {
        int index = row * cols + col;

        if (k == str.length - 1) {
            return true;
        }
        boolean hasPath = false;
        if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[index] == str[k] && viewed[index] == 0) {
            viewed[index] = 1;
            hasPath = hasPathHelper(matrix, row - 1, rows, col, cols, str, k + 1, viewed) ||
                    hasPathHelper(matrix, row + 1, rows, col, cols, str, k + 1, viewed) ||
                    hasPathHelper(matrix, row, rows, col - 1, cols, str, k + 1, viewed) ||
                    hasPathHelper(matrix, row, rows, col + 1, cols, str, k + 1, viewed);
            if (!hasPath) {
                viewed[index] = 0;
            }
        }
        return hasPath;


    }
}