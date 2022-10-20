//9월 19일 월요일

function sleep(func,delay){
  const delayUntil = Date.now()+delay;
  while(Date.now() < delayUntil);
  func();
}
function foo(){
  console.log('foo');
}
function bar(){
  console.log('bar');
}


//동기 : 순서보장, 블로킹
//비동기 : 블로킹X, 순서보장X
//        setTimeout, setInterval
//        (Http 요청) Ajax
//        (Dom이벤트핸들러) on+@, addEventListener

sleep(foo,3*1000); // 동기! - 3초 후 호출
bar();