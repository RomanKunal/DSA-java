package RevisionForPlacement.Arrays;

import java.util.ArrayList;

public class MovingNonZero {
    public static void main(String[] args){

    }
    static ArrayList<Integer> call(int[] arr){
        int length=arr.length;
        ArrayList<Integer> newarr=new ArrayList<>();
        //copy non zero element
        for (int i = 0; i <length ; i++) {
            if(arr[i]!=0){
                newarr.add(arr[i]);
            }
        }
        //size of non zero element array
        int nl=newarr.size();
        
        //fill first with non zero
        for (int i = 0; i < nl; i++) {
            arr[i]=newarr.get(i);
        }
        //fill with zero now
        for (int i = nl; i <length ; i++) {
            arr[i]=0;
        }
        return newarr;
    }
}
