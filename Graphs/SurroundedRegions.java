package Graphs;

public class SurroundedRegions {
    public static void main(String[] args) {

    }
    static void dfs(int row,int col,int[][] vis,char [][] mat,int [] delrow,int[] delcol){
        vis[row][col]=1;
        int n=mat.length;
        int m=mat[0].length;
        for (int i = 0; i <4 ; i++) {
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && mat[nrow][ncol]=='O'){
                dfs(nrow,ncol,vis,mat,delrow,delcol);
            }
        }
    }
    static char[][] check(int n,int m,char[][]mat){
        int[] delrow={-1,0,+1,0};
        int [] delcol={0,1,0,-1};
        int[][] vis=new int[n][m];
        // CHECK FOR FIRST ROW and last row
        for (int i = 0; i <m ; i++) {
            //first row
            if(vis[0][i]==0 && mat[0][i]=='O'){
                dfs(0,i,vis,mat,delrow,delcol);
            }
            //last row
            if(vis[n-1][i]==0 && mat[n-1][i]=='O'){
                dfs(n-1,i,vis,mat,delrow,delcol);
            }
        }
        //check for column
        for (int j = 0; j <n ; j++) {
            //first col
            if(vis[j][0]==0 && mat[j][0]=='O'){
                dfs(j,0,vis,mat,delrow,delcol);
            }
            //last row
            if(vis[j][m-1]==0 && mat[j][m-1]=='O'){
                dfs(j,m-1,vis,mat,delrow,delcol);
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(vis[i][j]==0 && mat[i][j]=='O'){
                    mat[i][j]='X';
                }
            }
        }
        return mat;

    }
}
