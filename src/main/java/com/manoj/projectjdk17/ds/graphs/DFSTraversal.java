package com.manoj.projectjdk17.ds.graphs;

import java.util.HashMap;
import java.util.List;

public class DFSTraversal {


    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> graph = DefineGraph.getGraph();

        // source is nothing but from where we start the navigation
        (new DFSTraversal()).depthFirstSearch(graph, 0, 7);
    }

    private void depthFirstSearch(HashMap<Integer, List<Integer>> graph, int i, int i1) {
        
    }


}
