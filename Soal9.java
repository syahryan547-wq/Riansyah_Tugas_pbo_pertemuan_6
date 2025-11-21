package Tugas6;

public class Soal9 {
    public static void main(String[] args) {
        int[] usia = {12,4,5,2,6};

        System.out.println("pakai for");
        for (int i = 0; i < 5; i++) {
            System.out.print(usia[i] + ",");
        }
        System.out.println("");
        System.out.println("pakai while");
        int i = 0;
        while (i < 5){
            System.out.print(usia[i] + ",");
            i++;
        }
        System.out.println("");


    }
}