package RevisionWork.Arrays.Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
//        System.out.println(largest(arr));
//        System.out.println(sortedcheck(arr));
//        int [] arr2={1,2,1,1,2,3};
//        int []res=removingduplicates(arr2);
//        System.out.println(Arrays.toString(res));
//
//        int[] res=rotate(arr);
//        System.out.println(Arrays.toString(arr));
//        rotateArr(arr,2);
//        System.out.println(Arrays.toString(arr));
//        int[] arr1={1,2,2,1,3,3,4};
//        System.out.println(appearOnce(arr1));
        System.out.println(prefixSum(arr,5));


    }
    static int largest(int[] arr){
        int min=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>min){
                min=arr[i];
            }
        }
        return min;
    }
    //checking array is sorted or not
    static boolean sortedcheck(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    // removing duplicates
    static int[] removingduplicates(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for (int i:arr) {
            set.add(i);
        }
        int[] res=new int[arr.length];
        int i=0;
        for (int e:set) {
            res[i++]=e;
        }
        return res;
    }
    // Left rotate by one
    static int[] rotate(int[] arr){
        int ele=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=ele;
        return arr;
    }
    // Rotate by K element
    static void rotateArr(int[] arr,int k){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
    }
    static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    // element which appear once only return that
    static int appearOnce(int[] arr){
        int res=0;
        for (int i:arr) {
            res^=i;
        }
        return res;
    }
    // Prefix Sum
    static int prefixSum(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int len=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=i;
            if(sum==k){
                len=i+1;
            }
            if(map.containsKey(sum-k)){
                len=Math.max(len,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
}
