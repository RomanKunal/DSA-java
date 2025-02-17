package RevisionForPlacement.Arrays;

public class Missingnumber {
    public static void main(String[] args) {
        int [] arr={1,2,4,5};
        System.out.println(check(arr,5));
    }
    static int check(int[] arr,int n){
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for (int i:arr) {
            sum2=sum2+i;
        }
        int res=sum1-sum2;
        return res;
    }
}
