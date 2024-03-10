package Recurssion;

public class Recur3 {
    public static void main(String[] args) {
        //call(1);
        int arr[]={2,4,6,8,10};
        int s=0;
        int e=arr.length;
        System.out.println(search(arr,s,e,3));

    }
    /*static void call(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        call(n+1);
    }*/

    //BINARY SEARCH
    static int search(int[] arr,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target) {
            return search(arr,s,mid-1,target);
        }
        return search(arr, mid + 1, e, target);

    }

}
