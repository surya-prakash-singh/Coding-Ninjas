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
    public static boolean checkSorted2(int[] arr){
        if(arr.length<=1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int smallInput[] = new int[arr.length -1];

        for(int i=0;i<smallInput.length;i++){
            smallInput[i] = arr[i+1];
        }

        boolean ans = checkSorted2(smallInput);
        return ans;
    }
    public static void main(String[] args) {
        int input[] = {4,5,2,3,15};
        int input2[] = {1,2,3,4,5,6};
        System.out.println(checkSorted(input2));
        System.out.println(checkSorted2(input));
    }
}
