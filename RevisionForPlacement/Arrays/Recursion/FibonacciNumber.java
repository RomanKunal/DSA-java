package RevisionForPlacement.Arrays.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n));
    }

    static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }
}
