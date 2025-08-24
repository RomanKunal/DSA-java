package RevisionWork.Arrays.Sorting.DP;

import java.util.HashMap;

public class Fibonacci {
    // keep map as a static variable (shared across recursive calls)
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (map.containsKey(n)) return map.get(n);

        int res = fib(n - 1) + fib(n - 2);
        map.put(n, res);
        return res;
    }
}
