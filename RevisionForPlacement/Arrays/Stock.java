package RevisionForPlacement.Arrays;

public class Stock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6};
        System.out.println(check(arr));
    }
    static int check(int[] arr){
        int minprice=Integer.MAX_VALUE;
        int maxpro=0;
        for (int i = 0; i <arr.length ; i++) {
            minprice=Math.min(minprice,arr[i]);
            int profit=arr[i]-minprice;
            maxpro=Math.max(maxpro,profit);
        }
        return maxpro;
    }
}
