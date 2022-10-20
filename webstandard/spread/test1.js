//스프레드 문법 
//의미 : 이터러블 객체, 객체리터럴의 개별적인 값들의 목록으로
//       만들어 객체 표현식을 확정 할 수 있게 해주는 문법
//용도 : 배열과 객체를 복사, 추가, 병합
//사용 : ...+이터러블객체, ...+객체리터럴

{
 const arr1 = [1,2,3];
 const arr2 = [4,5,6];

//배열복사
 const copy = [...arr1] ///1,2,3

 //배열 추가
 console.log(...arr1,10,20);

 //배열 병합
 console.log([...arr1,...arr2]);
}
{
  const obj1={name:'홍길동1',age:10};
  const obj2={name:'홍길동2',age:20};
  const obj3={blood:'B',weight:50};

  //객체 복사
  const copy = {...obj1};
  console.log(copy);

  //객체 프로퍼티 추가
  console.log({...obj1, blood:'A'});

  //객체 병합(교체 및 추가)
  //교체. 프로퍼티 키가 같아서 덮어씌워짐
  console.log({...obj1,...obj2});
  //추가. 프로퍼티 키 추가.
  console.log({...obj1,...obj3});

  //삭제
delete obj1.name;
console.log(obj1);
//추가
obj1.name='홍길동';
console.log(obj1);
}