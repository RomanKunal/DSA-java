package Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {

    }
    static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);
        for (Integer i:arr.get(node)) {
            if(!vis[i]){
                dfs(i,vis,arr,ls);
            }
        }
    }
    static ArrayList<Integer> call(int v,ArrayList<ArrayList<Integer>> arr){
        ArrayList<Integer> ls=new ArrayList<>();
        boolean[] vis=new boolean[v+1];
        vis[0]=true;
        dfs(0,vis,arr,ls);
        return ls;
    }
}
