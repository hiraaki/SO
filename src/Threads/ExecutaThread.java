package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutaThread {
    public static void main(String args[]) throws InterruptedException{
        /*Thread t1;
        Thread t2;
        t1= new Thread(new ThreadInterface());
        t2= new Thread(new ThreadInterface());
        t1.start(); // inicia a execução da Thread
        t2.start(); // inicia a execução da Thread
        System.out.println("Thread inicializadas");
        t1.join();
        // Aguarda a thread t1 finalizar
        t2.join();
        // Aguarda a thread t1 finalizar
        System.out.println("Thread finalizadas");*/
        ExecutorService executor = Executors.newCachedThreadPool();
            for(int i =0; i<5;i++){
                executor.execute(new ThreadInterface());
            }
        System.out.println("Threads executadas");
        executor.shutdown();
    }
}
