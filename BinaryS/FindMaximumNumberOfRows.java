package BinaryS;

public class FindMaximumNumberOfRows {
    public static void main(String[] args) {
        int[][]arr={{0,0,1,1,1},{0,0,0,0,0},{0,1,1,1,1},{1,1,1,1,1}};
        System.out.println(brute(arr));
    }
    static int brute(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int index=-1;
        int max=0;
        for (int i = 0; i <n ; i++) {
            int count=0;
            for (int j = 0; j <m ; j++) {
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                index=i;
            }
        }
        return index;
    }
}
