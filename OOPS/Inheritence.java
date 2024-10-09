package OOPS;
class Animal{
        void bark(){
        System.out.println(" barking");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eating");
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
