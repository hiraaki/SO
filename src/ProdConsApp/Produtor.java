package ProdConsApp;

public class Produtor implements Runnable{
    ProdCons PC;

    public Produtor(ProdCons PC) {
        this.PC = PC;
    }

    @Override
    public void run() {
        for(int i=0; i<100;i++){
            PC.Consome();
        }
    }
}
