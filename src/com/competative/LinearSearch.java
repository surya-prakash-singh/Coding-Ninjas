package com.competative;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter array size");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Please enter input elements");
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Please enter key to search");
        int key = scan.nextInt();

        for(int i=0;i<size;i++){
            if(key == arr[i]) {
                flag =1;
               System.out.println("key is present at index "+i);
            }
        }
        if(flag != 1) {
            System.out.println("Key not present");
        }
    }
}
