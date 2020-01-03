package com.recursion;

public class CountZeroes {
    public static int countZerosRec(int input){
        // Write your code here

        if(input==0){
            return 0;
        }
        int rem=input%10;
        int total=0;
        if(rem==0){
            total++;
        }
        total+=countZerosRec(input/10);
        return total;
    }

    public static void main(String[] args) {
        int number = 10200;
        System.out.println(countZerosRec(number));
    }
}
