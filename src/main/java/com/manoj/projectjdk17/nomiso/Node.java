package com.manoj.projectjdk17.nomiso;

public class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("val=").append(val);
        sb.append(", left=").append(left);
        sb.append(", right=").append(right);
        sb.append('}');
        return sb.toString();
    }
}
