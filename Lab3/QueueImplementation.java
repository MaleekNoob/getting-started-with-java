package Lab3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {

    private static void displayRear(Queue<Integer> queue) {
        if (!queue.isEmpty()) {
            int rearElement = queue.peek();
            System.out.println("Rear element of the queue: " + rearElement);
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        displayRear(queue);

        // Dequeue operations
        queue.remove();
        queue.remove();

        // Display the rear element and check if the queue is empty after dequeues
        displayRear(queue);
    }
}
