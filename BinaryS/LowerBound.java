package BinaryS;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,11,12,19};
        int x = 5 ;
        int ind = lowerbound(arr, x);
        System.out.println("The lower bound is the index: " + ind);
    }
    static int lowerbound(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;
    }
}
