package thisKeyword;
//Used to invoke current class method
public class A {
    int n;
    void m(A a){
        System.out.println("Call current class method");
    }
    void n(){
        System.out.println("n methode gets called");
        m(this);
        System.out.println("Exit from n");
    }
    public static void main(String[] args){
        A a=new A();
        a.n();
    }
}
