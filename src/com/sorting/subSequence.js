const subSequence = (str) =>{
    if(str.length == 0){
        return [""];
    }

    let smallAns = subSequence(str.substring(1));
    let newArr = [];

    for(let i = 0;i<smallAns.length;i++){
     newArr[i] = smallAns[i];
    }

    for(let i = 0; i<str.length;i++){
        newArr[i+ smallAns.length] = str[0].concat(smallAns[i]);
    }
    return newArr;
}

let output = subSequence("surya");

for(let i = 0; i<output.length;i++){
    console.log(output[i]);
}
