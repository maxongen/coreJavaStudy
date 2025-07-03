package main.programmingQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//best logic here is that use string builder and its reverse method to reverse string

public class ReverseString {

    public static void main(String[] args) {
        String str="abcdefg";
        char[] st=str.toCharArray();
        StringBuilder newStr= new StringBuilder();
//        Using for loop
        for(int i=st.length-1;i>=0;i--){
            newStr.append(st[i]);
        }
        System.out.println(newStr.toString());
//        Using list reverse
        ArrayList<Character> cc=new ArrayList<>();
        for(char c:st){
            cc.add(c);
        }
        List<Character> cc1= cc.reversed();
        StringBuilder ss=new StringBuilder();
        for(char t:cc1){
            ss.append(t);
        }
        System.out.println(ss.toString());
//        Using String builder
        StringBuilder strBld=new StringBuilder(str).reverse();
        System.out.println(strBld.toString());
    }
}
