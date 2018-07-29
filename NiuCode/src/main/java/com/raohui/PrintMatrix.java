package com.raohui;

import java.util.ArrayList;

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return  null;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        while(row > 2* start && col > 2* start){
            int endX  = col - 1 - start;
            int endY = row - 1 - start;

            for(int i = start;i<=endX;i++){
                list.add(matrix[start][i]);
            }
            if(start < endY){
                for(int i = start+1;i<=endY;i++){
                    list.add(matrix[i][endX]);
                }
            }
            if(start< endX && start < endY){
                for(int i = endX-1;i>=start;i--){
                    list.add(matrix[endY][i]);
                }
            }
            if(start < endX && start < endY -1){
                for(int i = endY-1;i>=start+1;i--){
                    list.add(matrix[i][start]);
                }
            }
            start++;
        }
        return  list;

    }
}
