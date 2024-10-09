package OOPS;
class Shapes{
    void area(){
        System.out.println("I am in shapes");
    }
}
class Circle extends Shapes{
    @Override // THIS IS CALLED ANNOTATION USED TO CHECK WHETHER IS OVERRIDEN OR NOT
    void area(){ // METHOD OVERRIDING
        System.out.println("Area is pie*r^2");
    }
}

class Square extends Shapes{
    void area(){
        System.out.println("Area is side^2");
    }
    void sum(int a,int b){
        System.out.println("Area is: "+ a*b); // METHOD OVERLOADING
    }
    void sum(int a,int b,int c){
        System.out.println("Area is: "+ a*b*c);
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();
        shape.area();
        circle.area();
        square.area();
        square.sum(2,3);
        square.sum(4,4,4);
    }
}

// polymorphism represents anything into many forms
// has two types
// Compile time/ Static acheived by Method Overloading (Same name but diff arguments return types)
// eg:- multiple constructor

//RUNTIME / DYNAMIC POLYMORPHISM achieved by Method Overriding ()
// eg:- let have same function name as parent class in chld class

