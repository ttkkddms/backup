//ctrl alt n 실행

const arr = [1, 2, 3];

//case1
let sum = 0;
for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
}
console.log(sum);


//case2
for (let ele of arr) {
    sum += ele;
}
console.log(sum);

//case3
arr.forEach(ele => sum += ele);
console.log(sum);

let one=[{name:'철수', age:10}];
let two = [...one];

two[0].name='영희';
console.log(one);
console.log(two);