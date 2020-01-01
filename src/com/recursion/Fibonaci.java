package com.recursion;

import java.util.Scanner;

public class Fibonaci {
    public static int fibonnaci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonnaci(n-1)+fibonnaci(n-2);
    };

    public static void main(String[] args) {
        System.out.print(fibonnaci(new Scanner(System.in).nextInt()));
    }
}
