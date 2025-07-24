package Object_Oriented_Work;
class Animal{
    Animal(){
        System.out.println("Called from Animal");
    }
    void sound(){
        System.out.println("Animal making sound");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog called Now");
    }
    void sound(){
        System.out.println("Dog is barking");
    }
}
public class Chaining_UsingSuper {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}
