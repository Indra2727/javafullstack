package finalKeyword;
//Final Method
public class Bike {
    final void display() {
        System.out.println("ABC");
    }
}
class BikeImpl extends Bike{
    //void display(){    //error Because In Final method Cannot override display() method
       // System.out.println("gfgmd");
    //}
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.display();
    }
}
