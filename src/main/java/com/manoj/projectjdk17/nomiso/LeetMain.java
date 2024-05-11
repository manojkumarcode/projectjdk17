package com.manoj.projectjdk17.nomiso;

import org.antlr.v4.runtime.tree.Tree;

public class LeetMain {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left =new TreeNode(2);
        node.right =new TreeNode(3);
        node.right.left =new TreeNode(4);
        node.right.right =new TreeNode(5);
        Codec ser = new Codec();
        Codec deser = new Codec();
        TreeNode ans = deser.deserialize(ser.serialize(node));
        System.out.println(HeightOfBinaryTree.heightOfBinaryTree(node));
    }
}
