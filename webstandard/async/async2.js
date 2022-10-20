
function foo(){
  console.log('foo');
}
function bar(){
  console.log('bar');
}


setTimeout(foo, 3*100); //3초 후 호출 - 비동기!
bar(); // <- 먼저 출력됨