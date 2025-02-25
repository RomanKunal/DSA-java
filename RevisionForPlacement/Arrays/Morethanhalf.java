package RevisionForPlacement.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Morethanhalf {
    public static void main(String[] args) {

    }
    static int check(int[] arr){

        for (int i = 0; i <arr.length; i++) {
            int count=0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>(arr.length/2)){
                return arr[i];
            }
        }
        return -1;
    }
    static int call(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val=map.getOrDefault(arr[i],0);
            map.put(arr[i],val+1);
        }
        for (Map.Entry<Integer,Integer> i:map.entrySet()) {
            if (i.getValue()>n/2){
                return i.getKey();
            }
        }
        return -1;
    }
}
