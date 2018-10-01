package com.raohui;

public class BackPack {
    private void test(int num,int maxWeight){
        int value[] = new int[num+1];
        int weight[] = new int[num+1];
        int maxValue[][] = new int[num+1][maxWeight+1];
        for(int i=1;i<=num;i++){
            for(int j=1;j<=maxWeight;j++){
                if(weight[i] > j){
                   maxValue[i][j] = maxValue[i-1][j];
                }else {
                    int a = maxValue[i-1][j];
                    int b = maxValue[i-1][j-weight[i]]+value[i];
                    maxValue[i][j] = Math.max(a,b);
                }
            }
        }
        System.out.println("num:"+num+",maxWeight:"+maxWeight+"maxValue:"+maxValue[num][maxWeight]);

        int n = num;
        int m = maxWeight;

        while (n>0){
            if(maxValue[n][m] ==maxValue[n-1][m-weight[n]+value[n]]){
                System.out.println(n+"value:"+value[n]+"weight:"+weight[n]);
                m-=weight[n];
            }
            n--;
        }


    }

}

