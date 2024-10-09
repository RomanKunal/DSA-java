package OOPS;

abstract class Bank{
    abstract int getroi();
}
class Pnb extends Bank{
    @Override
    int getroi() {
        return 14;
    }
}
class Icici extends Bank{
    @Override
    int getroi(){
        return 15;
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Pnb p=new Pnb();
        System.out.println(p.getroi());
        Icici i=new Icici();
        System.out.println(i.getroi());
    }
}
