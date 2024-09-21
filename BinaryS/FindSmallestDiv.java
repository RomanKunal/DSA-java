package BinaryS;
import java.util.*;
public class FindSmallestDiv {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = check(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
//    static int max(int[] arr,int limit){
//        int maxi=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            maxi=Math.max(arr[i],maxi);
//        }
//        for (int d =1 ; d <=maxi ; d++) {
//            int sum=0;
//            for (int i = 0; i <arr.length ; i++) {
//                sum += Math.ceil((double)(arr[i]) / (double)(d));            }
//            if (sum<=limit){
//                return d;
//            }
//        }
//        return -1;
//    }

    static int sumD(int[] arr,int d){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double)(arr[i]) / (double)(d));
        }
        return sum;
    }

    static int check(int[]arr,int limit){
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi=Math.max(arr[i],maxi);
        }
        if(arr.length>limit){
            return -1;
        }
        int low=1;
        int high=maxi;
        while (low<=high){
            int mid=(low+high)/2;
            if(sumD(arr,mid)<=limit){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
