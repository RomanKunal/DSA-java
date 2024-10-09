package OOPS;
interface Aaa{
    void methodA();
}
interface Bbb{
    void methodB();
}
class M implements Aaa,Bbb{

    @Override
    public void methodA() {
        System.out.println("A is called");
    }

    @Override
    public void methodB() {
        System.out.println("B is called");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        M m=new M();
        m.methodA();
        m.methodB();
    }
}
