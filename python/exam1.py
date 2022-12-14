# 딕셔너리 객체 생성1
dictionary = {}
print(type(dictionary))

# 딕셔너리 객체 생성2  dict()함수사용
dictionary2 = dict()
print(type(dictionary2))

# 요소추가
dictionary['student'] = '학생'
dictionary['teacher'] = '선생님'
dictionary['classroom'] = '교실'
print(dictionary)

# 요소삭제
del dictionary['classroom']
print(dictionary)

deletedItem = dictionary.pop('teacher')
print(deletedItem)
print(dictionary)

# 요소수정
dictionary['student'] = '학생2'
print(dictionary)

# 요소조회
dictionary['teacher'] = '선생님'
dictionary['classroom'] = '교실'

# 요소조회1) items()
# 요소(키,값)은 튜플로, 전체는 리스트 반환
items = dictionary.items()
print(items)

# 요소조회2) keys()
# 키를 요소로 갖는 리스트를 반환
keys = dictionary.keys()
print(keys)

# 요소조회3) values()
# 값을 요소로 갖는 리스트를 반환
values = dictionary.values()
print(values)

# 요소조회4-1) 키로 값 조회하기
value = dictionary['student']
print(value)

# 요소조회4-2) get() 키로 값 조회하기
# 만약 없으면 2번째 매개값을 반환
value2 = dictionary.get('student','none')
print(value2)
value3 = dictionary.get('student22',-1)
print(value3)

# 요소 전체 출력하기
def printList(dic) :
  for ele in dic.keys() :
    print('{:15} : {}'.format(ele,dictionary.get(ele)))
printList(dictionary)

# dict객체 복사
dictionary3 = dictionary.copy()
print(dictionary,'\n',dictionary3)

# 2개의 dict객체 병합하기 update()
# 키가동일하면 업데이트 다르면 추가되는 방식
dictionary3['blackboard'] = '칠판'
dictionary.update(dictionary3)
print(dictionary)

# 키가 있으면 값을 반환하고 없으면 추가
# 1.키가 있으면 값을반환
print(dictionary.setdefault('student','학생3'))
# 2.키가 없으면 요소추가
print(dictionary.setdefault('student3','학생3'))
print(dictionary)


# key 존재여부 판단
print('student' in dictionary)
print('student22' not in dictionary)

# 요소의 갯수
print(len(dictionary))

# 요소 정렬
import operator
print('==정렬 시작==')
sortedDictionary = sorted(dictionary.items(),key=operator.itemgetter(0))
reversedDictionary = reversed(sortedDictionary)
print(sortedDictionary)

print('==오름차순==')
for item in sortedDictionary :
  print('{:15} : {}'.format(item[0],item[1]))

print('==내림차순==')
for item in reversedDictionary :
  print('{:15} : {}'.format(item[0],item[1]))

print('==정렬 끝==')

# 요소 전체 삭제
dictionary.clear()
print(len(dictionary))  #{}

# 사전객체 제거 : 메모리에서 제거되어 접근불가
# del dictionary
# print(len(dictionary))




