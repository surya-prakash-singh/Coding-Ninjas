package com.competative;
import java.util.Scanner;
public class arrangeNumberInArray {

    public static void toString(int arr[]) {
        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the array length");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int iteratore = size/2 + 1;

        if(size%2==0) {
            iteratore = size / 2;
        }
        int arr[] = new int[size];
        int value = 1;

        for(int i = 0; i<iteratore;i++){
            arr[i] = value;
            if((size%2==0) || (size%2 !=0 && i != iteratore - 1)){
                arr[size-i-1] = value+1;
            }

            value=value+2;
        }
       toString(arr);
    }
}
