package RevisionWork.Arrays.Sorting;
import java.util.*;
public class Ques2_8 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int limit=8;
        System.out.println(minimumDivisor(arr,limit));

    }
    //Minimum divisor
    static int minimumDivisor(int[] arr,int limit){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int total=getSum(arr,mid);
            if(total<=limit){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    static int getSum(int[] arr,int div){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=Math.ceil((double)arr[i]/div);
        }
        return sum;
    }
    // Ship Problem
    static int minimumDays(int[] arr,int days){
        int low=Integer.MAX_VALUE;
        int high=0;
        for (int i = 0; i < arr.length; i++) {
            high+=arr[i];
            low=Math.max(low,arr[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int total=findDays(arr,mid);
            if(total<=days) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    static int findDays(int[] arr,int cap){
        int load=0;
        int days=1;
        for (int i = 0; i < arr.length; i++) {
            if(load+arr[i]>cap){
                days+=1;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return days;
    }
    // Kth missing number
    static int kmissingNumber(int[] arr,int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
    // Allocate minimum number of pages to student
    static int minimumNumberofPages(int[] arr,int m){
        int low=getMax(arr);
        int high=getSum(arr);
        int res=-1;
        while(low<=high){
            int mid=low+high/2;
            if(isvalid(arr,mid,m)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;

    }
    static boolean isvalid(int[] arr,int maxpages,int m){
        int current=0;
        int student=1;
        for (int pages:arr) {
            if(pages+current>maxpages){
                student++;
                current=pages;
                if(student>m) return false;
            }else{
                current+=pages;
            }
        }
        return true;
    }
    static int getMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    static int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    // Split Array
    static int splitArray(int[] arr, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;

        for (int i = 0; i < arr.length; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (countPartition(arr, mid) <= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static int countPartition(int[] arr, int maxSum) {
        int part = 1;
        long subarray = 0;

        for (int i = 0; i < arr.length; i++) {
            if (subarray + arr[i] <= maxSum) {
                subarray += arr[i];
            } else {
                part++;
                subarray = arr[i];
            }
        }

        return part;
    }
    // median of two sorted array
    static double medianOfTwoSorted(int[] arr,int[] arr2){
        if(arr.length>arr2.length) return medianOfTwoSorted(arr2,arr);
        int n=arr.length+arr2.length;
        int left=(arr.length+arr2.length)/2;
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1 = (mid1 > 0) ? arr[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < arr.length) ? arr[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < arr2.length) ? arr2[mid2] : Integer.MAX_VALUE;
            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
}
