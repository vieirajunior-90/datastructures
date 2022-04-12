package colections;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Alejandro");
        queue.offer("Juan");
        queue.offer("Maria");
        queue.offer("Pedro");
        queue.offer("Clarisa");

        // Queue contains
        System.out.println("The queue contains: \n\t" + queue);

        // Queue peek
        System.out.println("The first person in the queue is: \n\t" + queue.peek());

        // Queue last element
        System.out.println("The last person in the queue is: \n\t" + queue.stream().reduce((a, b) -> b).get());

        // Queue poll
        System.out.println("The first person to get out of queue is: \n\t" + queue.poll());

        // Queue contains
        System.out.println("The queue contains: \n\t" + queue);

        // Queue size
        System.out.println("The size of the queue is: \n\t" + queue.size());

        // Queue is empty
        System.out.println("The queue is empty: \n\t" + queue.isEmpty());
    }
}
