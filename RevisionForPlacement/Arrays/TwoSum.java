package RevisionForPlacement.Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

    }
    static String check(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        Arrays.sort(arr);
        while (left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return "YES";
            } else if (sum<target) {
                left++;
            }else{
                right--;
            }
        }
        return "NO";
    }
}
