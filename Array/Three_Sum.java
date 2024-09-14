package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        List<List<Integer>> ans=optimal(arr,0);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

    }
//    static List<List<Integer>> check(int[] arr,int sum){
//        HashSet<List<Integer>> st=new HashSet<>();
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                for (int k = j+1; k <arr.length ; k++) {
//                    if(arr[i]+arr[j]+arr[k]==sum){
//                        List<Integer> temp= Arrays.asList(arr[i],arr[j],arr[k]);
//                        temp.sort(null);
//                        st.add(temp);
//                    }
//                }
//            }
//        }
//        List<List<Integer>> res=new ArrayList<>(st);
//        return res;
//    }


    static List<List<Integer>> optimal(int [] nums){
        int sum=0;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k) {
                int sum1 = nums[i] + nums[j] + nums[k];
                if (sum1 > sum) {
                    k--;
                } else if (sum1 < sum) {
                    j++;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                }
                while (j < k && nums[j] == nums[j - 1]) {
                    j++;
                }
                while (j < k && nums[k] == nums[k - 1]) {
                    k--;
                }
            }
        }
        return ans;
    }
}
