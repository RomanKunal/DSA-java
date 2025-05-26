package RevisionForPlacement.Arrays.Recursion;

public class Example2 {
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Kunal"+ n + "times");
        print(n-1);
    }
}
