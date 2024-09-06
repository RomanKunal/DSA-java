package Array;

public class Missing_Number {
    public static void main(String[] args) {
        int [] arr={1,2,4,5};
        System.out.println(call(arr,5));
    }
//    static int call(int[] arr,int n){
//
//        for (int i = 1; i <n ; i++) {
//            int flag=0;
//            for (int j = 0; j <arr.length-1 ; j++) {
//                if(arr[j]==i) {
//                    flag = 1;
//                    break;
//                }
//            }if(flag==0){
//                return i;
//            }
//        }
//        return -1;
//
//    }

    //optimal code
    static int call(int[] arr,int n){
        int xor1=0;
        int xor2=0;
        for (int i = 0; i <n-1 ; i++) {
            xor1=xor1^(i+1);
            xor2=xor2^arr[i];
        }
        xor1=xor1^n;
        return xor1^xor2;
    }
}
