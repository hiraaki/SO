package ProdutorConsumidor;

public class Consumidor implements Runnable{
    private Conta c;
    private int saldoInicial;
    public Consumidor(Conta _c, int _saldoInicial){
        c= _c;
        saldoInicial=_saldoInicial;
    }
    public void run(){
        int saldo;
        while (true){
            saldo= c.saldoTotal();
            if (saldo != saldoInicial){
                System.out.println("Saldo errado = "+saldo);
                Thread.currentThread().yield();
            }
        }
    }
}