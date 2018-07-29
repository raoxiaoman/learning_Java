package com.raohui;

import java.util.ArrayList;

public class FindPath_24 {
    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return lists;
        }
        list.add(root.val);
        target = target - root.val;
        if (target == 0 && root.left == null && root.right == null) {
            lists.add(new ArrayList<>(list));
        }
        if(root.left!=null){
            FindPath(root.left,target);
        }
        if(root.right!=null){
            FindPath(root.right,target);
        }
        list.remove(list.size()-1);
        return lists;

    }
}
