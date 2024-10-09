package OOPS;
interface ROI{
    void SI(double p,int t);
}
class Hdfc implements ROI{
        private double r;
        Hdfc(double r){
            this.r=r;
        }
    @Override
    public void SI(double p, int t) {
        double v = (p * r * t) / 100;
        System.out.println("hdfc " + v);
    }
}
class Sbi implements ROI{
    private double r;
    Sbi(double r){
        this.r=r;
    }
    @Override
    public void SI(double p, int t) {
        double v=(p*r*t)/100;
        System.out.println("Sbi are: "+v);
    }
}
public class Interface3 {
    public static void main(String[] args) {
        System.out.println("HDFC here");
        Hdfc h=new Hdfc(6.5);
        h.SI(1000,4);
        System.out.println("Sbi here: ");
        Sbi s=new Sbi(7.9);
        s.SI(1200,6);
    }
}
