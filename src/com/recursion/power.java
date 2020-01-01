package com.recursion;

import java.util.Scanner;

public class power {
    public static int power(int x, int n) {

        if(n == 0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static void main(String[] args) {
//        Scanner scan =  new Scanner(System.in);
        int x = new Scanner(System.in).nextInt();
        int n = new Scanner(System.in).nextInt();
        System.out.println(power(x,n));
    }
}
