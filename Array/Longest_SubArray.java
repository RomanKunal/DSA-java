package Array;

public class Longest_SubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,1,3};
        System.out.println(call(arr,3));

    }
    static int call(int[] arr,int target){
        int len=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                int s=0;
                for (int k = i; k <=j; k++) {
                    s+=arr[k];
                }
                if(s==target){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}
