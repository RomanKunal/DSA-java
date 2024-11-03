package Graphs;

public class Intro {
        public static void main(String[] args) {
            int node = 3;
            int edge = 3;
            int[][] adj = new int[node + 1][node + 1];

            // edge 1-2
            adj[1][2] = 1;
            adj[2][1] = 1;

            // edge 2-3
            adj[2][3] = 1;
            adj[3][2] = 1;

            // edge 1-3
            adj[1][3] = 1;
            adj[3][1] = 1;

            // Print the adjacency matrix
            System.out.println("Adjacency Matrix:");
            for (int i = 1; i <= node; i++) {
                for (int j = 1; j <= node; j++) {
                    System.out.print(adj[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
