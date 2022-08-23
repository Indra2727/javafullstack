package stringdemo;

public class Person {
    private int pid;
    private String name;
    private String mob_no;
    private String email;

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", mob_no='" + mob_no + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.pid=2;
        person.name="Jitu";
        person.mob_no="9876543210";
        person.email="abc@gmail.com";
        System.out.println(person.toString());
    }
}
