package Array;

public class Buy_Stock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(optimal(arr));

    }
//    static int brute(int[] arr){
//        int maxprofit=0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[j]>arr[i]){
//                    maxprofit=Math.max(arr[j]-arr[i],maxprofit);
//                }
//            }
//        }return maxprofit;
//    }


    static int optimal(int[]arr){
        int maxprofit=0;
        int minprice=Integer.MAX_VALUE;

        for (int i = 1; i <arr.length ; i++) {
            int cost=arr[i]-minprice;
            maxprofit=Math.max(cost,maxprofit);
            minprice=Math.min(minprice,arr[i]);
        }
        return maxprofit;
    }
}
