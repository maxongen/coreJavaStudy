package main.programmingQue;

//Logic here is use string builder and reverse the string and match it with the original string
public class Palindrome {
    public static void main(String[] args) {
        String palindromeStr="121";

        StringBuilder str=new StringBuilder(palindromeStr).reverse();

        if(str.toString().equals(palindromeStr)) {
            System.out.println("given string is palindrome ");
        }else{
            System.out.println("given string is not palindrome");
        }
    }
}
