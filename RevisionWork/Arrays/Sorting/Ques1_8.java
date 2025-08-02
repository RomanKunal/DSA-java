package RevisionWork.Arrays.Sorting;
import java.util.*;
public class Ques1_8 {
    public static void main(String[] args) {
//        int[] arr={1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
//        System.out.println(singleElement(arr));
//        int [] arr={1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
////        System.out.println(peakElement(arr));
//        int[] arr= {7, 15, 6, 3};
//        int h=8;
//        System.out.println(kokoBanana(arr,h));
        int [] arr={7, 7, 7, 7, 13, 11, 12, 7};
        int k=3;
        int m=2;
        System.out.println(minimumDays(arr,k,m));

    }
    // Single element in the binarySearch
    static int singleElement(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid+1] &&arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if(mid%2==1 && arr[mid]==arr[mid-1] || mid%2==1 && arr[mid]==arr[mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    // Peak Element
    static int peakElement(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1] &&arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    // Koko Eating bananas
    static int kokoBanana(int[] arr,int hour){
        int low=0;
        int high=findMax(arr);
        while(low<=high){
            int mid=(low+high)/2;
            int totalHour=calculateHours(arr,mid);
            if(totalHour<=hour){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    static int calculateHours(int[] arr,int hourly){
        int n=arr.length;
        int total=0;
        for (int i = 0; i <n ; i++) {
            total += Math.ceil((double) arr[i] / hourly);
        }
        return total;
    }
    static int findMax(int[] arr){
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    // Minimum number of days for bouquet
    static boolean minimumBouqetPossible(int[] arr,int day,int m,int k){
        int count=0;
        int bouqet=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=day){
                count++;
            }else{
                bouqet+=count/k;
                count=0;
            }
        }
        bouqet+=count/k;
        return bouqet>=m;
    }
    static int minimumDays(int[] arr,int k,int m){
        int min=0;
        int max=0;
        long val=(long)k*m;
        if(val>arr.length) return -1;
        for (int i = 0; i <arr.length ; i++) {
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int low=min;
        int high=max;
        while (low<=high){
            int mid=(low+high)/2;
            if (minimumBouqetPossible(arr,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
}
