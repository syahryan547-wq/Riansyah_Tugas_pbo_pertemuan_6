package Tugas6;

public class Soal2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla","Suzuki","Civic","Mazda","BMW"};
        for (String wadah : mobil) {
            System.out.println(wadah);

        }
            System.out.println("-------Setelah di ubah-------");

            mobil[1] = "Ferrary";

            for (String wadah2 : mobil) {
                System.out.println(wadah2);
        }
    }
}