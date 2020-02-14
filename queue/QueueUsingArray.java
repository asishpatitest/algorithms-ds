package queue;

/*
 * This behaves like a circular queue
 */
public class QueueUsingArray {
    private int queue[];
    private int rear;
    private int front;
    private int size;
    private int capacity;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        rear = -1;
        front = 0;
        size = 0;
    }

    /*
     * O(1) time and space
     */
    public boolean isEmpty() {
        if( size == 0 ) {
            return true;
        }
        return false;
    }

    /*
     * O(1) time and space
     */
    public boolean isFull() {
        if(size == capacity) {
            return true;
        }
        return false;
    }

    /*
     * O(1) time and space
     */
    public void enque(int element) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if(rear == (capacity - 1)) {
            rear = 0;
            queue[rear] = element;
        } else {
            rear++;
            queue[rear] = element;
        }
        size++;
        System.out.println("Element is added");
    }

    /*
     * O(1) time and space
     */
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if(front == (capacity - 1)) {
            front = 0;
            size--;
        } else {
            front++;
            size--;
        }
        System.out.println("Element is removed");
    }

    /*
     * O(1) time and space
     */
    public int getFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    /*
     * O(1) time and space
     */
    public int getRear() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[rear];
    }

}
