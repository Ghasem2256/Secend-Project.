package stack_t12;

public class Stack_t12 {

    public static void main(String[] args) {
        String input = "24+46+*";
       
        
        stack calc = new stack(input.length() + 1);

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int x = 0;
            int y = 0;
            int r = 0;
            if (Character.isDigit(c)) {
                int t = Character.getNumericValue(c);
                calc.push(t);
            } else if (c == '+') {
                x = (int) calc.pop();
                y = (int) calc.pop();
                r = x + y;
                calc.push(r);
            } else if (c == '-') {
                x = (int) calc.pop();
                y = (int) calc.pop();
                r = x - y;
                calc.push(r);
            } else if (c == '*') {
                x = (int) calc.pop();
                y = (int) calc.pop();
                r = x * y;
                calc.push(r);
            } else if (c == '/') {
                x = (int) calc.pop();
                y = (int) calc.pop();
                r = x / y;
                calc.push(r);
            }

        }
        int a = (int) calc.pop();
        System.out.println(a);
    }
}
