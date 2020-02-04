const findPattern = (number) => {
    switch(number){
        case 2:	return "abc";

        case 3:	return "def";

        case 4:	return "ghi";

        case 5:	return "jkl";

        case 6:	return "mno";

        case 7:	return "pqrs";

        case 8:	return "tuv";

        case 9:	return "wxyz";

        default:break;
    }
    return "";
}

const keypadSequence = number => {

    if(number === 0){
        return [""];
    }
    let ans = [];
    let digit = number%10;
    let smallNumber = parseInt(number/10);
    console.log(smallNumber);
    let smallSequence = keypadSequence(smallNumber);
    let pattern = findPattern(digit);

    let k = 0;
    for(let i = 0; i<smallSequence.length;i++){
        for(let j = 0; j< pattern.length; j++ ){
            ans[k] = pattern.charAt(j) + smallSequence[i];
            k++;
        }
    }
    return ans;
}






const result = keypadSequence(238);

for (let i =0;i<result.length;i++){
    console.log(result[i]);
}