package RevisionForPlacement.Arrays;

import java.util.ArrayList;

public class SpiralTraversal {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> check(int[][] mat){
        ArrayList<Integer> res=new ArrayList<>();
        int n=mat.length; //rows
        int m=mat[0].length; //cols
        int top=0;
        int left=0;
        int right=m-1;
        int bottom=n-1;
        while (top<=bottom && left<=right){
            //move left to right
            for (int i=left;i<right;i++){
                res.add(mat[top][i]);
            }
            top++;
            //move top to bottom
            for (int i=top;i<bottom;i++){
                res.add(mat[i][right]);
            }
            right--;
            //move right to left
            if(top<=bottom){
                for (int i = right; i <left ; i--) {
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            //bottom to top
            if(left<=right){
                for (int i = bottom; i <top ; i--) {
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
