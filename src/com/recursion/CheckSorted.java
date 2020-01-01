package com.recursion;

public class CheckSorted {
    public static boolean checkSorted(int[] arr){
        if(arr.length<=1){
            return true;
        }
        int smallInput[] = new int[arr.length -1];

        for(int i=0;i<smallInput.length;i++){
            smallInput[i] = arr[i+1];
        }

        boolean ans = checkSorted(smallInput);

        if(!ans){
            return false;
        }

        if(arr[0]<arr[1]){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        int input[] = {2,1,4,5,6};
        int input2[] = {1,2,3,4,5,6};
        System.out.println(checkSorted(input2));
    }
}
