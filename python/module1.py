
list =[]

tuple = ()

dic = {}

def add(*args) : 
  sum = 0
  for ele in args : 
    sum += ele
  return sum


def multi(*args) : 
  sum = 0
  for ele in args : 
    sum *= ele
  return sum
