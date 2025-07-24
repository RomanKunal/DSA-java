package Object_Oriented_Work;
class Employee{
    void Info() {
        System.out.println("Information of Employee is called");
    }
}
class Person extends Employee{
    void Info(){
        System.out.println("Person is calling");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Person p=new Person();
        p.Info();
        Employee e=new Employee();
        e.Info();
        Employee ee=new Person();
        ee.Info();
    }
}
