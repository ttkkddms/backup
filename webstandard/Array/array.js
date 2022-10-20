{
    //Array.prototype.forEach()
    //콜백함수내에서 배열을 순회하면서 요소하나에 대한 수행처리
    //반환값 없음. undefined
    let fruits = ['사과', '바나나', '딸기'];

    //인덱스 찾기
    const findIdx = fruits.indexOf('바나나');
    console.log(findIdx); //1

    //삭제된 요소
    const deleteElement = fruits.splice(findIdx, 1);
    console.log(deleteElement[0]);



    fruits.forEach(ele => console.log(ele));

}



//스프레드 문법 [...배열,]
{
    let fruits = ['사과', '바나나', '딸기'];
    let fruits2 = ['수박', '참외'];

    //배열결합
    let fruits3 = [...fruits, ...fruits2, '체리'];
    console.log(fruits3);

    //배열복사
    let fruits4 = [...fruits];
}





// fruits.forEach(function (item, index, array) {
//     console.log(item, index, array,this)
//   },[1,2,3]);
//   fruits.forEach(ele=>console.log(ele));

