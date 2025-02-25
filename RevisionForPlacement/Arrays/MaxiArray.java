package RevisionForPlacement.Arrays;

public class MaxiArray {
    public static void main(String[] args) {
        long [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(check(arr));
    }
    static long check(long[] arr){
        long maxi=Long.MIN_VALUE;
        long sum=0;
        for (int i = 0; i < arr.length; i++) {
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
