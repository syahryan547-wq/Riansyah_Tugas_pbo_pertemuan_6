package Tugas6;

public class Soal3 {
    public static void main(String[] args) {

        int[] data = new int[5];

        int indexkecil = 0;
        int indexbesar = 0;

        data[0] = 30;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;
        data[4] = 50;

        int terbesar = data[0];
        int terkecil = data[0];

        int total = 0;
        int hasil = 0;

        for (int i = 0; i < data.length; i++) {
            if(data[i] < terkecil){
                terkecil = data[i];
                indexkecil = i;
            }

            if(data[i] > terbesar){
                terbesar = data[i];
                indexbesar = i;
            }

            total = total + data[i];
        }

        for (int i = 0; i < data.length; i+=2) {
            hasil = hasil + data[i];


        }

        double rata = total/5;

        System.out.println("data terkecil adalah : " + terkecil + " berada pada index : " + indexkecil);
        System.out.println("data terbesar adalah : " + terbesar + " berada pada index : " + indexbesar);
        System.out.println("hasil di jumlahkan : " + total);
        System.out.println("rata-rata : " + rata);
        System.out.println("penjumlahan genap : " + hasil);
        if(hasil % 2 ==0){
            System.out.println("hasil merupakan bilangan genap");
        }else{
            System.out.println("hasil merupakan bilangan ganjil");
        }
        System.out.println("semua data array");
        for (int wadah : data) {
            System.out.println(wadah);
        }
    }
}