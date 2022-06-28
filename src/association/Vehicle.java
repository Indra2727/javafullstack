package association;

public class Vehicle {
    int wheels;
    String vehicleType;
    String brand;
}
class Car extends Vehicle{
    String segment;
    String model;
    String variant;
    Engine engine;
    MPlayer mPlayer;
    void display(){
        System.out.println(""+segment);
        System.out.println(""+model);
        System.out.println(""+variant);
        System.out.println(""+engine.engineType);
        System.out.println(""+engine.stroke);
        System.out.println(""+engine.cc);
        System.out.println(""+mPlayer.companyName);
        System.out.println(""+mPlayer.price);
    }
}
class Engine{
    int stroke;
    String engineType;
    int cc;
}
class MPlayer{
    String companyName;
    double price;
}
class VehicleImpl{
    public static void main(String[] args) {
        Car car=new Car();
        car.brand="Suzuki";
        car.vehicleType="Car";
        car.model="Swift";
        car.segment="Hashback";
        car.variant="Diesel";
        Engine suzukiEngine=new Engine();
        suzukiEngine.engineType="BS6";
        suzukiEngine.cc=1296;
        suzukiEngine.stroke=4;
        car.engine=suzukiEngine;
        MPlayer sonyPlayer=new MPlayer();
        sonyPlayer.companyName="Sony";
        sonyPlayer.price=5000;
        car.mPlayer=sonyPlayer;
        car.display();
    }
}