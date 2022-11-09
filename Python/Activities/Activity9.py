#Creating list such that new list should contain only odd numbers from the first list and even numbers from the second list.

# Given lists
list1 = [10, 20, 23, 11, 17]
list2 = [13, 43, 24, 36, 12]

# Print the lists
print("First List ", list1)
print("Second List ", list2)

# Declare a third list that will contain the result
list3 = []

# Iterate through first list to get odd elements
for num in list1:
    if (num % 2 != 0):
        list3.append(num)

# Iterate through first list to get even elements
for num in list2:
    if (num % 2 == 0):
        list3.append(num)

# Print result
print("result List is:")
print(list3)