package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Rotate_Matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(brute(arr)));

    }
    static int[][] brute(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[][] res=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                res[j][n-i-1]=arr[i][j];
            }
        }
        return res;
    }
}
