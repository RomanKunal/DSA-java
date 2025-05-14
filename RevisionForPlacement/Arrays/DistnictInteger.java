package RevisionForPlacement.Arrays;
import java.util.*;
public class DistnictInteger {
    public static void main(String[] args) {

    }
    static int check(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int left=0;
        for (int r = 0; r <arr.length ; r++) {
            int ele=arr[r];
            map.put(ele,map.getOrDefault(ele,0)+1);
            while (map.size() > k) {
                int leftNum = arr[left];
                map.put(leftNum, map.get(leftNum) - 1);
                if (map.get(leftNum) == 0) {
                    map.remove(leftNum);
                }
                left++;
            }

            count += r - left + 1;
        }

        return count;

    }
}
