package BinaryS;

public class SQRT {
    public static void main(String[] args) {
        int n=28;
        System.out.println(floorSqrt(n));
    }
//    static int brute(int n){
//        int ans=0;
//        for (long i = 1; i <=n ; i++) {
//            long val=i*i;
//            if(val<=(long)n){
//                ans=(int) i;
//            }
//            else {
//                break;
//            }
//        }return ans;
//    }

    public static int floorSqrt(int n) {
        int low = 1, high = n;
        //Binary search on the answers:
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= (long)(n)) {
                //eliminate the left half:
                low = (int)(mid + 1);
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return high;
    }
}
