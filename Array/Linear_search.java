package Array;

public class Linear_search {
    public static void main(String[] args) {
        int [] arr={6,7,8,4,1};
        int target=4;
        linear(arr,target);
    }
    static int linear(int[] arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }
        return -1;
    }
}
