package Array;

import java.util.Arrays;

public class Next_Perm {
    public static void main(String[] args) {
        int[] arr={1,1,5};
        call(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void call(int[] nums){
        int index=-1;
        // find breakpoint
        for (int i = nums.length-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        for (int i = nums.length-1; i >=index ; i--) {
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        if(index==-1){
            reverse(nums,index+1, nums.length-1);
        }
    }
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
