package colections;

import java.util.List;
import java.util.Vector;

public class TheVector {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        
        // add letters
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");
        vector.add("F");
        
        // print letters
        System.out.println("Letters in vector: ");
        for (String letter : vector) {
            System.out.println("\t" + letter);
        }

        // divide vector
        List<String> v1 = vector.subList(0, 3);
        List<String> v2 = vector.subList(3, 6);

        // print the divided vectors
        System.out.println("Letters in v1: ");
        for (String letter : v1) {
            System.out.println("\t" + letter);
        }

        System.out.println("Letters in v2: ");
        for (String letter : v2) {
            System.out.println("\t" + letter);
        }

        // size of vector
        System.out.println("Size of vector: \n\t" + vector.size());

        // contains
        System.out.println("Contains 'A': \n\t" + vector.contains("A"));

        // remove
        System.out.println("Remove 'A': \n\t" + vector.remove("A"));
        System.out.println("Remove 'B': \n\t" + vector.remove("B"));

        // print letters
        System.out.println("Letters in vector: ");
        for(String letter : vector) {
            System.out.println("\t" + letter);
        }

        // clear
        vector.clear();
        System.out.println("Clear vector: ");
        System.out.println(vector);
    }
}
