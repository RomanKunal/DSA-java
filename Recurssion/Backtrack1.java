package Recurssion;

public class Backtrack1 {
    public static void main(String[] args) {
        //call(5);
        fib(5);
        System.out.println(fib(5));
    }
    /*static void call(int a){
        if(a<1){
            return;
        }
        call(a-1);
        System.out.println(a);
    }*/

    //Fibonacci
    static int fib(int a){
        if(a==0){
            return 0;
        }else {
            return a + fib(a-1);
        }

    }
}
