package com.raohui;

import java.util.TreeSet;

public class _39_IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return true;
        }
        return treeDepth(root)!=-1;
    }

    private int treeDepth(TreeNode treeNode) {
        if(treeNode == null){
            return 0;
        }
        int left = treeDepth(treeNode.left);
        if(left==-1){
            return -1;
        }
        int right = treeDepth(treeNode.right);
        if(right==-1){
            return -1;
        }
        return Math.abs(left-right) > 1?-1:1+Math.max(left,right);
    }
}
