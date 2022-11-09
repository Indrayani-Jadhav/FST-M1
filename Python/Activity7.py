#calculate the sum of all the elements in a list
#declare numbers as array to store more than one number
numbers = list(input("Enter a sequence of comma separated values: ").split(", "))
sum = 0

for number in numbers:
    sum+=int(number)

#Print the sum
print(sum)

