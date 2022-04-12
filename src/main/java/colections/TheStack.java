package colections;

import java.util.Stack;

public class TheStack {

    public static void main(String[] args) {
        Stack<String> games = new Stack<>();

        // Add elements to the stack
        games.push("Super Mario Bros.");
        games.push("Tetris");
        games.push("Pacman");
        games.push("Donkey Kong");

        // Display the stack
        System.out.println("The stack contains:");
        for(String game : games) {
            System.out.println("\t" + game);
        }

        // Top of the stack
        System.out.println("\nThe top of the stack is: \n\t" + games.peek());

        // The last element in the stack
        System.out.println("\nThe base of the stack is: \n\t" + games.firstElement());

        // Remove elements from the stack
        System.out.println("\nRemoving elements from the stack:");
        System.out.println("\t" + games.pop());

        // Display the stack
        System.out.println("\nThe stack contains:");
        for(String game : games) {
            System.out.println("\t" + game);
        }

        // Search for an element in the stack
        System.out.println("\nSearching for Super Mario Bros in the stack:");
        System.out.println("\t" + games.search("Super Mario Bros."));

        // Remove all elements from the stack
        System.out.println("\nRemoving all elements from the stack:");
        while(!games.isEmpty()) {
            System.out.println("\t" + games.pop());
        }

        // Display the stack
        System.out.println("\nThe stack contains:");
        for(String game : games) {
            System.out.println("\t" + game);
        }
    }
}
