package com.manoj.projectjdk17.nomiso;

public class IfTreeIsBST {
    public static boolean isBST(Node root, int min, int max){
        if(root == null){
            return true;
        }
        return root.val > min && root.val < max
                && isBST(root.left, min, root.val)
                && isBST(root.right, root.val, max);
    }

    public static boolean isBST(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }
        return root.val > min && root.val < max
                && isBST(root.left, min, root.val)
                && isBST(root.right, root.val, max);
    }
}
