package com.manoj.projectjdk17.ds.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraversal {

    public static void main(String[] args) {
        // get the graph in hashmap presentation
        HashMap<Integer, List<Integer>> graph = DefineGraph.getGraph();

        // source is nothing but from where we start the navigation
        (new BFSTraversal()).breadthFirstSearch(graph, 0, 7);
    }


    public void breadthFirstSearch(HashMap<Integer, List<Integer>> graph, int source, int noOfNodes){

        int[] visited = new int[noOfNodes];
        printVisitedArray(visited);

        Queue queue = new LinkedList();
        queue.add(source);
        visited[source] = 1;
        System.out.print(source + ",");
        while (!queue.isEmpty()){
            int current = (int) queue.poll();
            List<Integer> adjacents = graph.get(current);
            for(int node: adjacents){
                if(visited[node] == 0) {
                    queue.add(node);
                    visited[node] = 1;
                    System.out.print(node + ",");
                }
            }  // All the adjacent nodes visited

        }


    }

    private static void printVisitedArray(int[] visited) {
        System.out.print("Visited array:  ");
        for (int i = 0; i < visited.length ; i++) {
            System.out.print(i + ":" + visited[i] + ", ");
        }
        System.out.println();
    }


}
