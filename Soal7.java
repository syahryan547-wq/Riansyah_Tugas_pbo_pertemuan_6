package Tugas6;

class mythread extends Thread{
    public void run(){
        System.out.println("ini rasyid lewat Thread");
}
}
public class Soal7 {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        t1.start();
        System.out.println("ini rasyid dari main");
    }
}