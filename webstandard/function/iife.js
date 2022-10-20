//iife(Immediately Invoked Function Expression)

const f =(x,y)=>x+y;
const r= f(10,20);
console.log(r);

// 즉시실행
const r2 = ((x,y)=>x+y)(20,30);
console.log(r2);
