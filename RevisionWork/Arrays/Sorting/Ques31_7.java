package RevisionWork.Arrays.Sorting;
import java.util.*;
public class Ques31_7 {
    public static void main(String[] args) {
//        int[] arr={2, 4, 7, 10, 15, 20};
//        int target=20;
//        System.out.println(binarySearch(arr,target));
//        int[] arr= {3, 5, 8, 15, 19};
//        System.out.println(lowerBound(arr,9));
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(minimumElement(arr));


    }
    // binary search
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    // Lower Bound
    static int lowerBound(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    // Upper Bound
    static int upperBound(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    // Find the last occurence of the digit
    static int lastOccurence(int[] arr,int element){
        int low=0;
        int high=arr.length-1;
        int res=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==element){
                res=mid;
                low=mid+1;
            } else if (arr[mid]<element) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    // Search element in sorted array
    static int searchSorted(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    // Minimum element in array
    static int minimumElement(int[] arr) {
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }
            // Left part is sorted
            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            // Right part is sorted
            else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

}
