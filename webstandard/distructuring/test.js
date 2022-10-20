const person={
  name : '홍길동',
  age : 30
}


{
  // person객체를 반환하는 함수
  //  1. 함수 선언문
  function getPerson(){
    return person;
  }
  const {age, name}=getPerson();
  console.log(name,age);
}

{
  // 2. 함수 표현식
 const getPerson = function(){
  return person;
 } 
 const {age, name}=getPerson();
 console.log(name,age);
}


{
  //  3. 화살표함수
  const getPerson =()=>{
    return person;
   } 
   const {age, name}=getPerson();
   console.log(name,age);
}


{
  //  4. 화살표함수2
  const getPerson = ()=>person;
   const {age, name}=getPerson();
   console.log(name,age);
}

{
  //  5. 화살표함수3
   const {age, name}=(()=>person)();
   console.log(name,age);
}