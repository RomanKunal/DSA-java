package BinaryS;

public class Search_Insert {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int x=5;
        System.out.println(search(arr,x));

    }
    static int search(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
