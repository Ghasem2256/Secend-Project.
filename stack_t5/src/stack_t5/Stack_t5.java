package stack_t5;

public class Stack_t5 {

    public static void main(String[] args) {
        
        String str="(a+b)*(c+d)(((())))";
      System.out.println(count(str)); 

    }

    public static int count(String str) {
        stack s = new stack(str.length() + 1);
        int c=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ( ch == '(') {
                s.push(new Character(ch));
            }
            else if(ch==')'){
                if(s.isEmpty()){
                    return -1;
            }
            char fromStack=((Character)s.pop()).charValue();
            if( (ch==')' &&fromStack=='(')){
                c++;
             
            }
                
                
        }
        }
       

                    
     return c;
    }

}
