import sys
from pkg.pkg1 import a as a
from pkg.pkg2 import c
from pkg.pkg1 import b

print(sys.path)

a.func1()
print(a.name)

a.func3()
c.func3()



p2 = b.Person('홍길동')
p2.study()
print(p2.national)

p2.print_info()

p4 = b.Student('ㅈㅈㅇ', 10, '1234')
p4.study()
p4.sleep()
p4.print_info()

#메서드 오버로딩 안됨