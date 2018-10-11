package com.raohui;

public class _58_isSymmetrical {
    Boolean isSymmetrical(TreeNode pRoot) {
       if(pRoot == null){
           return true;
       }
       return  compareRoot(pRoot.left,pRoot.right);
    }

    private Boolean compareRoot(TreeNode left,TreeNode right) {
        if(left == null){
            return right == null;
        }
        if(right == null){
            return false;
        }
        if(right.val != left.val){
            return false;
        }
        return compareRoot(left.left,right.right) && compareRoot(left.right,right.left);
    }
}
