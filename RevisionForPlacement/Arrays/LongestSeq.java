package RevisionForPlacement.Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSeq {
    public static void main(String[] args) {

    }
    static int check(int[] arr){
        Set<Integer> st=new HashSet<>();
        int longest=1;
        //put element in array
        for (int i = 0; i <arr.length ; i++) {
            st.add(arr[i]);
        }

        //find longest seq
        for (int i:st) {
            if(!st.contains(i-1)){
                int cnt=1;
                int x=i;
                while(st.contains(x+1)){
                    x=x+1;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}
