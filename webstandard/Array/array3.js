const data = {
    result: 'success', //success수신성공, fail: 수신실패 프로퍼티
    data: [
        { name: '이름1', gender: '남', age: 20, blood: 'A' },
        { name: '이름2', gender: '남', age: 20, blood: 'A' },
        { name: '이름3', gender: '남', age: 20, blood: 'B' },
        { name: '이름3', gender: '여', age: 30, blood: 'AB' },
        { name: '이름5', gender: '여', age: 20, blood: 'O' }
    ]
};

//프로퍼티 키 : result, data
//프로퍼티 밸류 : succes, {}


// 0. 회원의 수
console.log(`---0---`)
if (data.result == 'success') {
    console.log(data.data.length);
}

// 1. 회원이름 콘솔에 출력하기
console.log(`---1---`)
if (data.result == 'success') {
    data.data.forEach(ele => console.log(ele.name));
}



// 2. 나이의 총합
console.log(`---2---`)
{
    //foreach
    let sum = 0;
    data.data.forEach(ele => sum += ele.age);
    console.log(`회원나이 총합 : ${sum}`);
}
{
    //reduce
    const result1 = data.data.reduce((acc, ele) => acc + ele.age, 0);
    console.log(`회원나이 총합 : ${result1}`);
}



// 3. 남자회원의 나이 총합
console.log(`---3---`)
{
    //남자배열
    const man = [];
    data.data.forEach(ele => {
        if (ele.gender == '남') man.push(ele)
    });
    console.log(man);

    //forEach
    let result1 = 0;
    man.forEach(ele => result1 += ele.age);
    console.log(result1);

    //reduce
    const result2 = man.reduce((acc, ele) => { return acc + ele.age }, 0);
    console.log(`남자회원 나이 총 합 : ${result2}`);

    //fiter + rudece
    const result3 = data.data.filter(ele => ele.gender == '남')
        .reduce((acc, ele) => acc + ele.age, 0);
    console.log(`남자회원 나이 총 합 : ${result3}`);
}



// 4. 남자회원, 여자회원 분리하여 배열에 저장
console.log(`---4---`)
{
    //forEach
    const woman = [];
    data.data.forEach(ele => {
        if (ele.gender == '여') woman.push(ele)
    });
    console.log(woman);
}
{
    //filter
    const femaleMenber = data.data.filter(ele => ele.gender == '여');
    console.log(femaleMenber);
}
{
    //reduce
    const maleMenber = data.data.reduce((acc, ele, idx, arr) => {
        if (ele.gender == '남') acc.push(ele);
        return acc;
    }, []);
    console.log(maleMenber);
}



// 5. A형 회원의 나이 총합 구하기
console.log(`---5---`)
{
    //A형인사람 배열
    const bloodA = [];
    data.data.forEach(ele => {
        if (ele.blood == 'A') bloodA.push(ele)
    });

    //forEach
    let result1 = 0;
    bloodA.forEach(ele => result1 += ele.age);
    console.log(result1);
}
{
    //A형인사람 배열
    const bloodA = [];

    //reduce
    const result = bloodA.reduce(
        (acc, ele) => acc + ele.age, 0);
    console.log(result);
}
{
    //filter, reduce
    const result1 = data.data.filter(ele => ele.blood == 'A').reduce((acc, ele) => { return acc + ele.age }, 0);
    const result2 = data.data.filter(ele => ele.blood == 'A').reduce((acc, ele) => acc + ele.age, 0);
    console.log(result1);
    console.log(result2);
}


// 6. name이 이름3인 회원의 혈액형은?
console.log(`---6---`)
{
    //이름3인 사람 배열
    const nameAll = [];
    data.data.forEach(ele => {
        if (ele.name == '이름3') nameAll.push(ele)
    });

    //forEach
    data.data.filter(ele => ele.name == '이름3')
        .forEach(ele => console.log(ele.blood));
}
{
    const result = data.data.filter(ele => ele.name == '이름3');
    console.log(`이름3인 회원의 혈액형 : ${result[0].blood}`);
    console.log(`이름3인 회원의 혈액형 : ${result[1].blood}`);
}

//7. 혈액형별 인원수 카운트
console.log(`---7---`)
{
    const typeA = data.data.reduce((acc, ele, idx, arr) => {
        if (ele.blood == 'A') acc.push(ele);
        return acc;
    }, []);
    console.log(`A : ${typeA.length}명`);
}
{
    const countOfBloodType = data.data.reduce((acc, ele, idx, arr) => {
        //같은 혈액형 프로퍼티 누적
        const typeBlood = acc[ele.blood] ? acc[ele.blood] + 1 : 1;
        return { ...acc, [ele.blood]: typeBlood, };
    }, {});
    console.log(countOfBloodType);
}
{
    const countOfBloodType2 = data.data.reduce((acc, ele, idx, arr) => {
        //같은 혈액형 프로퍼티 누적
        if (acc[ele.blood]) {
            ++acc[ele.blood];
        } else {
            acc[ele.blood] = 1;
        }
        return acc;
    }, {});
    console.log(countOfBloodType2);
}
{
    const countOfBloodType3 = data.data.reduce((acc, ele, idx, arr) => {
        //같은 혈액형 프로퍼티 누적
        acc[ele.blood] = acc[ele.blood] ? ++acc[ele.blood] : 1;
        return acc;
    }, {});
    console.log(countOfBloodType3);
}
{
    const countOfBloodType4 = data.data.reduce((acc, ele, idx, arr) => {
        //같은 혈액형 프로퍼티 누적
        acc[ele.blood] = (acc[ele.blood] || 0) + 1;
        return acc;
    }, {});
    console.log(countOfBloodType4);
}




//8. 남성 회원의 평균 연령
console.log(`---8---`)
{
    const avgOfAge = data.data.filter(ele => ele.gender == '남')
        .reduce((acc, ele, idx, arr) => {
            if (idx == arr.length - 1) {
                return (acc + ele.age) / arr.length;
            }
            return acc + ele.age;
        }, 0);
    console.log(`남성회원 평균 연령 : ${avgOfAge}`);
}

{
    const avgOfAge = data.data.filter(ele => ele.gender == '남')
        .reduce((acc, ele, idx, arr) => {
            return idx == arr.length - 1 ? (acc + ele.age) / arr.length : acc + ele.age;
        }, 0);
    console.log(`남성회원 평균 연령 : ${avgOfAge}`);
}

{
    const avgOfAge = data.data.filter(ele => ele.gender == '남')
        .reduce((acc, ele, idx, arr) =>
            idx == arr.length - 1 ? (acc + ele.age) / arr.length : acc + ele.age, 0);
    console.log(`남성회원 평균 연령 : ${avgOfAge}`);
}


//9. 나이가 가장 많은 회원의 혈액형은?
console.log(`---9---`)
{
    const bloodTypeOfTheOldest = data.data.reduce((acc, ele, idx, arr) => {
        //요소의 크기기 큰값을 누적값으로
        if (acc < ele.age) {
            acc = ele.age;
        }
        return acc;
    }, 0);
    console.log(`나이가 가장 많은 회원 나이 : ${bloodTypeOfTheOldest}`);
}
{
    const bloodTypeOfTheOldest = data.data.reduce((acc, ele, idx, arr) => {
        //요소의 크기기 큰값을 누적값으로
        if (acc.age < ele.age) {
            acc = ele;
        }
        return acc;
    });
    console.log(`나이가 가장 많은 회원의 혈액형 : ${bloodTypeOfTheOldest.blood}`);
}


{
    const bloodTypeOfTheOldest2 = data.data.reduce((acc, ele, idx, arr) => {
        //요소의 크기기 큰값을 누적값으로

        return (acc < ele.age) ? ele.age : acc;
    }, 0);
    console.log(`나이가 가장 많은 회원의 혈액형 : ${bloodTypeOfTheOldest2}`);
}
{
    const bloodTypeOfTheOldest3 = data.data.reduce((acc, ele, idx, arr) =>
        //요소의 크기기 큰값을 누적값으로
        (acc.age < ele.age) ? ele : acc);
    console.log(`나이가 가장 많은 회원의 혈액형 : ${bloodTypeOfTheOldest3.blood}`);
}

//10. 
[
    { name: '이름1', age: 20 },
    { name: '이름2', age: 20 },
    { name: '이름3', age: 20 },
    { name: '이름3', age: 30 },
    { name: '이름5', age: 20 }
]

{
    const processedData = data.data.reduce((acc, ele) => {
        acc.push({ name: ele.name, age: ele.age });
        return acc;
    }, []);

    console.log(processedData);
}

//11. 수신된  데이터에 남자회원이 있는지 여부
{
    const isExist = data.data.some((ele, idx, arr) => ele.gender == '남');
    console.log(`남자회원 유무 ${isExist}`);
}


//12. 수신된 데이터가 모두 남자회원인지 여부
{
    const isExist = data.data.every((ele, idx, arr) => ele.gender == '남');
    console.log(`모두가 남자회원인지 여부 ${isExist}`);
}
{
    //순서정렬
    const arr = [1, 10, 2, 30];
    const f = (x, y) => x > y ? 1 : x < y ? -1 : 0;
    arr.sort(f);
    console.log(arr);
}
{
    const arr = [1, 10, 2, 40];
    const f2 = function f2(x, y) {
        if (x > y) {
            return 1;
        } else if (x < y) {
            return -1;
        } else {
            return 0;
        }
    }
    arr.sort(f2);
    console.log(arr);
}

//13.여성회원을 나이 내림차순으로 정렬하기
{
    const sortedMember = data.data.filter(ele => ele.gender == '여').sort((e1, e2) => e2.age - e1.age);
    console.log(sortedMember);
}


//14. 여성이면서 혈액형이 'AB'인 첫번째  사람의 이름
{
    const wow1 = data.data.filter(ele => ele.gender == '여' && ele.blood == 'AB')[0].name;
    console.log(wow1);

    const wow2 = data.data.find(ele => ele.gender == '여' && ele.blood == 'AB').name;
    console.log(wow2);
}
