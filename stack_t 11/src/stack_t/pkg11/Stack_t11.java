
package stack_t.pkg11;


public class Stack_t11 {


    public static void main(String[] args) {
   

        int n = 7;
        int d = 5;
        int arr[] = {10, 54, 87, 36, 123, 258, 1, 4};
        int arr2[]=new int [arr.length];
        int i=0;

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        stack s1 = new stack(arr.length + 1);
   

        for (int y : arr) {
            s1.push(y);
        }
        stack s2 = new stack(s1.size());


   
        while (!s1.isEmpty()) {
            int temp = (int) s1.pop();
            while (!s2.isEmpty() && (int) s2.peek() < temp) {
                s1.push(s2.pop());

            }
            s2.push(temp);}
           while (!s2.isEmpty()) {
               arr2[i]=(int) s2.pop();
               i++;
          
        }
        for(int u:arr2)
               System.out.print(u + " ");

        }

    }
