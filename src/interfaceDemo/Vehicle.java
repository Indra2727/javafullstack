package interfaceDemo;

public interface Vehicle {
}
interface Engine{
}
class Car implements Vehicle{

}
class Bike implements Engine{
}
class VehicleImpl{
    public static void main(String[] args) {
        Car car=new Car();
        Bike bike=new Bike();

        if (bike instanceof Vehicle){//bike or car
            System.out.println("Car");
        }
        else {
            System.out.println("Bike");
        }
    }
}