package Tugas6;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("masukan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        ArrayList<Object> namamahasiswa = new ArrayList<Object>(); 
        ArrayList<Object> nilaimahasiswa = new ArrayList<Object>(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("input untuk mahasiswa ke - " + (i + 1));
            System.out.print("masukan nama : ");
            String nama = input.nextLine();
            System.out.print("masukan nilai : ");
            int nilai = input.nextInt();
            input.nextLine();

            namamahasiswa.add(nama);
            nilaimahasiswa.add(nilai);

        }
        System.out.println("------Daftar nilai mahasiswa------");
        System.out.print("NAMA" + "        ");
        System.out.print("NILAi " + "       ");
        System.out.println("STATUS ");

        for (int i = 0; i < jumlah; i++) {
            System.out.print(namamahasiswa.get(i) + "        ");
            System.out.print(nilaimahasiswa.get(i) + "          ");

            int nilaiMhs = (int) nilaimahasiswa.get(i);

            if (nilaiMhs >= 50) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }
        }



    }
}