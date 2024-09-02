package Array;public class Check_Array_Sort {
    public static void main(String[] args) {
        int [] arr={3,1,6,7,88,88};
        System.out.println(check(arr));
    }
    static boolean check(int [] arr){
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>=arr[i-1]){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
