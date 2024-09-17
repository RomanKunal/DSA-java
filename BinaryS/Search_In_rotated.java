package BinaryS;

public class Search_In_rotated {
    public static void main(String[] args) {
        int[] arr={7, 8, 9, 1, 2, 3, 4, 5, 6};
        int target=1;
        System.out.println(check(arr,target));

    }
    static int check(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else {
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
