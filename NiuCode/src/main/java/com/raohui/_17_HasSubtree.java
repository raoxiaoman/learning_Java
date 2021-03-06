package com.raohui;

public class _17_HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val == root2.val){
            result = isSubtree(root1,root2);
        }
        if(!result){
            result  = HasSubtree(root1.left,root2);
        }
        if(!result){
            result  = HasSubtree(root1.right,root2);
        }
        return  result;
    }
    private boolean isSubtree(TreeNode root1,TreeNode root2){
        if(root1 == null && root2!=null){
            return  false;
        }
        if(root2 == null){
            return  true;
        }
        if(root1.val == root2.val){
            return isSubtree(root1.left,root2.left) && isSubtree(root1.right,root2.right);
        }else{
            return false;
        }

    }

}
