package RevisionWork.Arrays.Sorting;
import java.util.*;
public class Ques3_8 {
    public static void main(String[] args) {
//        int[][] arr={{1,1,1},{0,0,1},{0,0,0}};
//        System.out.println(rowOnes(arr));
        int[][] arr={{1,2,3,4},{5,6,7,0},{9,10,11,12}};
        System.out.println(searchIn2D(arr,8));

    }
    // Find row which has max ones
    static int rowOnes(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        int maxones=0;
        int index=-1;
        for (int i = 0; i <rows ; i++) {
            int count=0;
            for (int j = 0; j <cols ; j++) {
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>maxones){
                maxones=count;
                index=i;
            }
        }
        return index;
    }
    // Search in 2D matrix
    static boolean binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    static boolean searchIn2D(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        for (int i = 0; i <rows ; i++) {
            if(arr[i][0]<=target && target<=arr[i][cols-1]){
                return binarySearch(arr[i],target);
            }
        }
        return false;
    }
    // Search in 2D matrix
    static boolean search2D(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
        int row=0;
        int col=rows-1;
        while(row<rows && col>0){
            if(arr[row][col]==target){
                return true;
            } else if (arr[row][col]<target) {
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
    // find peak element in 2D matrix
    static int maxElementinRow(int[][]arr,int col){
        int maxrow=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i][col]>arr[maxrow][col]){
                maxrow=i;
            }
        }
        return maxrow;
    }
    static ArrayList<Integer> peakElement(int[][] arr){
        int cols=arr[0].length;
        int low=0;
        int high=cols-1;
        while(low<=high){
            int mid=(low+high)/2;
            int maxrow=maxElementinRow(arr,mid);
            int midval=arr[maxrow][mid];
            int leftVal=(mid-1>0)?arr[maxrow][mid-1]:-1;
            int rightVal=(mid+1<cols)?arr[maxrow][mid+1]:-1;
            if(midval>leftVal && midval>rightVal){
                ArrayList<Integer> res=new ArrayList<>();
                res.add(maxrow);
                res.add(mid);
                return res;
            } else if (leftVal>midval) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new ArrayList<>();
    }
}
