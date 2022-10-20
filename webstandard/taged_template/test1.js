
// const str='화요일입니다.';
// console.log(str);

// const name = '화요일';
// const str2=name +'입니다.';
// console.log(str2);

// //template literal
// const str3 = `오늘은 ${name} 입니다.`
// console.log(str3);


//taged template
const taged=(strings, exp1, exp2, exp3)=>{
  console.log(strings);
  console.log(exp1,exp2,exp3);
  return `${exp1}-${exp2}`

}

const taged2=(strings,...exp)=>{
  console.log(strings);
  const str = exp.map((ele,i) => `${ele}-${i}`).join('');
  return str;
}

const today = '화요일';
const tomorrow = '수요일';
const yesterday = '월요일';
// const str4 = taged`오늘은 ${today} 이고 내일은 ${tomorrow}입니다.`;
const str4 = taged2`${today}${tomorrow}${yesterday}`;
console.log(str4);
