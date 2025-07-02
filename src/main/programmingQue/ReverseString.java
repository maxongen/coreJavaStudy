package main.programmingQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
        String str="abcdefg";
        char[] st=str.toCharArray();
        StringBuilder newStr= new StringBuilder();
        for(int i=st.length-1;i>=0;i--){
            newStr.append(st[i]);
        }
        System.out.println(newStr.toString());
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
    }
}
