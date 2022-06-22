import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Priority Queue: A FIFO data structure that servers elements with the highest priorities first, before elements with lower priorities.

        Queue<Double> scoreQueue = new PriorityQueue<>();

        scoreQueue.offer(2.0);
        scoreQueue.offer(1.5);
        scoreQueue.offer(5.0);
        scoreQueue.offer(3.2);

        while(!scoreQueue.isEmpty()){
            System.out.println(scoreQueue.poll());
        }

        System.out.println("==========");

        Queue<Double> scoreQueueReversed = new PriorityQueue<>(Collections.reverseOrder());

        scoreQueueReversed.offer(2.0);
        scoreQueueReversed.offer(1.5);
        scoreQueueReversed.offer(5.0);
        scoreQueueReversed.offer(3.2);

        while(!scoreQueueReversed.isEmpty()){
            System.out.println(scoreQueueReversed.poll());
        }

        System.out.println("==========");

        Queue<String> gradeQueue = new PriorityQueue<>();

        gradeQueue.offer("C");
        gradeQueue.offer("B");
        gradeQueue.offer("F");
        gradeQueue.offer("E");

        while(!gradeQueue.isEmpty()){
            System.out.println(gradeQueue.poll());
        }

        System.out.println("==========");

        Queue<String> gradeQueueReversed = new PriorityQueue<>(Collections.reverseOrder());

        gradeQueueReversed.offer("C");
        gradeQueueReversed.offer("B");
        gradeQueueReversed.offer("F");
        gradeQueueReversed.offer("E");

        while(!gradeQueueReversed.isEmpty()){
            System.out.println(gradeQueueReversed.poll());
        }

        System.out.println("==========");

    }
}