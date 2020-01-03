package com.recursion;

import java.util.Scanner;

public class GeometricSum {

    public static double findGeometricSum(int k){
        if(k==0){
            return 1;
        }
        double result = 1/Math.pow(2,k);

        result +=findGeometricSum(--k);
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        double ans = findGeometricSum(k);
        System.out.println(ans);
    }
}
