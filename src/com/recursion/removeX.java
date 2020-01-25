package com.recursion;

public class removeX {

    public static String removeX(String input,int i){
        // Write your code here
        System.out.println(i);
        if(i == input.length()){
            return input;
        }
        String newStr = "";
        if(input.charAt(i) == 'x'){
            newStr =input.substring(0,i).concat(input.substring(i+1,input.length()));
        }else {
            newStr = input;
        }
        i++;
        System.out.println(newStr);
        return removeX(newStr,i);
    }

    public static String removeX(String input){
        return removeX(input,0);
    };

    public static void main(String[] args) {
        System.out.println(removeX("pxxp"));
    }
}
