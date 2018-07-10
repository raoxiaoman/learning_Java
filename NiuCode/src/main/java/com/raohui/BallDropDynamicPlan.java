package com.raohui;
//动态规划解法，根据第一种方法的分析，其实可以发现， 第一次尝试的楼层， 会对最终的结果产生直接的影响。 
//设 f(m, n)为m个鸡蛋,n层楼时,在最坏情况下的最少尝试次数.如果第一次尝试从x层楼开始,则f(m,n)=1+max(f(m−1,n−1)，f(m,n−x))
//f(m−1,n−1)对应的是第一次尝试鸡蛋被摔碎的情况
//f(m,n−x)对应的是第一次尝试鸡蛋没被摔碎的情况
public class BallDropDynamicPlan{
    public static void main(String[] args) {
        int floors = 100;
        int eggs = 2;

        System.out.println(computeMinDropsInWorstCase(eggs, floors));
    }

    // A utility function to get maximum of two integers

    private static int computeMinDropsInWorstCase(int eggs, int floors) {
        int table[][]=new int[eggs+1][floors+1];


        // boundary condition:
        // if no floors or 1 floors, only need 0 trails or 1 trails

        for (int i = 0; i <= eggs; i++) {
            table[i][1] = 1;
            table[i][0] = 0;
        }


        // if only one egg,   f(1,k) = k

        for (int j = 0; j <= floors; j++) {
            table[1][j] = j;
        }

        // for the rest of cases
        // f( eggs, floors) = 1+ Max(f( eggs-1 , floors-1), f( eggs, floors-x))
                // x is the floor number we choose to drop for current attempt 
                // range of i = 1,2,.....,floors,
        for(int i = 2; i <= eggs; i++)
        {
            for (int j = 2; j <= floors; j++) {

                table[i][j] = Integer.MAX_VALUE;  // so important

                for (int floorTriedFirst = 1; floorTriedFirst <= j; floorTriedFirst++) {
                    int res = 1+Integer.max(table[i-1][floorTriedFirst-1], 
                                    table[eggs][j-floorTriedFirst]);  
                    if(res < table[i][j])
                    {
                        table[i][j] = res;
                    }
                }

            }
        }

        return table[eggs][floors];
    }

}
