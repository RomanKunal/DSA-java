package RevisionForPlacement.Arrays;

import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {

    }
    static int cons(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        if(arr.length==0){
            return 0;
        }
        //add element in the set
        int longest=0;
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }
        for (int i:set) {
            if(!set.contains(i-1)){
                int count=1;
                int x=i;
                while (set.contains(x+1)){
                    count++;
                    x++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;

    }
}
