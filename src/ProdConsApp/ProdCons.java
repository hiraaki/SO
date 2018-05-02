package ProdConsApp;

public class ProdCons {
    int N = 5;
    int b[] = new int[5];
    int count = 0;

    void produz(int produto) {
        int in = 0;
        while (count == N) {
            b[in] = produto;
            in = (in + 1) % N;
            count++;
        }
    }

    void Consome() {
        int out = 0;
        int d;
        while (count == 0) ;
        d = b[out];
        System.out.println("consumido:" + d);
        out = (out + 1) % N;
        count--;

    }

}
