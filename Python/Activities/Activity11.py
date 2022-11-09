#Declare the arrayu for list of fruits and prizes

fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

key_to_check = input("Which fruit you are looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available ! )
else:
    print("No, this is not available !")