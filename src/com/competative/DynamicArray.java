package com.competative;

public class DynamicArray {
    private int[] data;
    private int nextIndex;

    public DynamicArray(){
        data = new int[5];
        nextIndex = 0;
    };

    public int size(){
        return nextIndex;
    }

    public void add(int element){

        if(nextIndex == data.length){
            restructure();
        }
        data[nextIndex] = element;
        nextIndex++;

    }
    public void set(int index, int element){
      if(index>nextIndex){
          return;
      }else if(index == nextIndex){
          add(element) ;
      }else{
          data[index] = element;
      }

    }

    public int get(int index){

        if(index < nextIndex){
            return  data[index];
        }else{
            throw new Error("Element at index doesnt exists");
        }
    };

    public boolean isEmpty(){
        if(nextIndex == 0){
            return true;
        }
        return false;
    }
    public int removeLast(){
        if(isEmpty()){
            throw new Error("Element at index doesnt exists");
        }
        int value = data[nextIndex -1];
        data[nextIndex - 1] = 0;
            nextIndex--;
        return value;
    }
    public void restructure(){
       int temp[] = data;
       data = new int[data.length * 2];
       for(int i = 0; i< temp.length;i++){
           data[i] = temp[i];
       }
    }
}
