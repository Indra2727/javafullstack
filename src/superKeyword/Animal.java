package superKeyword;

public class Animal {
    void  eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void run(){
        super.eat();
        System.out.println("Running");
    }
}
class AnimalImpl{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.run();
    }
}