import java.util.Scanner;

public class TugasBioskop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int hargaTiket=50000, totalTiket=0, totalPenjualan=0;
        int jumlahTiket, diskon, harga, potongan, bayar;

        do {
            System.out.print("Masukkan jumlah tiket : ");
            jumlahTiket=sc.nextInt();

            if (jumlahTiket<0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
            } else if (jumlahTiket>0) {
                harga=jumlahTiket*hargaTiket;

                if (jumlahTiket>10) {
                    diskon=15;
                } else if (jumlahTiket>4) {
                    diskon=10;
                } else {
                    diskon=0;
                }

                potongan=harga*diskon/100;
                bayar=harga-potongan;

                System.out.println("Diskon : "+diskon+"%");
                System.out.println("Total bayar : Rp "+bayar);

                totalTiket=totalTiket+jumlahTiket;
                totalPenjualan=totalPenjualan+bayar;
            }
        } while (jumlahTiket != 0);

        System.out.println("---- Penjualan Tiket Hari Ini ----");
        System.out.println("Total tiket terjual : "+totalTiket);
        System.out.println("Total penjualan : Rp "+totalPenjualan);
    }
}