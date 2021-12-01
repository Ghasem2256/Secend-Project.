/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_t6;

/**
 *
 * @author GHASEM nasiri
 */
public class stack {
     
    private Object [] stack ;
    private int top ;
    

    
    public stack(int capacity) {

        stack = new Object[capacity];
        top = -1;
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

    public void push(Object item) {
        if (item == null) {
            throw new IllegalArgumentException("Item is null");
        }
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        top = top + 1;
        stack[top] = item;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object topItem = stack[top];
        stack[top] = null;
        top = top - 1;
        return topItem;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }
    
}
