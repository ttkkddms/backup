def func2():
  print('func2')

class Person : 
  national = 'korea'

#생성자
  def __init__(self) : 
    print('생성자 호출')

  def __init__(self,name=None) : 
    print('생성자 호출2')
    self.name = name;


  def study(self) :
    print('{}가 공부하다'.format(self.name))
  
  def print_info(self):
    print('이름 : {}'.format(self.name))

  #소멸자
  def __del__(self) : 
    print('Person객체 소멸')


class Student(Person) : 
  def __init__(self,name,age,no) : 
    #self.name = name  부모생성자 호출
    Person.__init__(self,name)

    self.age = age
    self.no = no

  def sleep(self) : 
    print('잔다')

#메소드 재정의
  def print_info(self):
    super().print_info()
    print('이름 : {}, 나이 : {}, 학번 : {}'.format(self.name, self.age, self.no))

  def __del__(self) : 
    print('Student 소멸')

