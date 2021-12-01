/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_t.pkg10;

/**
 *
 * @author GHASEM nasiri
 */
public class queue {

    private Object queue[];
    private int front;
    private int back;

    ;



    public queue(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be > 0");
        }
        queue = new Object[capacity];
        front = 0;
        back = 0;

    }

    public int size() {
        if (back == front) {
            return 0;
        }
        if (back > front) {
            return back - front;
        } else {
            return queue.length + back - front;
        }
    }

    public boolean isEmpty() {
        return front == back;
    }

    public boolean isFull() {
        return size() == queue.length - 1;
    }

    public void enQueue(Object item) {
        if (item == null) {
            throw new IllegalArgumentException("Item is null");
        }
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        queue[back] = item;
        back = (back + 1) % queue.length;

    }

    public Object deQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object frontItem = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        return frontItem;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public void combination() {

    }

}
