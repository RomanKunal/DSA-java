package BinaryS;

public class KokoProblem {
    public static void main(String[] args) {
        int[] arr={3,6,7,11};
        System.out.println(minimumbanana(arr,8));

    }
    static int findmax(int[]arr){
        int maxi=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i = 0; i <n ; i++) {
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }

    static int caltime(int[] arr,int hourly){
        int total=0;
        for (int i = 0; i <arr.length ; i++) {
            total+=Math.ceil((double) arr[i]/(double)hourly );
        }
        return total;
    }

//    static int minimumbanana(int[] arr,int h){
//        int maxi=findmax(arr);
//        for (int i = 1; i <=maxi ; i++) {
//            int reqtime=caltime(arr,i);
//            if (reqtime<=h){
//                return i;
//            }
//        }
//        return maxi;
//    }
    static int minimumbanana(int[] arr,int h){
        int low=0;
        int high=findmax(arr);
        while (low<=high){
            int mid=(low+high)/2;
            int reqtime=caltime(arr,mid);
            if (reqtime<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
