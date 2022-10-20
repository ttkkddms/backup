{
    const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

    function even(value) {
        return value % 2 == 0
    }

    const arr2 = arr.filter(even);
    console.log(arr2);
    //결과 [2,4,6,8,10]

}

{
    const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    const result = arr.filter(ele => ele % 2 == 0)
    console.log(result);
}

{
    //결과 2,4,6,8,10 (배열이 아니라.)
    const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    arr.filter(ele => ele % 2 == 0).forEach(ele => console.log(ele));
}