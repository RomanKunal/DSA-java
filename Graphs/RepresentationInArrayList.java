package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class RepresentationInArrayList {
    public static void main(String[] args) {
        int node=3;
        int edge=3;
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for (int i = 0; i <node ; i++) {
            arr.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < edge; i++) {
            System.out.print("Enter node U: ");
            int u = sc.nextInt();
            System.out.print("Enter node V: ");
            int v = sc.nextInt();

            arr.get(u).add(v);
            arr.get(v).add(u); // For undirected graph
        }
        for (int i = 1; i <node ; i++) {
            for (int j = 0; j <arr.get(i).size() ; j++) {
                System.out.println(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
