{
  //빈 객체 생성
  const obj={};
  
  //동적 프로퍼티 추가
  obj.name = '홍길동';
  obj.age=30;
  obj.study=function(){
    console.log('공부하다');
  }
  obj.study();
}
{
  const name='홍길동';
  const age = 30;
  const person = {
    name:'홍길순',
    age:20
  }

  //변수이름을 프로퍼티키, 변수값을 프로퍼티값으로 객체 리터럴 생성
  const obj = {name,age};
  console.log(obj);

  const obj2={...person, blood:'A'}
  console.log(obj2);

  const blood='A'
  const obj3={...person, blood}
  console.log(obj3);
}
