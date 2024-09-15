package Array;

import java.util.ArrayList;

public class Reverse_Pairs {
    public static void main(String[] args) {
        int[] arr={3,2,1,4};
        System.out.println(mergesort(arr,0,arr.length-1));
    }
//    static int brute(int[] nums){
//        int count=0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j <nums.length ; j++) {
//                if(nums[i]>2*nums[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }
        for (int i = low; i <=high ; i++) {
            arr[i]=temp.get(i-low);
        }
    }

    static int countpair(int[] arr,int low,int mid,int high){
        int right=mid+1;
        int count=0;
        for (int i = low; i <=mid ; i++) {
            while(right<=high && arr[i]>2*arr[right]){
                right++;
                count=count+(right-(mid+1));
            }
        }
        return count;
    }


    static int mergesort(int[] arr,int low,int high){
        int count=0;
        if(low>=high){
            return count;
        }
        int mid=(low+high)/2;
        count+=mergesort(arr,low,mid);
        count+=mergesort(arr,mid+1,high);
        count+=countpair(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }
}
