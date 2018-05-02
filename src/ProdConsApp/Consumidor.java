package ProdConsApp;

public class Consumidor implements Runnable {
    ProdCons PC;

    public Consumidor(ProdCons PC) {
        this.PC = PC;
    }

    @Override
    public void run() {
        for(int i=0; i<100;i++){
            PC.produz(i);
        }
    }
}
