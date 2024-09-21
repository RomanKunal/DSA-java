package BinaryS;

public class MinimumDaysForShip {
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = mini(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
    static int finddays(int[] arr,int capacity){
        int day=1;
        int load=0;
        for (int i = 0; i <arr.length; i++) {
            if(load+arr[i]>capacity){
                day++;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return day;
    }

    static int mini(int[] arr,int days){
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi=Math.max(arr[i],maxi);
        }
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
//        for (int i = maxi; i <=sum ; i++) {
//            if(finddays(arr,i)<=days){
//                return i;
//            }
//        }
//        return -1;
        int low=maxi;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(finddays(arr,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
