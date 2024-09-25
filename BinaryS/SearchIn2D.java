package BinaryS;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=190;
        System.out.println(optimal(arr,target));
    }
    static boolean optimal(int[][] arr,int target){
        int n=arr.length;
        int m=arr[0].length;
        int low=0;
        int high=(n*m)-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
