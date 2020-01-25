package com.recursion;

public class replaceConsecutiveBackwards {

    public static String replaceConsecutiveBackwards(String str){

        if(str.length() == 1){
            return str;
        }

        String actual = replaceConsecutiveBackwards(str.substring(0,str.length()-1));
        if(actual.charAt(actual.length()-1) == str.charAt(str.length()-1)){
            return actual;
        }
        actual+=Character.toString(str.charAt(str.length()-1));
        return actual;
    };
    public static void main(String[] args) {
        System.out.println(replaceConsecutiveBackwards("xssdsdsdsdasds"));
    }
}
