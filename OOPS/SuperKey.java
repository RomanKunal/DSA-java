package OOPS;
class A{
    String name="Kunal";
    void display(){
        System.out.println("Name: "+ name);
    }
}
class B extends A{
    String surname="Singh";
    void info(){
        System.out.println("Name: "+super.name);// calling parent class variable using super
        System.out.println("Surname: "+surname);
    }
}
class C{
    C(){
        System.out.println("My name is C");
    }
}
class D extends C{
    D(){
        super();// used to call parent class constructor
        System.out.println("My name is D");
    }
}
public class SuperKey {
    public static void main(String[] args) {
        B b=new B();

        b.info();
        D d=new D();

    }
}
