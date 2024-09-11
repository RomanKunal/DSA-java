package Array;

import java.util.HashSet;

public class Longest_Conssecutive {
    public static void main(String[] args) {
        int[] arr={100,200,1,3,2,4};
        System.out.println(optimal(arr));

    }
//    static boolean linearSearch(int[] arr,int num){
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==num){
//                return true;
//            }
//        }
//        return false;
//    }
//    static int call(int[] arr){
//        int longest=1;
//        for (int i = 0; i <arr.length ; i++) {
//            int count=1;
//            int n=arr[i];
//            while (linearSearch(arr,n+1)==true){
//                n=n+1;
//                count+=1;
//            }
//            longest=Math.max(longest,count);
//        }
//        return longest;
//    }

    static int optimal(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        int longest=1;
        if(arr.length==0){
            return 0;
        }
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }
        for (int i:set) {
            if(!set.contains(i-1)) {
                int count = 1;
                int x = 1;
                while (set.contains(x + 1)) {
                    x += 1;
                    count += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
