package Array;

public class Consecutive_ones {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        System.out.println(call(arr));

    }
    static int call(int[] arr){
        int maximum=0;
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==1){
                count++;
                maximum=Math.max(maximum,count);
            }else{
                count=0;
            }
        }
        return maximum;
    }
}
