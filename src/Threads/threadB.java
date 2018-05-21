package Threads;

public class threadB implements Runnable {
    ThreadInterface PC;
    public threadB(ThreadInterface PC) {
        this.PC = PC;
    }

    public void run(){
        PC.funcaoB();
    }

}