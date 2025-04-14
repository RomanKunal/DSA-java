package RevisionForPlacement.Arrays;
import java.util.HashMap;
import java.util.*;
public class AppearOnce {
    public static void main(String[] args) {

    }
    static int element(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            int val=map.getOrDefault(arr[i],0);
            map.put(arr[i],val+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }
}
