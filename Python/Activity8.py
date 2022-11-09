# Check the first and llast number is same in the list

# Given list of numbers
numbers = [10, 20, 30, 40, 10]

#first and last number diff or case
#numbers = [16, 20, 30, 40, 10]
print("Given list is ", numbers)

# Get first element in list
firstElement = numbers[0]

# Get last element in list
lastElement = numbers[-1]

# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)