package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes and edges
        System.out.print("Enter the number of nodes: ");
        int node = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int edge = sc.nextInt();

        // Initialize adjacency list
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= node; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        // Input edges
        for (int i = 0; i < edge; i++) {
            System.out.print("Enter node U: ");
            int u = sc.nextInt();
            System.out.print("Enter node V: ");
            int v = sc.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u); // For undirected graph
        }

        // Perform BFS and print result
        ArrayList<Integer> bfsResult = bfsTraversal(node, adjList);
        System.out.println("BFS Traversal: " + bfsResult);

        sc.close();
    }

    // BFS function
    static ArrayList<Integer> bfsTraversal(int v, ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[v + 1]; // Use v + 1 to accommodate 1-based indexing
        Queue<Integer> q = new LinkedList<>();

        // Start BFS from node 1 (or any other start node as required)
        q.add(1);
        vis[1] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (Integer neighbor : adjList.get(node)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return bfs;
    }
}
