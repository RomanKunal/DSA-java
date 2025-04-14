package RevisionForPlacement.Arrays;

public class Sumcheck {
    public static void main(String[] args) {
        int[] arr={-1,1,1};
        System.out.println(check(arr,1));

    }
    static int check(int[] arr,int k){
        int len=0;
        for (int i = 0; i < arr.length ; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum==k){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}
