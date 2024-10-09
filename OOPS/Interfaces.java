package OOPS;
interface Veh{
    void start();
    void stop();
}
class Carr implements Veh{
    @Override
    public void start(){
        System.out.println("Car is start");
    }
    @Override
    public void stop(){
        System.out.println("Car is stopped");
    }
}
class Bikee implements Veh{

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Carr car=new Carr();
        car.start();
        car.stop();
        Bikee b=new Bikee();
        b.start();
        b.stop();
    }
}
