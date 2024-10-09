package OOPS;
class Car{
    String model;
    String color;
    int year;
    double price;
    // constructor define what happens when object is created. allocate memory for the object at calling.
    //used to initialise the object
    Car(String model,String color,int year,double price){
        this.model=model;
        this.color=color;
        this.year=year;
        this.price=price;
    }
    void display(){
        System.out.println("Model Name: "+ this.model);
        System.out.println("Color: "+ this.color);
        System.out.println("Year: "+this.year);
        System.out.println("Price: "+this.price);
    }
    void calculate(double percentage){
        this.price=this.price-(percentage*this.price)/100;
        System.out.println("New Price: "+ this.price);
    }
}
public class Ques {
    public static void main(String[] args) {
        Car car1=new Car("audi","Blue",2022,200000);
        car1.display();
        car1.calculate(10);
        System.out.println("New car");
        Car car2=new Car("BMW","Red",2024,300000);
        car2.display();
        car2.calculate(15);
    }
}
