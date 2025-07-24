package Object_Oriented_Work;

public class Car implements Engine,Media{
    public void start(){
        System.out.println("Start the car");
    }
    @Override
    public void stop(){
        System.out.println("Stop the car");
    }
    @Override
    public void acc(){
        System.out.println("Race the pedal");
    }
    @Override
    public void play(){
        System.out.println("Music started");
    }
    @Override
    public void next(){
        System.out.println("Next music");
    }
    @Override
    public void pause(){
        System.out.println("Pause the music");
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.acc();
        c.stop();
        c.play();
        c.next();
        c.pause();
    }
}
