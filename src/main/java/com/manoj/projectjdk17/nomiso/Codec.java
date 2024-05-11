package com.manoj.projectjdk17.nomiso;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return "";
            StringBuilder builder = new StringBuilder();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int lastNotNullIndex = -1;
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(node == null){
                    builder.append("null ");
                    continue;
                }
                builder.append(node.val + " ");
                queue.add(node.left);
                queue.add(node.right);

            }
            return builder.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {

            if(data == "")
                return null;

            String[] arr = data.split(" ");
            if(arr[0] == null){
                return  null;
            }
            TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int i = 1;
            while ( i < arr.length){
                TreeNode head = queue.poll();
                if(!arr[i].equalsIgnoreCase("null")) {
                    head.left = new TreeNode(Integer.parseInt(arr[i]));
                    queue.add(head.left);
                }
                i++;
                if( i < arr.length && !arr[i].equalsIgnoreCase("null")) {
                    head.right = new TreeNode(Integer.parseInt(arr[i]));
                    queue.add(head.right);
                }
                i++;
            }
            return root;
        }
    }
