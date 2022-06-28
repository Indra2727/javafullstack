package homework;

public class Area {
    double aRect;
    double aCircle;
    double aSquare;
    double aTriangle;

}
class Rectangle extends Area{
    int l=5;
    int w=3;
    double aRect=l*w;
}
class Circle extends Area{
    int r=5;
    double aCircle=3.14*(r*r);
}
class Square extends Area{
    int a=4;
    double aSquare=a*a;
}
class Triangle extends Area{
    int h=6;
    int b=5;
    double aTriangle=(h*b)/2;
}
class AreaImpl{
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();
        Square square=new Square();
        Triangle triangle=new Triangle();

        System.out.println("-*-*-*-Area-*-*-*-");
        System.out.println("Area of Rectangle is "+rectangle.aRect);
        System.out.println("Area of Circle is "+circle.aCircle);
        System.out.println("Area of Square is "+square.aSquare);
        System.out.println("Area of Triangle is "+triangle.aTriangle);
    }
}
