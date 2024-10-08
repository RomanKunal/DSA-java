package BinaryS;

public class Intro {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        System.out.println(search(arr,8));
    }
    static int search(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            } else if (target>nums[mid]) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

}
