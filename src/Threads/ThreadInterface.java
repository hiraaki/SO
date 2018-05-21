package Threads;



import java.util.concurrent.Semaphore;

public class ThreadInterface{
    Semaphore sem= new Semaphore(1);

    public void funcaoA(){
        
        sem.release();

        for (int i = 0; i < 20; i++) {
            System.out.println("Thread[" + Thread.currentThread().
                    getName() + "]=" + i);
        }



    }
    public void funcaoB(){

        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread[" + Thread.currentThread().
                    getName() + "]=" + i);
        }

    }
}
