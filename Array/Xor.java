package Array;

public class Xor {
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = brute(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
    static int brute(int[] arr,int k){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            int xor=0;
            for (int j = i; j <arr.length ; j++) {
                xor=xor^arr[j];
                if(xor==k) {
                    count++;
                }
            }
        }
        return count;
    }
}
