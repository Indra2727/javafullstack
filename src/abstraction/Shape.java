package abstraction;

public abstract class Shape {
    abstract double calculateArea();
    void display(){
        System.out.println("Calculate Area of different Shapes");
    }
}
class Rectangle extends Shape{

    int h;
    int l;

    public Rectangle(int h, int l) {
        this.h = h;
        this.l = l;
    }

    double calculateArea() {
        return l*h;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Area of Rectangle:"+calculateArea());
    }
}
class Square extends Shape{
    int a;

    public Square(int a) {
        this.a = a;
    }

    double calculateArea() {
        return a*a;
    }

    @Override
    void display() {
        //super.display();
        System.out.println("Area of Square:"+calculateArea());
    }
}
class Circle extends Shape{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    double calculateArea() {
        return 3.14*r*r;
    }

    @Override
    void display() {
        //super.display();
        System.out.println("Area of Circle:"+calculateArea());
    }
}
class Triangle extends Shape{
    int h;
    int b;

    public Triangle(int h, int b) {
        this.h = h;
        this.b = b;
    }

    double calculateArea() {
        return 0.5*h*b;
    }

    @Override
    void display() {
        //super.display();
        System.out.println("Area of Triangle:"+calculateArea());
    }
}
class ShapeImpl{
    public static void main(String[] args) {
        Shape shape=new Rectangle(5,6);
        shape.display();
        shape=new Square(5);
        shape.display();
        shape =new Circle(5);
        shape.display();
        shape=new Triangle(3,4);
        shape.display();
    }
}
