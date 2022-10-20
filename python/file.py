
#쓰기모드
from this import s


f = open('D:\javaedu9\project\python\sample.txt', 'w')
print(f.writable())
f.write('hello!\n')
f.close()


#추가모드
f = open('D:\javaedu9\project\python\sample.txt', 'a')
f.write('python!')
f.close()

#읽기모드
f = open('D:\javaedu9\project\python\sample.txt', 'r')
for line in f.readlines():
  print(line.strip())
f.close()

#읽기모드
f = open('D:\javaedu9\project\python\멤버.csv', 'r')
for line in f.readlines():
  print(line.strip())
f.close()

