package work.jimmmy.prep.exam1;

/**
 * 设计循环队列
 */
public class Solutions622 {
    private int[] circularQueue;

    private int head;

    private int tail;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public Solutions622(int k) {
        circularQueue = new int[k + 1];
        head = 0;
        tail = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        circularQueue[tail] = value;
        tail = (tail + 1) % circularQueue.length;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % circularQueue.length;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return circularQueue[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return circularQueue[(tail - 1 + circularQueue.length) % circularQueue.length];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == tail;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (tail + 1) % circularQueue.length == head;
    }
}
