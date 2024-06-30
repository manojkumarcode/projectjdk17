package com.manoj.projectjdk17.ds.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static com.manoj.projectjdk17.ds.graphs.DefineGraph.getGraph;
import static com.manoj.projectjdk17.ds.graphs.DefineGraph.printVisitedArray;

public class BFSTraversal {

    public static void main(String[] args) {
        // get the graph in hashmap presentation
        HashMap<Integer, List<Integer>> graph = getGraph();

        // source is nothing but from where we start the navigation
        (new BFSTraversal()).breadthFirstSearch(graph, 0, 7);
    }


    public void breadthFirstSearch(HashMap<Integer, List<Integer>> graph, int source, int noOfNodes){

        int[] visited = new int[noOfNodes];
        printVisitedArray(visited);

        Queue queue = new LinkedList();
        queue.add(source);
        visited[source] = 1;
        while (!queue.isEmpty()){
            int current = (int) queue.poll();
            //once we poll out we need to print the traversed element
            System.out.print(current + ", ");
            List<Integer> adjacents = graph.get(current);
            for(int node: adjacents){
                if(visited[node] == 0) {
                    queue.add(node);
                    visited[node] = 1;
                }
            }  // All the adjacent nodes visited

        } // queue loop ends here
        System.out.println();
        printVisitedArray(visited);


    }



}
