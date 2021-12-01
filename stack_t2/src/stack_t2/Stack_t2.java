
package stack_t2;

public class Stack_t2 {

    public static void main(String[] args) {
        stack s1 = new stack(20);

        s1.enqueue(66);
        s1.enqueue(2);
        s1.enqueue(45);


        System.out.println(s1.dequeue());
     


    }

}
