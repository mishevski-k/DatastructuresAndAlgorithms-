import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //  Queue - FIFO data structure: First-In First-Out
        //  A collection designed for holding elements prior to processing
        //  Linear data structure
        //  enqueue: offer()
        //  dequeue: poll()
        //  show head: peek()
        //  test if empty with LinkedList(): isEmpty()

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Kiril");
        queue.offer("Maja");
        queue.offer("Filip");
        queue.offer("Milan");

        System.out.println(queue.isEmpty());

        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);

        String head = queue.poll();
        System.out.println(head);
        System.out.println(queue);

    }
}