package Recurssion;

public class DiceProblem {
    public static void main(String[] args) {
        call("",4);
    }
    static void call(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=target && i<=target; i++) {
            call(p+i,target-i);
        }
    }
}
