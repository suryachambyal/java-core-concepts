package J06_QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {

    public static void main(String[] args) {

        // Creating a Queue using LinkedList implementation
        Queue<Integer> queue = new LinkedList<>();

        // Queue follows FIFO (First In First Out)

        // add() - inserts element (throws exception if insertion fails)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Initial Queue: " + queue);

        // offer() - inserts element (returns false if insertion fails)
        queue.offer(60);
        System.out.println("After offer(60): " + queue);

        // peek() - retrieves head element without removing it
        System.out.println("peek(): " + queue.peek());
        System.out.println("Queue after peek(): " + queue);

        // element() - retrieves head element without removing it
        // throws exception if queue is empty
        System.out.println("element(): " + queue.element());

        // poll() - retrieves and removes head element
        System.out.println("poll(): " + queue.poll());
        System.out.println("Queue after poll(): " + queue);

        // remove() - retrieves and removes head element
        // throws exception if queue is empty
        System.out.println("remove(): " + queue.remove());
        System.out.println("Queue after remove(): " + queue);

        // size() - returns number of elements in queue
        System.out.println("Queue size: " + queue.size());

        // contains() - checks whether an element exists
        System.out.println("Contains 30? " + queue.contains(30));
        System.out.println("Contains 100? " + queue.contains(100));

        // isEmpty() - checks whether queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // clear() - removes all elements from queue
        queue.clear();

        System.out.println("Queue after clear(): " + queue);
        System.out.println("Is queue empty after clear()? " + queue.isEmpty());
    }
}