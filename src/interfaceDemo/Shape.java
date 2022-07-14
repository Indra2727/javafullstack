package interfaceDemo;
import java.util.Scanner;
public interface Shape {
    double calculateArea();
}
class Rect implements Shape{
    int breadth;
    int length;
    Rect(int breadth,int length){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}
class Cir implements Shape{
    int radius;

    public Cir(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return 3.14*radius*radius;
    }
}
class Squ implements Shape{
    int side;

    public Squ(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
class Tri implements Shape{
    int height;
    int base;

    public Tri(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5*height*base;
    }
}
class ShapeImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Rectangle\n2.Circle\n3.Square\n4.Triangle\n5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            Shape shape;
            switch (ch){
                case 1:
                    System.out.println("Enter breadth & length");
                    int breadth = sc.nextInt();
                    int length = sc.nextInt();
                    shape = new Rect(breadth,length);
                    System.out.println("Area of Rectangle is "+shape.calculateArea());
                    break;
                case 2:
                    System.out.println("Enter Radius");
                    int radius  = sc.nextInt();
                    shape = new Cir(radius);
                    System.out.println("Area of Circle is "+shape.calculateArea());
                    break;
                case 3:
                    System.out.println("Enter Side");
                    int side  = sc.nextInt();
                    shape = new Squ(side);
                    System.out.println("Area of Square is "+shape.calculateArea());
                    break;
                case 4:
                    System.out.println("Enter height & Base");
                    int height = sc.nextInt();
                    int base = sc.nextInt();
                    shape = new Tri(height,base);
                    System.out.println("Area of Triangle is  "+shape.calculateArea());
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while (ch<=5);
    }
}
