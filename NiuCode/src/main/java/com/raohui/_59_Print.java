package com.raohui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class _59_Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        //设置初始值
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null) {
            return ret;
        }
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(null);
        queue.addLast(pRoot);
        boolean leftToRight = true;

        while (queue.size() != 1) {
            TreeNode node = queue.removeFirst();
            //到达分隔符
            if (node == null) {
                Iterator<TreeNode> iterator = null;
                if(leftToRight){
                    iterator = queue.iterator();
                }else{
                    iterator = queue.descendingIterator();
                }
                leftToRight = !leftToRight;
                while (iterator.hasNext()){
                    TreeNode temp = iterator.next();
                    list.add(temp.val);
                }
                ret.add(new ArrayList<>(list));
                list.clear();
                queue.addLast(null);
                continue;
            }
            if(node.left !=null){
                queue.addLast(node.left);
            }
            if(node.right !=null){
                queue.addLast(node.right);
            }

        }
        return ret;
    }
}
