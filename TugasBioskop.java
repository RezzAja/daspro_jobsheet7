import java.util.Scanner;

public class TugasBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;
        final int hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = jumlahTiket * hargaTiket;
            totalBayar = totalBayar - (totalBayar * diskon);

            System.out.println("Total bayar untuk pembelian ini: Rp " + (int)totalBayar);

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;
        }

        System.out.println("Total tiket terjual hari ini: " + totalTiket);
        System.out.println("Total penjualan tiket hari ini: Rp " + (int)totalPenjualan);
    }
}
