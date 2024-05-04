package com.manoj.projectjdk17.nomiso;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserialize {

    public String serialize(Node node){

        if(node == null){
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        int lastNonNullIndex = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                if (currentNode == null) {
                    stringBuilder.append("null,");
                } else {
                    stringBuilder.append(currentNode.val).append(",");
                    queue.offer(currentNode.left);
                    queue.offer(currentNode.right);
                    lastNonNullIndex = stringBuilder.length();
                }
            }
        }

        if (lastNonNullIndex > 0 && lastNonNullIndex < stringBuilder.length()) {
            stringBuilder.setLength(lastNonNullIndex - 1); // Adjust length to cut off extra commas and nulls
        }
        return stringBuilder.toString();
    }

    public Node deSerialize(String input){
        if(input == null || input.isEmpty()){
            return null;
        }
        String[] elements = input.split(",");

        Node node = new Node(Integer.parseInt(elements[0]));

        int i = 1;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty() && i < elements.length) {

            Node currentNode = queue.poll();

            if(!elements[i].equals("null")){

                currentNode.left = new Node(Integer.parseInt(elements[i]));
                queue.offer(currentNode.left);

            }

            i++;

            if(i < elements.length && !elements[i].equals("null")){

                currentNode.right = new Node(Integer.parseInt(elements[i]));
                queue.offer(currentNode.right);
            }
            i++;
        }
        return node;
    }
}
