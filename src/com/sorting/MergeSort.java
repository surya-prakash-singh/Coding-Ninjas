package com.sorting;


public class MergeSort {

    public static void merge(int[] arr, int start, int end){
        int mid = (start+end)/2;
        int i = start;
        int j = mid+1;
        int k = 0;
        int[] ans = new int[end - start+1];

        while(i<=mid && j<=end) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
                k++;
            } else {
                ans[k] = arr[j];
                j++;
                k++;
            }
        }

            while(i<=mid){
                ans[k] = arr[i];
                k++;
                i++;
            }

            while(j<=end){
                ans[k] = arr[j];
                k++;
                j++;
            }

        for(int l=0;l<ans.length;l++){
            arr[start+l] = ans[l];
        }

    }

    public static void mergeSort(int[] arr,int start,int end){

        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,end);

    };
    public static void main(String[] args) {
        int[] array = new int[]{1, 20, 13, 40, 5, 2};
        mergeSort(array,0,array.length-1);
        for(int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
