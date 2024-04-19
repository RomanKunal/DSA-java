package Recurssion;

public class Maze1 {
    public static void main(String[] args) {
        System.out.println(maze(3,3));
        path(" ",3,3);

    }
    static int maze(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=maze(r-1,c);
        int right=maze(r,c-1);
        return left+right;
    }
    static void path(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        // Diagonal direction
        if(row>1 && col>1){
            path(p+"DIA",row-1,col-1);
        }
        if(row>1){
            path(p+"D",row-1,col);
        }
        if(col>1){
            path(p+"R",row,col-1);
        }
    }
}
