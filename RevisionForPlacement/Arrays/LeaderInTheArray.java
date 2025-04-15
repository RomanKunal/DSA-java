package RevisionForPlacement.Arrays;

import java.util.ArrayList;

public class LeaderInTheArray {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> check(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            boolean leader=true;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                ans.add(arr[i]);
            }
        }
        return ans;

    }
}
