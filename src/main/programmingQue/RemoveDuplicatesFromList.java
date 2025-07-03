package main.programmingQue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//Logic to remove duplicates from a list is use hashset, as hashset doesn't allow duplicates
public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<String> stringListWithDuplicates = new ArrayList<>();
        stringListWithDuplicates.add("apple");
        stringListWithDuplicates.add("banana");
        stringListWithDuplicates.add("apple");
        stringListWithDuplicates.add("orange");
        stringListWithDuplicates.add("banana");
        stringListWithDuplicates.add("grape");

        HashSet<String> rmDup=new HashSet<>(stringListWithDuplicates);
        System.out.println(rmDup);
    }
}
