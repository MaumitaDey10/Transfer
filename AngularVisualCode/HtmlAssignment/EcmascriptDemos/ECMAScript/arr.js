var numbers=[1,2,3,4,5,6,7,8];
var finalSum=numbers.filter(val=>(val%2==0)).map(val=>val*val).reduce((preVal,currentVal)=>preVal+currentVal);
console.log(finalSum);