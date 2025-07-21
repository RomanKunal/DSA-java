package Object_Oriented_Work;

// Child Class
public class MainBox extends Box {
    double weight;

    // Constructor for MainBox
    public MainBox(double l, double h, double w, double weight) {
        super(h, l, w);  // call parent constructor
        this.weight = weight;
    }

    public void display() {
        System.out.println("Length: " + l);
        System.out.println("Height: " + h);
        System.out.println("Width: " + w);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        MainBox mb = new MainBox(10, 20, 30, 5.5);
        mb.display();
    }
}
