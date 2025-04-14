package RevisionForPlacement.Arrays;

public class KadaneAlog {
    public static void main(String[] args) {

    }
    static long check(int[] arr){
        long maxi=Long.MIN_VALUE;
        long sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}
