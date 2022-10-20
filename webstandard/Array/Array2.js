
{
    //Array.prototype.map()
    //콜백함수의 반환값들로 구성된 새로운 배열을 반환
    const arr = [1, 2, 3];
    const map = arr.map(ele => ele * 3);
    console.log(map);
    //결과 [3,6,9]
}

{
    const arr = [1, 2, 3];
    const result = [];
    arr.forEach((ele) => result.push(ele * 3));
    console.log(result);
    //결과 [3,6,9]   
}

{
    const arr = [1, 2, 3];
    arr.map(ele => ele * 3).forEach(ele => console.log(ele));
    //결과 3,6,9
}


{
    const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    const result = [];
    arr.forEach(ele => {
        if (ele % 2 == 0) result.push(ele)
    });
    console.log(result);
    //결과 [2,4,6,8,10]
}

{
    //필터
    const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

    function even(value) {
        return value % 2 == 0
    }
    const arr2 = arr.filter(even);
    console.log(arr2);
    //결과 [2,4,6,8,10]

}