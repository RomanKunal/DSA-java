package Array;

public class Counting_Inversion {
    public static void main(String[] args) {
        int[] arr={5,3,2,1,4};
        int count=0;
        System.out.println(brute(arr,count));
    }
    static int brute(int[] arr,int count){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
