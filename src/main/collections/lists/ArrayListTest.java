package main.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        arrayListBasicOperations();
        System.out.println("\n--------------Conversion of array---------------\n");
        conversionOfArrayToList();
        System.out.println("\n--------------Looping of list---------------\n");
        loopingList();
    }

    public static void arrayListBasicOperations() {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("value1");
        ar.add("value2");
        ar.add("value4");
        ar.add("value3");
        ar.add("value6");
        ar.add("value5");
        System.out.println("unsorted list : " + ar);
        Collections.sort(ar);
        System.out.println("sorted list : " + ar);
        System.out.println("list get first : " + ar.getFirst());
        System.out.println("list get last : " + ar.getLast());
        System.out.println("list get between first and last : " + ar.get(3));
        System.out.println("list size before remove index : " + ar.size());
        System.out.println("remove 3rd index : " + ar.remove(3));
        System.out.println("list size after remove index : " + ar.size());
        ar.addFirst("value0");
        System.out.println("add first : "+ar);
        ar.addLast("value7");
        System.out.println("add last : "+ar);
        System.out.println("list contains value7 : "+ar.contains("value7"));
        System.out.println("after removing 3rd index : " + ar.get(3));
        System.out.println("item index in list : "+ar.indexOf("value6"));
        ar.clear();
        System.out.println("clear the list : "+ar);
    }

    public static void conversionOfArrayToList(){
        String[] test={"apple", "banana","mango","orange"};
//        create an immutable list from an array
        List<String> immutableList= Arrays.asList(test);
        System.out.println("immutable list : "+immutableList);

//        below line will give you an error as it will not be allowed to update a list created by Arrays.asList, it is immutable list
//        immutableList.add("Strawberry");
//        System.out.println("immutable list after add "+immutableList);
        ArrayList<String> mutableList=new ArrayList<>(Arrays.asList(test));
        System.out.println("mutable list : "+mutableList);

        mutableList.add("Pineapple");
        System.out.println("mutable list after adding value : "+mutableList);

        System.out.println("another way to create immutable list using List of");
        List<String> str=List.of(test);
        System.out.println("immutable list using List.of : "+str);

    }

    public static void loopingList(){
        ArrayList<String> ar = new ArrayList<>();
        ar.add("value1");
        ar.add("value2");
        ar.add("value4");

        System.out.println("------loop using list.size()-----------");
        for(int i=0;i<ar.size();i++){
            System.out.println("value "+i+" "+ar.get(i));
        }

        System.out.println("------loop using for each-----------");
        for(String str:ar){
            System.out.println("value "+str);
        }
    }
}
