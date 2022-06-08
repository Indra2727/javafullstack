/*
* 3Types of Variable
* 1.local variable -
* 2.instance variable - within a class but outside the method
* 3.static variable - within a class but outside the method,cannot be local
* */



public class Variable {
    int z= 10; //instance variable
    static int c=20; //static variable
    public static void main(String args[]){
        int a=30; //local variable
        a=40;
        System.out.println(a);
    }
    void display(){
        int a=40; //local variable

    }
}
