package interfaceDemo;
//Marker Interface
public interface Parking {
}
class TwoWheeler implements Parking{
    void show(){
        System.out.println("In two Wheeler");
    }
}
class FourWheeler{
    void show(){
        System.out.println("In Four Wheeler");
    }
}
class ParkingImpl{
    public static void main(String[] args) {
        TwoWheeler twoWheeler=new TwoWheeler();
        FourWheeler fourWheeler=new FourWheeler();
        if (twoWheeler instanceof Parking){
            System.out.println("Allow");
        }
        else {
            System.out.println("Dont allow");
        }
    }
}
