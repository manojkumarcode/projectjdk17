package com.manoj.projectjdk17.nomiso;

public class BinarySearchTree3 {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 5, 6, 4, 20, 30, 15};
        Node root = createBST(arr);
        traverse(root);
        System.out.println("Integer.MIN_VALUE:" + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE:" + Integer.MAX_VALUE);
        System.out.println(IfTreeIsBST.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        LevelOrderTraversal.traverse(root);

    }

    private static Node createBST(int[] arr) {
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            Node temp = new Node(num);
            if( root == null){
                root = temp;
            }else{
                Node prev = null;
                Node head = root;
                while(head!=null){
                    prev = head;
                    if(head.val > num){
                        head = head.left;
                    } else if (head.val < num) {
                        head = head.right;
                    }else{
                        System.out.println("Duplicate value");
                        break;
                    }
                }
                if(prev.val > num){
                    prev.left = temp;
                } else if (prev.val < num) {
                    prev.right = temp;
                }

            }
        }

        return root;
    }



    public static void traverse(Node root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        System.out.print(root.val + " ");
        traverse(root.right);
    }


}
