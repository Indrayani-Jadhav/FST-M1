package Activities;

import java.util.HashMap;

public class Activity11
{
        public static void main(String[] args)
        {
            HashMap<Integer, String> color_hash_map = new HashMap<Integer, String>();
            color_hash_map.put(1, "Red");
            color_hash_map.put(2, "Green");
            color_hash_map.put(3, "Blue");
            color_hash_map.put(4, "White");
            color_hash_map.put(5, "Black");

            // Print the Map
            System.out.println("The Original Hash-map: " + color_hash_map);

            // Remove one colour
            color_hash_map.remove(4);

            // Map after removing a colour
            System.out.println("After deleting White color from hashmap: " + color_hash_map);

            // Check if green color exists
            if(color_hash_map.containsValue("Green"))
            {
                System.out.println("Green color exists in the Map");
            }
            else
            {
                System.out.println("Green does not exist in the Map");
            }

            // Size of the Map
            System.out.println("Number of pairs in the Map is: " + color_hash_map.size());
        }
    }
}
