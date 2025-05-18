package RevisionForPlacement.Arrays;

import java.util.*;

public class CountSubarraySumDivisibleByK {
    public static void main(String[] args) {

    }
    static int number(int[] arr,int k){
        int count=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int num:arr) {
            sum+=arr[num];
            int mod=sum%k;
            if(mod<k) mod+=k;
            count+=map.getOrDefault(mod,0);
            map.put(mod,map.getOrDefault(mod,0)+1);
        }
        return count;
    }
}
