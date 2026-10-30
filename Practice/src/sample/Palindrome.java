package sample;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String str = "smoms";
        StringBuffer str2 = new StringBuffer();
        for (int i=str.length()-1; i>=0;i--){
            str2.append(str.charAt(i));
        }
        if(str.contentEquals(str2)){
            System.out.println("It's palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        StringBuilder str3 = new StringBuilder(str);
        if ((str).contentEquals(str3.reverse())){
            System.out.println("It's Palindrome");
        }
        else System.out.println("It's not Palindrome");

    }
}
