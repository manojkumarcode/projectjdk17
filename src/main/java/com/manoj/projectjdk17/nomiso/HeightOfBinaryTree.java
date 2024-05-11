package com.manoj.projectjdk17.nomiso;

public class HeightOfBinaryTree {
    public static int heightOfBinaryTree(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)) + 1;
    }

    public static int heightOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)) + 1;
    }
}
