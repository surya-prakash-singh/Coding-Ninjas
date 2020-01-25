package com.recursion;

public class replaceCharacter {
    public static String replaceCharacter(String str, char c1, char c2){
        if(str.length() == 0){
            return str;
        }
        String ans = "";
        if(str.charAt(0) == c1){
            ans = ans + c2;
        }else{
            ans = ans + str.charAt(0);
        }
        String result = replaceCharacter(str.substring(1),c1,c2);
        return ans + result;
    }

    public static void main(String[] args) {
        System.out.println(replaceCharacter("xxxxxxxxsxs",'x','c'));
    }
}
