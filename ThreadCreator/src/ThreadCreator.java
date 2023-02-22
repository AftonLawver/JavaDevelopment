import java.lang.*;
import java.util.Random;

 class PrintTask implements Runnable {

   private final int sleepTime;
   private final String taskName;
   private final static Random gen= new Random();
   
   public PrintTask(String name){
           taskName = name;
           sleepTime= gen.nextInt(5000);
        }

   public void run() {

         
         try {
            System.out.printf("%s going to sleep for %d milliseconds. \n", taskName, sleepTime);
            // thread to sleep for random milliseconds
            Thread.sleep(sleepTime);
         } catch (InterruptedException e) {
            System.out.println(e);
         }
       System.out.printf("%s done sleeping. \n", taskName);
      }
   }

public class ThreadCreator{

   public static void main(String[] args) throws Exception {

      Thread t1 = new Thread(new PrintTask("task 1"));
      Thread t2 = new Thread(new PrintTask("task 2"));
      Thread t3 = new Thread(new PrintTask("task 3"));
      // this will call run() function
      t1.start(); 
      t2.start(); 
      t3.start();

      t1.join();
      t2.join();
      t3.join();
     
     System.out.printf("Tasks started. main ends. \n");
   }
} 