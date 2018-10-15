package com.raohui;

public class _66_movingCount {
    public int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0 || rows < 0 || cols < 0) {
            return 0;
        }
        int viewed[] = new int[rows * cols];
        return movingCountHelper(threshold, rows, cols, 0, 0, viewed);

    }

    private int movingCountHelper(int threshold, int rows, int cols, int row, int col, int[] viewed) {
        int count = 0;
        if (check(threshold, row, rows, col, cols, viewed)) {
            viewed[row * cols + col] = 1;
            count = 1 + movingCountHelper(threshold, rows, cols, row + 1, col, viewed) +
                    movingCountHelper(threshold, rows, cols, row - 1, col, viewed) +
                    movingCountHelper(threshold, rows, cols, row, col + 1, viewed) +
                    movingCountHelper(threshold, rows, cols, row + 1, col - 1, viewed);

        }
        return count;
    }

    private boolean check(int threshold, int row, int rows, int col, int cols, int[] viewed) {
        if (row >= 0 && row < rows && col >= 0 && col < cols && (getNum(row) + getNum(col)) <= threshold &&
                viewed[row * cols + col] == 0) {
            return true;
        } else {
            return false;
        }
    }

    private int getNum(int nums) {
        int sum = 0;
        while (nums > 0) {
            sum += nums % 10;
            nums = nums / 10;
        }
        return sum;
    }
}
