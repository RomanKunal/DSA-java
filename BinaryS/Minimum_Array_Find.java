package BinaryS;

public class Minimum_Array_Find {
    public static void main(String[] args) {
        int[] arr={7,8,12,3,4,5,6};
        System.out.println(search(arr));
    }
    static int search(int[] nums){
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                ans=Math.min(nums[low],ans);
                low=mid+1;
            }
            else{
                ans=Math.min(nums[mid],ans);
                high=mid-1;
            }
        }
        return ans;
    }
}
