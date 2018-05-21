package Threads;

public class threadA implements Runnable {
    ThreadInterface PC;
    public threadA(ThreadInterface PC) {
        this.PC = PC;
    }

    public void run(){
        PC.funcaoA();
    }

}