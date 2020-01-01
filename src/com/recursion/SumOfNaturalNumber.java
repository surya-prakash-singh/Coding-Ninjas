package com.recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {

    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        Sum(n);
    }
}
