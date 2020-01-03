package com.recursion;
import java.util.Scanner;
public class Palindrome {

    public static boolean isPalindrom(String s){

        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrom(s.substring(1,s.length()-1));
        }
        return false;
    }
    public static void main(String[] args) {
       System.out.println(isPalindrom(new Scanner(System.in).nextLine()));
    }
}
