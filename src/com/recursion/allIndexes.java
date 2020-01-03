package com.recursion;
import java.util.ArrayList;
public class allIndexes {

    public static int[] allIndexes(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        ArrayList<Integer> arr=	findAll(input,x,0,input.length-1);
        int actual[]=new int[arr.size()];
        for(int i=0;i<actual.length;i++){
            actual[i]=arr.get(i);
        }
        return actual;
    }
    public static ArrayList<Integer> findAll(int input[],int x,int p,int r){

        if(p==r){
            ArrayList<Integer> arr=new ArrayList<Integer>();
            if(input[0]==x){
                arr.add(0);
            }
            return arr;
        }
        ArrayList<Integer> arr1=findAll(input,x,p,r-1);
        if(input[r]==x){
            arr1.add(r);
        }
        return arr1;
    }

    public static void main(String[] args) {
        int input[] =new int[]{1,2,3,4};
        int result[] = allIndexes(input,2);
       for(int i = 0;i<result.length;i++){
           System.out.println(result[i]);
       }

    }
}
