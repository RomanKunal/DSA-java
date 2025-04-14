package RevisionForPlacement.Arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};
        int result = check(nums);
        if (result != -1)
            System.out.println("Majority element is: " + result);
        else
            System.out.println("No majority element found.");

    }

    static int check(int[] arr){
        // storing element in the hashmap
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=arr.length;
        for (int num:arr) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        //checking majority
        for (int num: map.keySet()) {
            if(map.get(num)>len/2){
                return num;
            }
        }
        return -1;
    }
}
