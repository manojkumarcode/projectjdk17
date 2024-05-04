package com.manoj.projectjdk17.nomiso;

import java.util.LinkedList;
import java.util.Queue;

public class NomisoBinaryTree {

    public static void main(String[] args) {

//        int[] arr = {10, 5, 20, 2, 6, 15, 30, 4};
//        Node root = createBinaryTree(arr);
//        LevelOrderTraversal.traverse(root);

        String[] strArr = {"1", "2", "3", "null", "null", "4", "5"};

        Node strRoot = createBinaryTree(strArr);
        serializeTree(strRoot);
    }

    private static void serializeTree(Node root){
        StringBuilder builder = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        builder.append(root.val).append(",");
        int lastNotNullIndex = -1;
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node.left == null){
                builder.append("null").append(",");
            } else {
                queue.add(node.left);
                builder.append(node.left.val).append(",");
                lastNotNullIndex = builder.length() - 1;

            }

            if(node.right == null){
                builder.append("null").append(",");
            } else {
                queue.add(node.right);
                builder.append(node.right.val).append(",");
                lastNotNullIndex = builder.length() - 1;
            }

        }
        String output = builder.toString();
        String result = output.substring(0, lastNotNullIndex);
        System.out.println(result);

    }

    private static Node createBinaryTree(int[] arr) {
        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while ( i < arr.length){
            Node head = queue.poll();
            head.left = new Node(arr[i]);
            queue.add(head.left);
            i++;
            if( i < arr.length) {
                head.right = new Node(arr[i]);
                queue.add(head.right);
            }
            i++;
        }
        return root;
    }


    private static Node createBinaryTree(String[] arr){
        if(arr[0] == null){
            return  null;
        }
        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while ( i < arr.length){
            Node head = queue.poll();
            if(!arr[i].equalsIgnoreCase("null")) {
                head.left = new Node(Integer.parseInt(arr[i]));
                queue.add(head.left);
            }
            i++;
            if( i < arr.length && !arr[i].equalsIgnoreCase("null")) {
                    head.right = new Node(Integer.parseInt(arr[i]));
                    queue.add(head.right);
            }
            i++;
        }
        return root;
    }


//    insertInLeftRight(Node head, int left, int right){
//        head.left = new Node(arr[i++]);
//        head.right = new Node(arr[i]);
//    }
}
