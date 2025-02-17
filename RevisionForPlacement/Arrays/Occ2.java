package RevisionForPlacement.Arrays;

public class Occ2 {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,4,4,5};
        System.out.println(check(arr));
    }
    static int check(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==num){
                    count++;
                }
            }
            if (count==1){
                return num;
            }
        }
        return -1;
    }
}
