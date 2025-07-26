package RevisionWork.Arrays.Sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {

    }
    static void mergesort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+high/2;
        mergesort(arr,low+1,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> res=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                res.add(arr[left]);
                left++;
            }else{
                res.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            res.add(arr[left]);
            left++;
        }
        while(right<=high){
            res.add(arr[right]);
            right++;
        }
    }
}
