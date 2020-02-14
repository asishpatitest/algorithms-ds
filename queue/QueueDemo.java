package queue;

public class QueueDemo {

    public static void main(String args[]) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.dequeue();
        queue.enque(5);
        queue.enque(4);
        queue.enque(3);
        queue.enque(2);
        queue.enque(1);
        queue.enque(0);
        queue.dequeue();
        queue.enque(0);
        queue.enque(4);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("Front is : " + queue.getFront());
        System.out.println("Rear is : " + queue.getRear());
        queue.dequeue();
        System.out.println("Front is : " + queue.getFront());
        System.out.println("Rear is : " + queue.getRear());
        queue.dequeue();
        queue.dequeue();
        queue.enque(5);
        queue.enque(4);
        queue.enque(3);
        queue.enque(2);
        System.out.println("Front is : " + queue.getFront());
        System.out.println("Rear is : " + queue.getRear());

    }
}
