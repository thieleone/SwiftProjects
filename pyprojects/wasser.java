import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Wasser {

	private CyclicBarrier barrier;

    private static class Wasserstoff implements Runnable {

        

        public Wasserstoff(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
                while(wcounter>1){
                	Thread.sleep(1000);
                }
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            } catch (InterruptedException ex) {
                Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BrokenBarrierException ex) {
                Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private static class Sauerstoff implements Runnable {

        public Sauerstoff(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
                while(scounter>0){
                	Thread.sleep(1000);
                }
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            } catch (InterruptedException ex) {
                Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BrokenBarrierException ex) {
                Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String args[]) {

        //creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
        final CyclicBarrier cb = new CyclicBarrier(3, new Runnable(){
            @Override
            public void run(){
                //This task will be executed once all thread reaches barrier
                System.out.println("Es konnte ein Wassermolekuel gebildet werden.");
            }
        });

        //starting each of thread
        Thread t1 = new Thread(new Wasserstoff(cb), "Wasserstoff 1");
        Thread t2 = new Thread(new Sauerstoff(cb), "Sauerstoff 1");
        Thread t3 = new Thread(new Sauerstoff(cb), "Sauerstoff 2");
        Thread t4 = new Thread(new Wasserstoff(cb), "Wasserstoff 2");
        Thread t5 = new Thread(new Wasserstoff(cb), "Wasserstoff 3");
        Thread t6 = new Thread(new Wasserstoff(cb), "Wasserstoff 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
      
    }
}