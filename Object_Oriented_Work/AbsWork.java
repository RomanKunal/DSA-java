package Object_Oriented_Work;
abstract class Animal1{
    abstract void sound();
    void sleep(){
        System.out.println("Sleeping");
    }
}
class Cat extends Animal1{
    void sound() {
        System.out.println("Meow Meow");
    }
    void work(){
        System.out.println("Eating only");
    }
}
public class AbsWork {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.sound();
        c.sleep();
        c.work();
    }
}
