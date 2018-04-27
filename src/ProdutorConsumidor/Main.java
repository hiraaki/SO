package ProdutorConsumidor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){
        Conta c;
        c=new Conta(2000,3000);
        ExecutorService execut= Executors.newCachedThreadPool();
            execut.execute(new Produtor(c));
            execut.execute(new Consumidor(c,2000+3000));
        execut.shutdown();
    }
}
