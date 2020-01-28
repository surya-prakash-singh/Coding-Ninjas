
const merge = (arr,start,end)=>{
    let mid = parseInt((start+end)/2);
    let i = start;
    let j = mid+1;
    let k = 0;
    const ans = [];
    while(i<=mid && j<=end){
        if(arr[i]<arr[j]){
            ans[k] = arr[i];
            i++;
            k++;
        }else {
            ans[k] = arr[j];
            j++;
            k++;
        }
    }

    while(i<=mid){
        ans[k] = arr[i];
        i++;
        k++;
    }
    while (j<=end){
        ans[k] = arr[j];
        j++;
        k++;
    }

    for (let l = 0; l<ans.length; l++){
        arr[start+l] = ans[l];
    }
}

const mergeSort = (arr,start,end) => {
    if(start>=end){
        return;
    }
    let mid = parseInt((start + end)/2);
    mergeSort(arr,start,mid);
    mergeSort(arr,mid+1,end);
    merge(arr,start,end);
}

const arr = [1,2,32,12,2,9];
mergeSort(arr,0,arr.length-1);
console.log(arr);