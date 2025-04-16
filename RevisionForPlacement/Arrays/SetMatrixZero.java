package RevisionForPlacement.Arrays;

import java.util.ArrayList;

public class SetMatrixZero {
    public static void main(String[] args) {

    }
    static void markrow(ArrayList<ArrayList<Integer>> matrix,int col,int row,int i){
        for (int j = 0; j <row ; j++) {
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    static void markcol(ArrayList<ArrayList<Integer>> matrix,int col,int row,int j){
        for (int i = 0; j <col ; i++) {
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    static ArrayList<ArrayList<Integer>> set(ArrayList<ArrayList<Integer>> matrix,int row,int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix.get(i).get(j)==0){
                    markrow(matrix,row,col,i);
                    markcol(matrix,row,col,j);
                }
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
}
