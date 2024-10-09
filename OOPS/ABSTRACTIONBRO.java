package OOPS;
// abstract class is a generalised form and child class must implement that
// it does not have body
//empty methods
// child class have to return something
abstract class Aa{
    abstract void career(String name);
    abstract void choice(String name);
}
class Bb extends Aa{

    @Override
    void career(String name) {
        System.out.println("Name is a : "+name);
    }

    @Override
    void choice(String name) {
        System.out.println("Choice is : "+name);
    }
}
public class ABSTRACTIONBRO {
    public static void main(String[] args) {
        Bb b=new Bb();
        b.career("Engineer");
        b.choice("Developer");
    }

}
