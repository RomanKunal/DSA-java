package OOPS;

class Vehicle{
    String model;  // instance variable
    int price;
    String color;
}
public class ClassesEx {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.model="Audi";
        v.color="blue";
        v.price=1400;
        System.out.println(v.model +" " +v.price+ " "+v.color );
    }
}
