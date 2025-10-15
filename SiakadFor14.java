import java.util.Scanner;

public class SiakadFor14 {
    public static void main(String[] args) {
        double nilai, tertinggi = 0, terendah = 100;
        int i = 1;
        int lulus = 0, tidakLulus = 0;
        Scanner sc = new Scanner(System.in);

        while (i <= 10) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
            i++;
        }
        
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
}
