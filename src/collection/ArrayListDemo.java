package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Pune");
        list.add("mumbai");
        list.add("Chennai");
        list.add("kolkata");
        list.add("Madras");
        list.add("Pune");
        System.out.println(list);
        System.out.println(list.size());
        list.add(3,"Bangalore");
        System.out.println(list);

        if (!list.isEmpty()){

        }
        System.out.println(list.get(2));
        System.out.println(list.contains("Madras"));
        System.out.println(list.indexOf("Bangalore"));
        //list.containsAll()
        list.remove("kolkata");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
