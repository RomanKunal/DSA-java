package RevisionWork.Arrays.Sorting.Recursion;

public class Ques_8_8 {
    public static void main(String[] args) {
//        nameCall("Kunal", 5);
//        printNum(1,4);
//        printSum(0,10);
//        System.out.println(PrintSumUsingFunction(10));
//        System.out.println(calFactorial(5));
//        System.out.println(reverseString("kunal"));
//        int[] arr = {1, 2, 3, 4, 5};
//        reverseArray(arr, 0, arr.length - 1);
//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        System.out.println(generateFib(4));
        System.out.println(power(2,5));
        System.out.println(gcd(48,18));
    }

    // Print name N times using recursion
    static void nameCall(String name, int n) {
        if (n <= 0) {
            return; // Base case
        }
        System.out.println(name); // Action
        nameCall(name, n - 1);    // Recursive call
    }
    // Print 1 to N
    static void printNum(int curr,int n){
        if (curr>n){
            return;
        }
        System.out.println(curr);
        printNum(curr+1,n);
    }

    // Print sum of first N number
    static void printSum(int sum,int n){
        if (n<1){
            System.out.println(sum);
            return;
        }
        printSum(sum+n,n-1);
    }
    static int PrintSumUsingFunction(int n){
        if (n==0) return 0;
        return n+PrintSumUsingFunction(n-1);
    }
    // factorial using recrusion
    static int calFactorial(int n){
        if(n==0) return 1;
        return n*calFactorial(n-1);
    }
    // Reverse a String
    static String reverseString(String str){
        if (str.length()<=1) return str;
        return reverseString(str.substring(1))+str.charAt(0);
    }
    // Reverse an array
    static void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void reverseArray(int[] arr,int left,int right){
        if (left>=right) return;
        swap(arr,left,right);
        reverseArray(arr,left+1,right-1);
    }
    // Fibonacci number
    static int generateFib(int n){
        if(n<=1) return n;
        return generateFib(n-1)+generateFib(n-2);
    }
    // Power Case
    static int power(int x,int n){
        if (n==0) return 1;
        return x*power(x,n-1);
    }
    // Count the digit
    static int countDigit(int num){
        if (num==0) return 0;
        return 1+countDigit(num/10);
    }
    // GCD
    static int gcd(int a,int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    //

}
