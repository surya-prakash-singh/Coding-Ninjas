package com.recursion;

import java.util.Scanner;

public class factorial {

    public static int factorial(int n){
            if(n<0){
                throw new Error("Number cant be negative");
            }
            if (n == 1) {
                return 1;
            } else if (n == 0) {
                return 1;
            }
            return n * factorial(n - 1);
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
