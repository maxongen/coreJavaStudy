package main.programmingQue;

import java.util.HashMap;

//Logic here is get string, convert it to char array using toCharArray(), now traverse this array,
//create one hashmap, if character present in a hashmap key then increase count, else add char and 1 in a map
public class NumOfCharOcure {
    public static void main(String[] args) {
        String str="this is a text to count number of chars";
        str=str.replace(" ","");
        char[] ch=str.toCharArray();
        HashMap<Character,Integer> chCount=new HashMap<>();

        for(char c:ch){

            if(chCount.containsKey(c)){
                chCount.put(c,chCount.get(c)+1);
            }else{
                chCount.put(c,1);
            }
        }
        System.out.println(chCount);
    }
}
