package thisKeyword;

public class Bike {
    int bikeNo;
    String bikeName;

    public Bike(){
        this(101,"Shine");
        System.out.println("In default Constructor");
    }
    public Bike(int bikeNo, String bikeName) {
        System.out.println("In Parameterised Constructor");
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
    }
    void display(){
        System.out.println("----Bike Detail----");
        System.out.println("Bike No :"+bikeNo);
        System.out.println("Bike Name :"+bikeName);
    }

}
class BikeImpl{
    public static void main(String[] args){
        Bike b1=new Bike();
        b1.display();
    }
}
