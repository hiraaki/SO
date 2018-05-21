package ProdConsApp;

public class Mysem {
    volatile int value;

    public Mysem(int value) {
        this.value = value;
    }
    public synchronized void aquire()throws InterruptedException {
        while (value<=0) wait();
        value--;
        //System.out.println(value);
    }
    public synchronized void release(){
        value++;
        //System.out.println(value);
        notify();
    }
}
