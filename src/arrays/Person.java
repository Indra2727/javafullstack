package arrays;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class PersonImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = scanner.nextInt();
        Person person[] = new Person[size];
        System.out.println("----Enter Person Details----");
        for (int i = 0; i < size; i++) {
            person[i] = new Person();
            System.out.println("Enter name");
            String name = scanner.next();
            person[i].setName(name);
            System.out.println("Enter Age");
            int age = scanner.nextInt();
            person[i].setAge(age);
            System.out.println("Enter Address");
            String address = scanner.next();
            person[i].setAddress(address);
        }
        for (Person p:person){
            System.out.println("Name: "+p.getName());
            System.out.println("Age: "+p.getAge());
            System.out.println("Address: "+p.getAddress());
            System.out.println("**************************");
        }
    }
}