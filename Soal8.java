package Tugas6;

class mythread1 extends Thread{
    public void run(){
        System.out.println("ini dari Thread 1");
    }
}
class mythread2 extends Thread{
    public void run(){
        System.out.println("ini dari Thread 2");
    }
}
class mythread3 extends Thread{
    public void run(){
        System.out.println("ini dari Thread 3");
    }
}
public class Soal8 {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        t1.start();
        mythread2 t2 = new mythread2();
        t2.start();
        mythread3 t3 = new mythread3();
        t3.start();
        System.out.println("INi DARI MAIN");
    }
}