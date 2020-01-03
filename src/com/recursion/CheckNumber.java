package com.recursion;

public class CheckNumber {

        public static boolean checkNumber(int input[], int x) {
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * Return output and don't print it.
             * Taking input and printing output is handled automatically.
             */
            if(input.length==0){
                return false;
            }

            int current = input[0];

            if(x == current){
                return true;
            }

            int newArr[] = new int[input.length - 1];

            for(int i = 0;i<newArr.length;i++){
                newArr[i] = input[i+1];
            }
            return checkNumber(newArr,x);
        }

    public static void main(String[] args) {
            int input[] = new int[]{1,2,3,4,5};
            boolean result = checkNumber(input,0);
            if(result == true){
                System.out.println("Element exists");
            }else {
                System.out.println("Element Not Found");
            }
    }
}
