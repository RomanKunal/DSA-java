package BinaryS;

public class Search_In_Sorted2 {
    public static void main(String[] args) {

    }
    static int search(int [] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[low]==arr[mid]&& arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            if(arr[mid]<=target){
                if(arr[low]<=target && target<=arr[mid]){
                    low=mid-1;

                }
            }
        }
        return -1;
    }
}
