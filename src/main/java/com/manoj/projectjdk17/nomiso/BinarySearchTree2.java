package com.manoj.projectjdk17.nomiso;

import java.util.Scanner;

public class BinarySearchTree2 {

    public static void main(String[] args) {
        Node root = null;
        char ch = 'y';
        while (ch == 'y'){
            System.out.println("Enter the node value:");
            Scanner scanner = new Scanner(System.in);
            int val = scanner.nextInt();
            System.out.println("Entered value: " + val);

            Node temp = new Node(val);
            if(root == null){
                root = temp;
            }else {
                Node prev = null;
                Node head = root;
                while( head != null){
                    prev = head;
                    if(temp.val < head.val){
                        head = head.left;
                    }else if(temp.val > head.val){
                        head = head.right;
                    }else{
                        System.out.println("Value exits in the tree");
                        break;
                    }
                }
                if(temp.val < prev.val){
                    prev.left = temp;
                }else if(temp.val > prev.val){
                    prev.right = temp;
                }
            }
            //take the user input before exit of while loop
            System.out.println("Do you want to continue:y/n");
            String choice = scanner.next();
            ch = choice.charAt(0);
        }

        traverse(root);

    }

    public static void traverse(Node root){
        if(root == null){
            return;
        }
        traverse(root.left);
        System.out.print(root.val + " ");
        traverse(root.right);
    }


}
