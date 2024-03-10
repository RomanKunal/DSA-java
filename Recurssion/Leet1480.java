package Recurssion;

import java.util.Arrays;

public class Leet1480 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(Arrays.toString(check(arr)));
    }
    static int[] check(int[] nums){

        int[] arr1=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                arr1[i]=nums[i];
            }else{
                arr1[i]=nums[i]+arr1[i-1];
            }

        }
        return arr1;
    }

}
