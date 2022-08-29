import java.util.ArrayList;

public class Activity9
{
    public static void main(String[] args)
    {
        //declare Arraylist of string obj
        ArrayList<String> fruitList = new ArrayList<String>();
        //Adding objects to Array List at default index from 0
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Orange");
        //Adding object at specific index
        fruitList.add(3, "Grapes");

        System.out.println("Print All the Objects:");
        for(String s:fruitList)
        {
            System.out.println(s);
        }
        System.out.println("1st element in the list is: " + fruitList.get(1));
        System.out.println("3rd element in the list is: " + fruitList.get(2));
        System.out.println("Is Chicku is in list: " + fruitList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + fruitList.size());

        fruitList.remove("Papaya");
        System.out.println("New Size of ArrayList: " + fruitList.size());

        fruitList.add(1, "Papaya");
        System.out.println("1st element in the list is: " + fruitList.get(1));
    }
}