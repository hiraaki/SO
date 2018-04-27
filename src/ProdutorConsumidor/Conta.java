package ProdutorConsumidor;

public class Conta {
    int saldoPoupanca;
    int saldoCC;
    public Conta(int _saldoPoupanca, int _saldoCC){
        saldoPoupanca= _saldoPoupanca;
        saldoCC= _saldoCC;
    }
    public synchronized void transferePoupanca(int v){
        saldoCC -= v;
        saldoPoupanca +=v;
    }
    public synchronized void transfereCC(int v){
        saldoPoupanca -=v;
        saldoCC +=v;
    }
    public synchronized int saldoTotal(){
        return (saldoPoupanca + saldoCC);
    }
}
