# fruits = ['apple','banana', 'mango']
# positionOfMango = fruits.index('mango')
# print(positionOfMango)



# 함수
# 매개변수 ( 튜플, 찾고자하는 요소 )
# 반환값 : 찾은 요소의 인덱스
def findIndex(tuple, element) : 
  idx = -1
  try : 
    idx = tuple.index(element)
  except ValueError as e :
    print('오류유형 : {}'.format(type(e)))
    print('오류1 : {}'.format(e))
    print('오류2 : {}'.format(e.args))
    #print('찾고자하는 요소가 없습니다.')
    pass
  else : 
    print('오류가 발생하지 않는경우 1회 수행')
  finally : 
    print('오류발생여부와 상관없이 1회 수행')
  return idx


fruits = ['apple','banana', 'mango']

stop = False
while not stop : 
  fruit = input('과일명(종료 : x) >>')

  if fruit == 'x' or fruit == 'X' :
    stop = True
    continue

  findedIndex = findIndex(fruits, fruit)
  if findedIndex != -1 : 
    print('위치 : {}'.format(findedIndex+1))
  else : 
    print('찾고자하는 요소가 없습니다.')

