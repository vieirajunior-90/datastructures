package colections;

import java.util.Hashtable;

public class TheHashtable {

    public static void main(String[] args) {
    /*
        The Hashtable class implements a hash table, which maps keys to values.
        Any non-null object can be used as a key or as a value.
        To successfully store and retrieve objects from a hashtable,
        the objects used as keys must implement the hashCode method and the equals method.

        - Features of Hashtable

            It is similar to HashMap, but is synchronized.
            Hashtable stores key/value pair in hash table.
            In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
            The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
            HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.

            <a href="https://www.geeksforgeeks.org/hashtable-in-java/">Hashtable</a>
     */

        // Create a Hashtable (the example used it will be supermarket list
        Hashtable<String, Double> supermarketList = new Hashtable<>();

        // Add items to the hash table
        supermarketList.put("Milk", 1.50);
        supermarketList.put("Bread", 1.00);
        supermarketList.put("Butter", 2.00);
        supermarketList.put("Coffee", 3.00);
        supermarketList.put("Tea", 2.00);
        supermarketList.put("Cheese", 3.00);
        supermarketList.put("Apples", 1.00);
        supermarketList.put("Bananas", 2.30);
        supermarketList.put("Oranges", 1.70);
        supermarketList.put("Grapes", 4.20);
        supermarketList.put("Cucumbers", 1.30);
        supermarketList.put("Tomatoes", 1.10);
        supermarketList.put("Lettuce", 1.00);
        supermarketList.put("Yogurt", 2.20);
        supermarketList.put("Cereal", 1.50);

        // Now, our list has 15 items. Let’s print the list to see what we have
        for (String key : supermarketList.keySet()) {
            // Formatting the output with 2 decimal places and 20 spaces to the right
            System.out.printf("%-20s $ %.2f\n", key, supermarketList.get(key));
        }

        // Let’s print the list again, but this time, we’ll sort it by key
        System.out.println("\n\nSORTED BY KEY:");
        supermarketList.keySet().stream().sorted().forEach(
                key -> System.out.printf("%-20s $ %.2f\n", key, supermarketList.get(key))
        );

        // Hashtables are great for looking up items in constant time. Let’s see if we can find a banana in our list.
        System.out.println("\n\nFINDING A BANANA:");
        System.out.printf("%-20s $ %.2f\n", "Bananas", supermarketList.get("Bananas"));

        // Let’s see if we can find an avocado in our list.
        System.out.println("\n\nFINDING AN AVOCADO:");
        System.out.printf("%-20s $ %.2f\n", "Avocado", supermarketList.get("Avocado"));

        // In the above example, we used the get method to retrieve the value associated with a key.
        // Bananas was found in the list, so we printed out the value associated with the key.
        // But Avocado was not found in the list, so we printed out null.

        // We can also use the containsKey method to check if a key is in the list.
        System.out.println("\n\nCONTAINS KEY APPLES:");
        System.out.println(supermarketList.containsKey("Apples"));

        System.out.println("\n\nCONTAINS KEY MEAT:");
        System.out.println(supermarketList.containsKey("Meat"));

        // Let's use a filter to find all the items that start with the letter "B"
        System.out.println("\n\nFILTERING BY B:");
        supermarketList.keySet().stream().filter(key -> key.startsWith("B")).forEach(
                key -> System.out.printf("%-20s $ %.2f\n", key, supermarketList.get(key))
        );

        // Let's use a filter again to find prices below 2.00
        System.out.println("\n\nFILTERING BY PRICE BELOW 2.00:");
        supermarketList.keySet().stream().filter(key -> supermarketList.get(key) < 2.00).forEach(
                key -> System.out.printf("%-20s $ %.2f\n", key, supermarketList.get(key))
        );
    }
}
