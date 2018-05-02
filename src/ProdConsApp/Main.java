package ProdConsApp;

public class Main {
    public static void main(String[] args) {
        ProdCons PC= new ProdCons();
        Thread t1,t2;
        t1=new Thread(new Produtor(PC));
        t2=new Thread(new Consumidor(PC));
        t1.start();
        t2.start();
    }
}
