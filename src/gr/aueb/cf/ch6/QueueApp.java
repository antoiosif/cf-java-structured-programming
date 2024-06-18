package gr.aueb.cf.ch6;

/**
 * Demo of FIFO queues.
 */
public class QueueApp {

    static int[] queue = new int[100];
    static int pivot = -1;

    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);
        enQueue(4);
        int deQueue = deQueue();
        System.out.println("DEQUEUE: " + deQueue);
        System.out.println("TRAVERSE");
        printQueue();
    }

    /**
     * Inserts a num at the end of the queue.
     *
     * @param num   the num to be inserted.
     */
    public static void enQueue(int num) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[++pivot] = num;
    }

    /**
     * Returns (and essentially deletes) the first
     * queue element.
     *
     * @return  the element at the front of the queue.
     */
    public static int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;  // will be solved with exceptions
        }
        int valueToReturn = queue[0];
        pivot--;
        shiftQueueLeft();
        return valueToReturn;
    }

    public static void shiftQueueLeft() {
        for (int i = 0; i <= pivot; i++) {
            queue[i] = queue[i+1];
        }
    }

    /**
     * Returns true if the queue is full.
     *
     * @return  true if the queue is full,
     *          false otherwise.
     */
    public static boolean isFull() {
        return (pivot == queue.length - 1);
    }

    /**
     * Returns true if the queue is empty.
     *
     * @return  true if the queue is empty,
     *          false otherwise.
     */
    public static boolean isEmpty() {
        return (pivot == - 1);
    }

    /**
     * Prints the elements of the queue.
     */
    public static void printQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Queue");
        }
        for (int i = 0; i <= pivot; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
