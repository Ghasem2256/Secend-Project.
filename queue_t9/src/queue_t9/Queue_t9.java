package queue_t9;

public class Queue_t9 {

    public static void main(String[] args) {
        queue q1 = new queue(10);
        q1.enQueue(5);
        q1.enQueue(8);
        q1.enQueue(15);
        q1.enQueue(9);  // 5  8  15  9  ->9  8  15  5
      

        queue q2 = new queue(q1.size());
        Object x = q1.deQueue();
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.enQueue(q1.deQueue());
        }

        q1.enQueue(x);

        while (!q1.isEmpty()) {
            System.out.print(q1.deQueue() + " ");
        }

    }

}
