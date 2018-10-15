package com.raohui;

public class _61_Serialize {
    private int index = -1;

    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val).append(",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        index++;
        String[] strs = str.split(",");
        TreeNode treeNode = null;
        if (!strs[index].equals("#")) {
            treeNode = new TreeNode(Integer.valueOf(strs[index]));
            treeNode.left = Deserialize(str);
            treeNode.right = Deserialize(str);
        }
        return treeNode;
    }
}
