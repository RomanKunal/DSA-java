package Object_Oriented_Work;
class Student1{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class Encap1 {
    public static void main(String[] args) {
        Student1 st=new Student1();
        st.setName("Kunal");
        System.out.println(st.getName());
    }
}
