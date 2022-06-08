public class Operators {
    public static void main(String args[]){

        //Unary operator
        int a = 30;
        boolean flag = false;
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(++a);
        System.out.println(a--);

        System.out.println(~a); //(-a)-a =-31 tilde operator
        System.out.println(!flag); // Negation Operator

        //Arithmetic Operator
        int x=10;
        int y=20;
        int z=30;
        float f=5/2;
        

        System.out.println(x+y);
        System.out.println(y-x);
        System.out.println(z*y);
        System.out.println(z/x);
        System.out.println(z%x);
        System.out.println(f);

        //Shift Operator
        System.out.println(x<<2);
        System.out.println(x<<3);
        System.out.println(x>>2);
        System.out.println(x>>3);

        //Logical and Bitwise operator

        System.out.println(x<y && y>z);
        System.out.println(x<y & y>z);
        System.out.println(z<y || y>x);
        System.out.println(z<y | y>x);

        //Ternary operator

        System.out.println(x>y ? "x is max" : "y is max");
    }
}
