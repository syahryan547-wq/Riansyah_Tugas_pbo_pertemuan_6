package Tugas6;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
             int hasil = 0;

            System.out.print("masukan jumlah bilangan : ");
            int jumlah = input.nextInt();

            int data[] = new int[jumlah];

            for (int i = 0; i < jumlah; i++) {
                System.out.print("masukan bilangan ke - " + (i + 1) + " :");
                data[i] = input.nextInt();

            }

            System.out.println("------data yang telah di input-----");
            for (int wadah : data) {
                System.out.println(wadah);
                hasil = hasil + wadah;
            }

            double rata = hasil/jumlah;
            System.out.println("-------rata rata nilai-----");
            System.out.println(rata);

        }catch(Exception e){
            System.out.println("INPUT HARUS SEBUAH BILANGAN!!!!");
        }

    }
}