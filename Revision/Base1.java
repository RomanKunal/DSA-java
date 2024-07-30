package Revision;
import java.util.*;
public class Base1 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int res=a+5;
//        System.out.println(res);
//        sc.close();// this is used to remove the sc as it acts as garbage collector

        int a=5;
        int b=10;
        int max=0;
        /*if(a>b){
            max=a;
        }
        else{
            max=b;
        }*/

        max=a>b?a:b;
        System.out.println(max);

    }
}
