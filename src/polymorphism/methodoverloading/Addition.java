package polymorphism.methodoverloading;

public class Addition {
    int add(int no1,int no2){
        return no1+no2;
    }
    int add(int no1,int no2,int no3){
        return no1+no2+no3;
    }
    float add(int no1,float f1){
        return no1+f1;
    }
    float add(float f1,int no1){
        return f1+no1;
    }
    void add(int... no){
        System.out.println("Calling var args");
    }
}
class AdditionImpl{
    public static void main(String[] args) {
        Addition add1=new Addition();
        System.out.println(add1.add(5,6));
        System.out.println(add1.add(5,4,7));
        System.out.println(add1.add(5.5f,4));
        System.out.println(add1.add(8,6.5f));
        add1.add();
    }
}
