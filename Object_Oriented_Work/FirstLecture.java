package Object_Oriented_Work;
class Student{
    int roll;
    String name;
    int marks;

    // Creating constructor
//    Student(int roll,String name,int marks){
//        this.roll=roll;
//        this.name=name;
//        this.marks=marks;
//    }
}
public class FirstLecture {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Kunal";
        s.roll=100;
        s.marks=99;
        System.out.println(s.marks);
    }

}
