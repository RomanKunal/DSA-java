package RevisionWork.Arrays.Sorting.DP;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr={10,20,30,10};
        System.out.println(frog(arr));

    }
    static int frog(int[] arr){
        int prev2=0;
        int prev1=0;
        for (int i = 1; i <arr.length ; i++) {
            int jumptwo=Integer.MAX_VALUE;
            int jumpone=prev1+Math.abs(arr[i]-arr[i-1]);
            if(i>1) jumptwo=prev2+Math.abs(arr[i]-arr[i-2]);
            int curr=Math.min(jumpone,jumptwo);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    // having k
    static int frogwithKValue(int[] arr,int k,int n){
        int [] dp=new int[arr.length+1];
        dp[0]=0;
        for (int i = 1; i <arr.length ; i++) {
            int minsteps=Integer.MAX_VALUE;
            for (int j = 1; j <k ; j++) {
                if(i-j>0){
                    int jumps=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                    minsteps=Math.min(jumps,minsteps);
                }
            }
            dp[i]=minsteps;
        }
        return dp[n-1];
    }
}
