package com.raohui;

import java.util.Stack;

public class IsPopOrder_21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(popA == null || popA.length == 0 || pushA == null || pushA.length == 0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int aPushA : pushA) {
            stack.push(aPushA);
            while (!stack.empty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();

    }
}
