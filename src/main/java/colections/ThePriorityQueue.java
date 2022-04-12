package colections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class ThePriorityQueue {
    public static void main(String[] args) {
        // This que is sorted in reverse order
        Queue<String> programmingLanguages = new PriorityQueue<>(Collections.reverseOrder());

        // Adding elements to the queue
        programmingLanguages.offer("Java");
        programmingLanguages.offer("Elixir");
        programmingLanguages.offer("C");
        programmingLanguages.offer("Python");
        programmingLanguages.offer("JavaScript");

        // Displaying the elements in the queue
        System.out.println("Programming Languages: \n\t" + programmingLanguages);

        // First element in the queue
        System.out.println("First element in the queue: \n\t" + programmingLanguages.peek());

        // Removing the first element in the queue
        System.out.println("Removing the first element in the queue: \n\t" + programmingLanguages.poll());

        // Searching for an element in the queue
        System.out.println("Does the Java in the queue: \n\t" + programmingLanguages.contains("Java"));

        // Displaying the elements in the queue
        System.out.println("Elements in the queue: \n\t" + programmingLanguages);

        // Removing all the elements in the queue
        System.out.println("Removing all the elements in the queue: ");
        while(!programmingLanguages.isEmpty()) {
            System.out.println("\t" + programmingLanguages.poll());
        }

        // Displaying the elements in the queue
        System.out.println("Elements in the queue: \n\t" + programmingLanguages);
    }
}
