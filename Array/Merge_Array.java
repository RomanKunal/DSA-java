package Array;

import java.util.Arrays;

public class Merge_Array {
    public static void main(String[] args) {
        int[] arr1={1,4,8,10};
        int[] arr2={2,3,9};
        int m= arr1.length;
        int n= arr2.length;
        int[] res=merge(arr1,arr2,m,n);
        System.out.println(Arrays.toString(res));
    }
    static int[] merge(int[] arr1,int [] arr2,int n,int m){
        int left=0;
        int right=0;
        int index=0;
        int [] arr3=new int[n+m];
        while(left<n && right<m){
            if(arr1[left]<arr2[right]){
                arr3[index]=arr1[left];
                left++;
                index++;
            }
            else{
                arr3[index]=arr2[right];
                index++;
                right++;
            }
        }
        while(left<n){
            arr3[index++]=arr1[left++];
        }
        while(right<m){
            arr3[index++]=arr2[right++];
        }
        return arr3;
    }
}
