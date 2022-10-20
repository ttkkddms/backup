const arr = [1,5,4];

const result = arr.reduce((acc,ele,idx,arr)=>{
    console.log(acc,ele);
   return acc+ele;
});

console.log(`---`);
console.log(result);