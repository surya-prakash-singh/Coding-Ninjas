const quickSort = (array,start,end) => {
    if(start>=end){
        return;
    }
    let partitionPos = partition(array,start,end);
    quickSort(array,start,partitionPos-1);
    quickSort(array,partitionPos+1,end);
}

const partition = (array,start,end) =>{
    let count = 0;
    let pivot = 0;
    for(let i=start;i<=end;i++) {
        if (array[i] < array[start]) {
            count++;
        }
    }
        pivot = start + count;

        let temp = array[start];
        array[start] = array[pivot];
        array[pivot] = temp;

        let left = start;
        let right = end;
        while(left<pivot && right>pivot){
            if(array[left]>array[pivot]){
                if (array[right]>array[pivot]){
                    right--;
                }else {
                    let temp2 = array[left];
                    array[left] = array[right];
                    array[right] = temp2;
                    left++;
                    right--;
                }
            }else{
                left++;
            }
        }
    return pivot;
}

const array = [1,0,534,89,4,9,2,43];
quickSort(array,0,array.length-1);
for(let i = 0;i< array.length;i++){
    console.log(array[i]);
}