package com.recursion;

public class SumOfElementInArr {

    public static int SumOfElementInArr(int[] arr){
       if(arr.length == 0){
           return arr[0];
       }else if(arr.length == 2){
          int sumOfTwo = arr[0] + arr[1];
          return  sumOfTwo;
        }
       int smallArray[] = new int[arr.length - 1];
       int sum = arr[0]+arr[1];

       smallArray[0] = sum;
       for(int i = 1; i<smallArray.length;i++ ){
           smallArray[i] = arr[i+1];
       }
       return SumOfElementInArr(smallArray);
    }

    public static void main(String[] args) {
        int input[] = new int[]{1,2,3,4,5};
        int result = SumOfElementInArr(input);
        System.out.println(result);
    }
}
