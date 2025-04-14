package RevisionForPlacement.Arrays;

public class Buy_Sell {
    public static void main(String[] args) {

    }
    static int profit(int[] arr){
        int maxpro=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]>arr[i]){
                    maxpro=Math.max(arr[j]-arr[i],maxpro);
                }
            }
        }
        return maxpro;
    }
}
