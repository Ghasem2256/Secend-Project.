
package stack_t1;


public class Stack_t1 {

    public static void main(String[] args) {
        stack s = new stack(10);

        s.push(52);
        s.push(6);
        s.push(254);
        s.push(963);
        s.push(25);
        s.push(125);
        stack firstStack = new stack(s.size());
        while (!s.isEmpty()) {

            System.out.print(s.peek() + " ");
            firstStack.push(s.pop());

        }
        System.out.println();

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
