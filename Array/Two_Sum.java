package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=14;
        int[] res=call(arr,target);
        System.out.println(Arrays.toString(res));

    }
    static int[] call(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] ans=new int[2];
        ans[0]=ans[1]=-1;
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            int req=target-a;
            if(map.containsKey(req)){
                ans[0]=map.get(req);
                ans[1]=i;
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
}
