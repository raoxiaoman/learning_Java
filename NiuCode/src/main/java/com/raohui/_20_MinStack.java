package com.raohui;

import java.util.Stack;

public class _20_MinStack {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        if(minStack.empty()){
            minStack.push(node);
        }else{
            int top  = minStack.peek();
            if(node < top){
                minStack.push(node);
            }
        }
        dataStack.push(node);
    }

    public void pop() {
        if(dataStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();

    }
}
