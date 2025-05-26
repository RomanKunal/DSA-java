package RevisionForPlacement.Arrays.Recursion;

public class Example1 {
    public static void main(String[] args) {
        int n=5;
        reverse(n);
    }
    static void reverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        reverse(n-1);
    }
}
