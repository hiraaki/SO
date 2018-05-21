package ProdConsApp;

public class Produtor implements Runnable{
    ProdCons PC;

    public Produtor(ProdCons PC) {
        this.PC = PC;
    }

    @Override
    public void run() {
        for(int i=0; i<Integer.MAX_VALUE;i++){
                PC.produz(i);
            //System.out.println("p"+i);
        }
    }
}
