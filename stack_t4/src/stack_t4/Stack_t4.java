/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_t4;

/**
 *
 * @author GHASEM nasiri
 */
public class Stack_t4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack s = new stack(10);
        
        s.push(23);
        s.push(6);
        s.push(58);
        s.push(69);
        s.push(98);
        s.push(125);
        stack firstStack = new stack(s.size());
        while(!s.isEmpty()){
            
            System.out.print(s.peek()+" ");
            firstStack.push(s.pop());
            
            
        } System.out.println();

        stack s2 = new stack(firstStack.size() + 1);
        while (!firstStack.isEmpty()) {
            int temp = (int) firstStack.pop();
            while (!s2.isEmpty() && (int) s2.peek() < temp) {
                firstStack.push(s2.pop());

            }
            s2.push(temp);
        }

        while (!s2.isEmpty()) {
            System.out.print(s2.pop() + " ");
        }

    }

}
