package Object_Oriented_Work;

public class Singleton {
    private static Singleton instance;
    static Singleton getinstance(){
        if(instance==null){
                instance=new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1=Singleton.getinstance();
        Singleton s2=Singleton.getinstance();
        System.out.println(s1);
        System.out.println(s2); // created same object with same ref id s1==s2

    }
}
