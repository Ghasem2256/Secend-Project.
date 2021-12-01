package queue_t.pkg10;

public class Queue_t10 {

    public static void main(String[] args) {

        queue q1 = new queue(6);

        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        int x=q1.size();
        queue q2 = new queue(q1.size() / 2+1);
        queue q3 = new queue(q1.size() / 2+1);
        for (int i = 0; i <= q1.size() / 2; i++) {
            q2.enQueue(q1.deQueue());
        }
        for (int i = q1.size() / 2; i <= q1.size() + 1; i++) {
            q3.enQueue(q1.deQueue());
        }
        for(int j=0;j<=q2.size();j++){
             q1.enQueue(q2.deQueue());
              q1.enQueue(q3.deQueue());
        }
        
        for(int i=0;i<x;i++){
        System.out.print(q1.deQueue()+" ");     
        }
        
       

     //   System.out.println(q1.size());
       
       // System.out.println(q3.size());

      
       

    }

  
}
