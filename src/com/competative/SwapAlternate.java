package com.competative;

import java.util.Scanner;

public class SwapAlternate {
    public static void toString(int arr[]) {
        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] arr){
        for(int i = 0;i< arr.length;){
            int temp = arr[i];
            if((i+1) < arr.length){
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            i = i +2;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = scan.nextInt();
        };
        swap(arr);
        toString(arr);
    }
}
