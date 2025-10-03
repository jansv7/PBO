package Satu;
import java.util.Scanner;

public class ManajemenHewan {
    private static Hewan[] daftarHewan = new Hewan[100];
    private static int jumlahHewan = 0;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Aplikasi Manajemen Hewan Peliharaan ===");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Lihat Daftar Hewan");
            System.out.println("3. Pilih Hewan untuk Aksi");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tambahHewan();
                case 2 -> tampilkanHewan();
                case 3 -> aksiHewan();
                case 0 -> System.out.println("Terima kasih sudah menggunakan aplikasi.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    private static void tambahHewan() {
        System.out.println("\nPilih jenis hewan:");
        System.out.println("1. Anjing");
        System.out.println("2. Kucing");
        System.out.print("Pilihan: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Umur: ");
        int umur = input.nextInt();

        Hewan hewan = null;
        if (jenis == 1) {
            hewan = new Anjing(nama, umur);
        } else if (jenis == 2) {
            hewan = new Kucing(nama, umur);
        }

        if (hewan != null && jumlahHewan < daftarHewan.length) {
            daftarHewan[jumlahHewan] = hewan;
            jumlahHewan++;
            System.out.println("Hewan berhasil ditambahkan!");
        } else {
            System.out.println("Data hewan penuh!");
        }
    }

    private static void tampilkanHewan() {
        if (jumlahHewan == 0) {
            System.out.println("Belum ada hewan yang ditambahkan.");
        } else {
            System.out.println("\n=== Daftar Hewan ===");
            for (int i = 0; i < jumlahHewan; i++) {
                System.out.print((i+1) + ". ");
                daftarHewan[i].info();
            }
        }
    }

    private static void aksiHewan() {
        if (jumlahHewan == 0) {
            System.out.println("Belum ada hewan yang ditambahkan.");
            return;
        }

        tampilkanHewan();
        System.out.print("Pilih nomor hewan: ");
        int idHewan = input.nextInt() - 1;

        if (idHewan >= 0 && idHewan < jumlahHewan) {
            Hewan h = daftarHewan[idHewan];
            System.out.println("1. Makan");
            System.out.println("2. Tidur");
            System.out.println("3. Bersuara");
            System.out.print("Pilih aksi: ");
            int aksi = input.nextInt();

            switch (aksi) {
                case 1 -> h.makan();
                case 2 -> h.tidur();
                case 3 -> h.bersuara();
                default -> System.out.println("Aksi tidak valid!");
            }
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }
}