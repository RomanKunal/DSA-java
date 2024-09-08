package Array;

public class Majority_Element {
    public static void main(String[] args) {
        int [] arr={2,2,3,3,1,2,2};
        int count=0;
        int element=0;
        System.out.println(optimal(arr,element,count));

    }
    // Brute Force
//    static int brute(int[] arr){
//        for (int i = 0; i <arr.length ; i++) {
//            int count=0;
//            for (int j = 0; j <arr.length ; j++) {
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count>(arr.length/2)){
//                return arr[i];
//            }
//        }
//        return -1;
//    }




    // OPTIMAL   MOORE ALGORITHM
    static int optimal(int[] arr,int element,int count){
        for (int i = 0; i <arr.length ; i++) {
            if(count==0){
                element=arr[i];
                count=1;
            } else if (element==arr[i]) {
                count++;
            }else{
                count--;
            }
        }

        // check if the majority element is right
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                cnt++;
            }
        }
        if(cnt>(arr.length/2)){
            return element;
        }
        return -1;
    }

}
