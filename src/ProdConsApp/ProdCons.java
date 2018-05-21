package ProdConsApp;

public class ProdCons {
    int N = 5;
    volatile int b[] = new int[5];
    volatile int out = 0;
    volatile int in = 0;
    //volatile int count = 0;
    volatile Mysem sem = new Mysem(1);
    volatile Mysem full = new Mysem(5);
    volatile Mysem empty = new Mysem(0);
    void produz(int produto) {

        try {
            full.aquire();
        }catch (Exception e){
            System.out.println("falll");
        }
        try {
            sem.aquire();
        }catch (Exception e){
            System.out.println("falll");
        }
        b[in] = produto;
        System.out.println("produsido:" + b[in]);
        double a = Double.MAX_VALUE - Double.MIN_VALUE;
        double b = Double.MAX_VALUE * Double.MIN_VALUE;
        in = (in + 1) % N;
        sem.release();
        empty.release();

    }

    void Consome() {
        int d;
        try {
            empty.aquire();
        }catch (Exception e){
            System.out.println("falll");
        }
        try {
            sem.aquire();
        }catch (Exception e){
            System.out.println("falll");
        }
        d = b[out];
        double a = Double.MAX_VALUE + Double.MIN_VALUE;
        double b = Double.MAX_VALUE / Double.MIN_VALUE;
        out = (out + 1) % N;
        System.out.println("consumido:" + d);
        sem.release();
        full.release();
    }

}
