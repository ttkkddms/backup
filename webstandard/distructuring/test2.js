
{
  // 함수선언문
  function getPerson(){
    return{
      name:'홍길동',
      age:30
    }
  }
  const {name,age} = getPerson();
  console.log(name,age);
}


{
  // 함수표현식을 통해 객체 반환
  const getPerson = function(){
    return{
      name:'홍길동',
      age:30
    }
  }
  const {name,age} = getPerson();
  console.log(name,age);
}


{
  // 화살표함수 통해 객체 반환
  const getPerson = ()=>{
    return{
      name:'홍길동',
      age:30
    }
  }
  const {name,age} = getPerson();
  console.log(name,age);
}


{
  const getPerson = ()=>
    ({
      name:'홍길동',
      age:30
    });
  const {name,age} = getPerson();
  console.log(name,age);
}


{
  const sum = (x,y)=>x+z;
}