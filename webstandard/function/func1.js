//2개의 매개값을 받아 덧셈하는 화살표 함수

{
    //함수선언문
    function add(x, y) { return x + y; }
    add(10, 20);
}

{
    //함수표현식
    const add = function (x, y) {
        return x + y;
    }
    add(10, 20);
}

{
    //화살표함수
    const add = (x, y) => {
        return x + y;
    }
    const add2 = (x, y) => x + y;
    console.log(add(10, 20));

    const f = (x, y) => console.log(y);
    console.log(f(10, 20));
}

{
    function x() {
        return undefined;
    }
}


const num = [1, 2, 3];
//2.3.4배수 화살표 함수
const multi2 = x => x * 2;
const multi3 = x => x * 3;
const multi4 = x => x * 4;

num.forEach(ele => console.log(multi2(ele)));
num.forEach(ele => console.log(multi3(ele)));
num.forEach(ele => console.log(multi4(ele)));

console.log(`m배수함수----`);
//배수 함수
{
    function multi(m) {
        return function (n) {
            return m * n;
        }
    }

    const f2 = multi(2);
    console.log(f2(10));

    console.log(multi(2)(10));
    console.log(multi(3)(10));
}



console.log(`m배수 화살표함수----`);
//배수 화살표함수
{
    const multi = m => n=> m * n;
    console.log(multi(2)(22));
}
