import java.util.Scanner;

public class TugasParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }
            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi tidak valid!");
                continue;
            }

            int bayar = 0;
            if (durasi > 5) {
                bayar = 12500;
            } else if (jenis == 1) {
                bayar = durasi * 3000;
            } else if (jenis == 2) {
                bayar = durasi * 2000;
            }

            System.out.println("Pembayaran parkir: Rp " + bayar);
            total += bayar;
        }

        System.out.println("Total pembayaran parkir hari ini: Rp " + total);
    }
}
