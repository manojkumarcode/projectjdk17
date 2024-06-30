package com.manoj.projectjdk17.ds.graphs;

import java.util.HashMap;
import java.util.List;

public class DefineGraph {

    public static HashMap<Integer, List<Integer>> getGraph() {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, List.of(1, 4));
        map.put(1, List.of(0, 2, 4));
        map.put(2, List.of(1, 3, 5, 6));
        map.put(3, List.of(2, 6));
        map.put(4, List.of(0, 1, 5));
        map.put(5, List.of(2, 4, 6));
        map.put(6, List.of(2, 3, 5));
        return map;
    }

    public static void printVisitedArray(int[] visited) {
        System.out.print("Visited array:  ");
        for (int i = 0; i < visited.length ; i++) {
            System.out.print(i + ":" + visited[i] + ", ");
        }
        System.out.println();
    }

}
