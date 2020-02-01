package com.sorting;

public class QuickSort {

    public static void quickSort(int[] array, int start, int end){
        if(start>=end){
            return;
        }
        int pivotPosition = partition(array,start,end);
        quickSort(array,start,pivotPosition-1);
        quickSort(array, pivotPosition+1, end);
    }

    public static int partition(int[] array,int start, int end){
      int count = 0;
      for(int i = start ; i<=end ; i++){
          if(array[i]<array[start]){
              count++;
          }
      }
      int pivot = start + count;

      int temp = array[start];
      array[start] = array[pivot];
      array[pivot] = temp;


      int left = start;
      int right = end;

      while(left<pivot && right > pivot) {

          if(array[left]>array[pivot]){
            if(array[right]>array[pivot]) {
                right--;
            }else {
                int temp2 = array[right];
                array[right] = array[left];
                array[left] = temp2;
                right--;
                left++;
            }
          }else{
              left++;
          }
      }


      return pivot;
    }


    public static void main(String[] args) {
        int array[] = new int[]{1,0,534,89,4,9,2,43};
        quickSort(array,0,array.length-1);
        for(int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
