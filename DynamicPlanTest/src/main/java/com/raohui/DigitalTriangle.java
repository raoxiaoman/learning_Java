package com.raohui;

import java.util.Scanner;

public class DigitalTriangle {
    private int[][] D = new int[100][100];
    private int n;
    private int[][] maxNum = new int[100][100];

    public int maxnum1(int i, int j) {
        if (maxnum1(i, j) != -1) {
            return maxnum1(i, j);
        } else if (i == n) {
            return D[i][j];
        }
        int a = maxnum1(i + 1, j);
        int b = maxnum1(i + 1, j + 1);
        return Math.max(a, b) + D[i][j];
    }

    public int maxnum2() {
        for (int i = 1; i <= n; i++) {
            maxNum[n][i] = D[n][i];
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i; i++) {
                maxNum[i][j] = Math.max(maxNum[i + 1][j], maxNum[i + 1][j + 1]);
            }
        }
        return maxNum[1][1];
    }

    private void input() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                Scanner  scanner = new Scanner(System.in);
                D[i][j] = scanner.nextInt();
            }
        }

    }


}
