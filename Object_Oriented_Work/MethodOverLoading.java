package Object_Oriented_Work;
class Number{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Number n=new Number();
        int res1=n.sum(1,2,3);
        int res2=n.sum(1,2);
        System.out.println(res1);
        System.out.println(res2);
    }
}
