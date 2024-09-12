package Array;

import java.util.ArrayList;
import java.util.List;

public class Count_three {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,2};
        List<Integer> ans=new ArrayList<>();
        ans=count(arr);
        System.out.println(ans);
    }
    static List<Integer> count(int[] arr){
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
                if (count >(arr.length)/3) {
                    res.add(arr[i]);
                }
            }
        }
        return res;
    }
}
