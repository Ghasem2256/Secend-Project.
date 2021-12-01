package stack_t2;

public class stack {

    private Object[] stack;
    private Object[] stack2;
    private int top;
    private int top2;

    public stack(int capacity) {

        stack = new Object[capacity];
        stack2 = new Object[capacity];
        top = -1;
        top2 = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return size() == stack.length;
    }

    public void enqueue(Object item) {
        if (item == null) {
            throw new IllegalArgumentException("Item is null");
        }
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        top = top + 1;
        stack[top] = item;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        while (top != -1) {
            Object topItem = stack[top];
            top2++;
            stack2[top2] = topItem;
            stack[top] = null;
            top = top - 1;
        }
        Object x = stack2[top2];
        while (top2 != -1) {
            Object topItem = stack2[top2];
            top++;
            stack[top] = topItem;
            stack2[top2] = null;
            top2 = top2 - 1;

        }
        return x;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

}
