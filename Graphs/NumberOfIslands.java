package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
public class NumberOfIslands {
    public static void main(String[] args) {

    }
    static void bfs(int row,int col,int[][]vis,char[][] grid){
        vis[row][col]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            int ro=q.poll().first;
            int co=q.poll().second;
            q.remove();

            // traverse
            for (int delrow = -1; delrow <=1 ; delrow++) {
                for (int delcol = -1; delcol <=1 ; delcol++) {
                    int nrow=ro+delrow;
                    int ncol=co+delcol;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol] =='1' && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                }

            }
        }
    }
    static int call(char[][]grid){
        int n= grid.length;
        int m=grid[0].length;
        int [][] vis=new int[m][n];
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }


}
