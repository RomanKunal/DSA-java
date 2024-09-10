package Array;

import java.util.ArrayList;

public class Leader_Element {
    public static void main(String[] args) {
        int[] arr={4,7,1,0};
        System.out.println(optimal(arr));

    }
//    static void brute(int[]arr){
//
//        for (int i = 0; i <arr.length ; i++) {
//            boolean isleader=true;
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[j]>arr[i]){
//                    isleader=false;
//                    break;
//                }
//            }
//            if(isleader){
//                System.out.print(arr[i]+" ");
//            }
//        }
//    }


    //optimal
    static ArrayList<Integer> optimal(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int max=arr[arr.length-1];
        ans.add(max);
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        return ans;
    }
}
