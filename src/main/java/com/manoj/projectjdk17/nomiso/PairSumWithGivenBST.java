package com.manoj.projectjdk17.nomiso;

import java.util.HashSet;

public class PairSumWithGivenBST {
    public static void main(String[] args) {
        //int[] arr = {5,10,15,17,20,25,28,30,35,40};

        int[] arr = {20, 10, 30, 5, 15, 17, 40, 35, 25, 28};
        Node root = BinarySearchTree3.createBST(arr);
        System.out.println(root);
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 38;
        findPairSumInBST(root, sum, hashSet);
        System.out.println();
    }

    private static void findPairSumInBST(Node root, int sum, HashSet hashSet) {
        if (root == null) {
            return;
        }
        findPairSumInBST(root.left, sum, hashSet);
        int num = root.val;
        System.out.print(num + " ");
        if (hashSet.contains(sum - num)) {
            System.out.println("\n Pair Sum exits");
        } else {
            hashSet.add(root.val);
        }
        findPairSumInBST(root.right, sum, hashSet);
    }


}
