package finalKeyword;
//Final Class
public final class Car {
    static void run(){
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]){
        Car honda= new Car();
        Car.run();
    }
}
