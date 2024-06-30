package com.manoj.projectjdk17.ds.graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import static com.manoj.projectjdk17.ds.graphs.DefineGraph.printVisitedArray;

public class DFSTraversal {


    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> graph = DefineGraph.getGraph();

        // source is nothing but from where we start the navigation
        (new DFSTraversal()).depthFirstSearch(graph, 0, 7);
    }

    private void depthFirstSearch(HashMap<Integer, List<Integer>> graph, int source, int noOfNodes) {
        int[] visited = new int[noOfNodes];
        printVisitedArray(visited);

        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        visited[source] = 1;

        while (!stack.empty()){
            Integer current = stack.pop();
            //once we pop out we need to print the traversed element
            System.out.print(current + ", ");
            List<Integer> adjacents = graph.get(current);
            for (int node : adjacents){
                if(visited[node] == 0){
                    stack.push(node);
                    visited[node] = 1;
                }
            } // all the nodes of current node has been visited


        } // stack look ends here

        System.out.println();
        printVisitedArray(visited);


    }



}
