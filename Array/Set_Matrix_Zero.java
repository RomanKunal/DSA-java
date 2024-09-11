package Array;

import java.util.Arrays;

public class Set_Matrix_Zero {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        int n = matrix.length;
        int m = matrix[0].length;
        brute(matrix,n,m);
        System.out.println(Arrays.deepToString(matrix));
    }
    static  void brute(int[][] arr,int n,int m){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    markRow(arr,n,m,i);
                    markCol(arr,n,m,j);
                }
            }
        }

        // Change -1 to 0
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
    }
    static void markRow(int[][] arr,int n,int m,int i){
        for (int j = 0; j < n; j++) {
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }
    static void markCol(int[][] arr,int n,int m,int j){
        for (int i = 0; i < m; i++) {
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }
}
