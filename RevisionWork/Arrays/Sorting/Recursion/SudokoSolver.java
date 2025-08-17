package RevisionWork.Arrays.Sorting.Recursion;
import java.util.*;
public class SudokoSolver {
    public static void main(String[] args) {

    }
    static boolean solve(List<List<Character>> board){
        int row=board.size();
        int col=board.get(0).size();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(board.get(i).get(j)=='.'){
                    for (char k = '1'; k <='9' ; k++) {
                        if(isValid(board,i,j,k)){
                            board.get(i).set(j,k);
                        }else{
                            board.get(i).set(j,'.');
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isValid(List<List<Character>> board,int row,int col,char c){
        for (int i = 0; i <9 ; i++) {
            if (board.get(row).get(i)==c) return false;
        }
        for (int i = 0; i < 9; i++) {
            if(board.get(i).get(col)==c) return false;
        }
        int startrow=(row/3)*3;
        int startcol=(col/3)*3;
        for (int i = startrow; i <startrow+3 ; i++) {
            for (int j =startcol; j < startcol+3; j++) {
                if(board.get(i).get(j)==c){
                    return false;
                }
            }
        }
        return true;
    }
    // Palindrome partitioning
    static List<List<String>> part(String s){
        List<List<String>> res=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        partioning(0,s,res,ans);
        return res;
    }
    static void partioning(int index,String str,List<List<String>> res,List<String> ans){
        if(str.length()==index){
            res.add(new ArrayList<>(ans));
            return ;
        }
        for (int i = index; i <str.length() ; i++) {
            if(isPalindrome(str,index,i)){
                ans.add(str.substring(index,i+1));
                partioning(i+1,str,res,ans);
                ans.remove(ans.size()-1);
            }
        }
    }
    static boolean isPalindrome(String str,int start,int end){
        while(start<=end){
            if(str.charAt(start++)!=str.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    // Word Search
    static boolean exist(char[][] board,String word){
        int row=board.length;
        int col=board[0].length;
        int index=0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if(board[i][j]==word.charAt(index)){
                    if(searchnext(board,word,i,j,index,row,col));
                    return true;
                }
            }
        }
        return false;
    }
    static boolean searchnext(char[][] board,String word,int i,int j,int index,int row,int col){
        if(index==word.length()) return true;
        // Checking boundaries
        if(row<0 || col<0 || i==row || j==col || board[row][col]!=word.charAt(index) || board[row][col]=='!'){
            return false;
        }
        char ch=board[row][col];
        board[row][col]='!';
        boolean top=searchnext(board,word,i-1,j,index+1,row,col);
        boolean right=searchnext(board,word,i,j+1,index+1,row,col);
        boolean bottom=searchnext(board,word,i+1,j,index+1,row,col);
        boolean left=searchnext(board,word,i,j-1,index+1,row,col);
        board[row][col]=ch;
        return top || right||bottom||left;
    }
    // Rat in a maze problem
    static void solveRatProblem(int row,int col,int[][] maze,int n,ArrayList<String> res,String move,int[][] vis){
        if(row==n-1 && col==n-1){
            res.add(move);
            return;
        }
        // downward direction
        if(row+1<n && vis[row+1][col]==0 && maze[row+1][col]==1){
            vis[row][col]=1;
            solveRatProblem(row+1,col,maze,n,res,move+"D",vis);
            vis[row][col]=0;
        }
        //left
        if(col-1>=0 && vis[row][col-1]==0 && maze[row][col-1]==1){
            vis[row][col]=1;
            solveRatProblem(row,col-1,maze,n,res,move+"L",vis);
            vis[row][col]=0;
        }
        //right
        if(col+1<n && vis[row][col+1]==0 && maze[row][col+1]==1){
            vis[row][col]=1;
            solveRatProblem(row,col+1,maze,n,res,move+"R",vis);
            vis[row][col]=0;
        }
        // top
        if(row-1>=0 && vis[row-1][col]==0 && maze[row-1][col]==1) {
            vis[row][col] = 1;
            solveRatProblem(row - 1, col, maze, n, res, move + "T", vis);
            vis[row][col] = 0;
        }

    }
}
