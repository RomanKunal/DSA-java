package OOPS;
abstract class Bike{
    Bike(){
        System.out.println("Superbike");
    }
    abstract void run();
    void changegear(){
        System.out.println("Changed");
    }
}
class Tvs extends Bike{
    @Override
    void run(){
        System.out.println("SUIIIIIIIIIIIIIIIIIIII");
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        Tvs t=new Tvs();
        t.run();
        t.changegear();
    }
}
