package ProdutorConsumidor;

import java.util.Random;

public class Produtor implements Runnable{
    private Conta c;
    private Random r= new Random();
    public Produtor(Conta _c){
        c= _c;
    }
    public void run(){
        while (true){
            c.transfereCC(r.nextInt(1000));
            c.transferePoupanca(r.nextInt(500));
        }
    }
}