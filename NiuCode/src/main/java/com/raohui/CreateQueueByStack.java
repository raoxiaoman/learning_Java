package com.raohui;

import java.util.Stack;

public class CreateQueueByStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int node = 0;
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        while(stack1.size() > 0){
            if(stack1.size() == 1){
               node = stack1.pop();
            }else{
                stack2.push(stack1.pop());
            }
        }
        return node;
    }
}
