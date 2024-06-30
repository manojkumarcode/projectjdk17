package com.manoj.projectjdk17.ds.graphs;

import java.util.HashMap;
import java.util.List;

public class BFSTraversal {

    public static void main(String[] args) {
        // get the graph in hashmap presentation
        HashMap<Integer, List<Integer>> graph = DefineGraph.getGraph();

        // source is nothing but from where we start the navigation
        (new BFSTraversal()).breadthFirstSearch(graph, 0, 7);
    }


    public void breadthFirstSearch(HashMap<Integer, List<Integer>> graph, int source, int noOfNodes){

        int[] visited = new int[noOfNodes];
        System.out.print("Visited array:  ");
        for (int i = 0; i < visited.length ; i++) {
            System.out.print(i + ":" + visited[i] + ", ");
        }
        System.out.println();

    }
}
