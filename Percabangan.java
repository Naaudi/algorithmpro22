import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, keterangan;
        int nilai;
        System.out.print("Masukkan nama : ");
        nama = input.next();
        System.out.print("Masukkan nilai : ");
        nilai = input.nextInt();

        if (nilai >= 60) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak lulus";
        }

        System.out.println(nama + " " + keterangan);

    }
}