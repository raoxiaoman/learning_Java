package com.raohui;

public class _62_KthNode {
    private  int index = 0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot != null){
            TreeNode node = KthNode(pRoot.left,k);
            if(node!=null){
                return node;
            }
            index++;
            if(index == k){
                return pRoot;
            }
            node = KthNode(pRoot.right,k);
            if(node !=null){
                return node;
            }

        }
        return null;


    }
}
