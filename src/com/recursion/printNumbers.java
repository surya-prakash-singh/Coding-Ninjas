package com.recursion;

import java.util.Scanner;

public class printNumbers {
    public static void print(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        print(n - 1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        print(n);
    }
}
