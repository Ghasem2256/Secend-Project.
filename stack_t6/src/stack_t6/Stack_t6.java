
package stack_t6;

public class Stack_t6 {

    public static void main(String[] args) {
  
        String str = "())(a+b)*(((()";
        System.out.println(count(str));

    }

    public static int count(String str) {
        stack s = new stack(str.length() + 1);
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ( ch == '(') {
                s.push(new Character(ch));
                
            } else if ( ch == ')') {
                if (s.isEmpty()) {
                    s.push(new Character(ch));
                }
                char fromStack = ((Character) s.peek()).charValue();
                if ( (ch == ')' && fromStack == '(')) {
                    s.pop();

                }

            }
        }

        return s.size();

    }

}
