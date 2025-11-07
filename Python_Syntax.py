#import
import math;
"""

print(math.pow(2,3))

#print
print("Hello World")

"""
#get input from the user
"""

a = int(input("enter int : "))
print(a)

b= float(input("enter float :"))
print(b)

c = input("enter String : ")
print(c)

d = input("enter char : ")[0]
print(d)   

"""

#variable declaration

"""
a = 5
b = 10.4
c = 'A'
d = "haneef"


print(a,b,c,d)
"""

"""    """

#basic arithmetic operation
"""
a=10
b=15

print(a+b, a-b , a*b , a/b , a%b)

"""

#if condition

"""
a = 5 
b = 10 
c = 15

if a>b and a>c :
    print(a , " is greater ")
    
elif b>a and b>c:
    print(b , " is  greater ")

else :
    print(c , " is greater ")
    
"""
#loops

"""
for i in range(5):
    print(i)
          
i=1
while i>5 :
    print(i)
    i+=1 

"""           
#ternary oprator

"""
a=5
result = 1 if a>=5 else 0
print(result)
"""

#function

# def add(a,b):
#     return a+b


# a=5
# b=10

# c=add(5,10)

# print(c)

# arr1 = [1,2,3,4,5]
# #print(arr1[2])

# for i in arr1:
#     print(i)
    

# arr2 = [[1,2,3],[4,5,6]]

# for i in arr2:
#     print(i)
# #print(arr2[0][1])

# normal soritng

arr = [4,1,90,12,21]


for i in range(len(arr)):
    for j in range(i+1 , (len(arr))):
        if arr[i] > arr[j]:
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
    print(arr[i])   
    
    
    






