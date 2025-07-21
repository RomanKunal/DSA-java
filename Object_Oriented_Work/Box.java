package Object_Oriented_Work;

// Parent Class
public class Box {
    double l;
    double h;
    double w;

    // Default Constructor
    Box() {
        this.l = 0;
        this.h = 0;
        this.w = 0;
    }

    // Cube Constructor
    Box(double h) {
        this.h = h;
        this.l = h;
        this.w = h;
    }

    // Cuboid Constructor
    Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }
}
