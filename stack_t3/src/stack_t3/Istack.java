/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_t3;

public interface Istack {
        public boolean isEmpty();
    public boolean isFull();
    public Object peek();
    public Object pop();
    public void push(Object Item);
    public int size();
    
}
