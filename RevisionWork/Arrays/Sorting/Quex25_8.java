package RevisionWork.Arrays.Sorting;

import java.util.Arrays;
import java.util.*;
public class Quex25_8 {
    public static void main(String[] args) {
        int[] arr={-2,3,2,-1};
        System.out.println(KadaneAlgo(arr));
        int[] arr2={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr2,k);
        System.out.println(Arrays.toString(arr2));


    }
    static int KadaneAlgo(int[] arr){
        int maxsum=arr[0];
        int curr=arr[0];
        for (int i = 0; i < arr.length; i++) {
            curr=Math.max(arr[i],curr+arr[i]);
            maxsum=Math.max(maxsum,curr);
        }
        return maxsum;
    }
    // Rotate array using k
    static void rotate(int[] arr,int k){
        int end=arr.length;
        k=k%end;
        reverse(arr,0,end-1);
        reverse(arr,0,k-1);
        reverse(arr,k,end-1);

    }
    static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    // Two sum
    static List<Integer> twosum(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        List<Integer> res=new ArrayList<>();
        while (start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                res.add(start);
                res.add(end);
                start++;
                end--;
            }
            if(sum>target){
                end--;
            }else{
                start++;
            }

        }
        return res;
    }
    // minimum window subarray
}
