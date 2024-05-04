package com.manoj.projectjdk17.nomiso;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void traverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.println("\nLevel Order Traversal");
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node head = queue.poll();
            System.out.print(head.val + " ");
            if(head.left != null){
                queue.add(head.left);
            }
            if(head.right != null){
                queue.add(head.right);
            }
        }

    }
}
