package main.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        setBasicOperations();
    }

    public static void setBasicOperations(){
        Set<String> ss=new HashSet<>();
        ss.add("Apple");
        ss.add("Banana");
        ss.add("Orange");
        ss.add("Apple");
        ss.add("apple");
        System.out.println("Set output : "+ss);

    }
}
