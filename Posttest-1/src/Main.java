import java.util.*;

public class Main {

    static ArrayList<Novel> daftarNovel = new ArrayList<>();
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=== MENU PENJUALAN NOVEL ===");
            System.out.println("1. Tambah Novel");
            System.out.println("2. Tampil Novel");
            System.out.println("3. Update Novel");
            System.out.println("4. Hapus Novel");
            System.out.println("5. Tambah Pelanggan");
            System.out.println("6. Tampil Pelanggan");
            System.out.println("0. Exit");

            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> TambahNovel();
                case 2 -> TampilNovel();
                case 3 -> UpdateNovel();
                case 4 -> HapusNovel();
                case 5 -> TambahPelanggan();
                case 6 -> TampilPelanggan();
            }

        } while (pilihan != 0);

        System.out.println("Program selesai");
    }

    static void TambahNovel() {
        System.out.print("Judul : ");
        String judul = input.nextLine();

        System.out.print("Penulis : ");
        String penulis = input.nextLine();

        System.out.print("Harga : ");
        int harga = input.nextInt();
        input.nextLine();

        Novel novel = new Novel(judul, penulis, harga);
        daftarNovel.add(novel);
    }

    static void TampilNovel() {
        if (daftarNovel.isEmpty()) {
            System.out.println("Data kosong");
        } else {
            for (int i = 0; i < daftarNovel.size(); i++) {
                System.out.println("\nNovel ke: " + i);
                System.out.println("Judul   : " + daftarNovel.get(i).judul);
                System.out.println("Penulis : " + daftarNovel.get(i).penulis);
                System.out.println("Harga   : " + daftarNovel.get(i).harga);
            }
        }
    }

    static void UpdateNovel() {
        TampilNovel();

        System.out.print("Pilih Novel : ");
        int index = input.nextInt();
        input.nextLine();

        System.out.print("Judul baru : ");
        String judul = input.nextLine();

        System.out.print("Penulis baru : ");
        String penulis = input.nextLine();

        System.out.print("Harga baru : ");
        int harga = input.nextInt();
        input.nextLine();

        daftarNovel.set(index, new Novel(judul, penulis, harga));
    }

    static void HapusNovel() {
        TampilNovel();

        System.out.print("Pilih novel yang ingin dihapus : ");
        int index = input.nextInt();
        input.nextLine();

        daftarNovel.remove(index);
    }

    static void TambahPelanggan() {
        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("Alamat : ");
        String alamat = input.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama, alamat);
        daftarPelanggan.add(pelanggan);
    }

    static void TampilPelanggan() {
        if (daftarPelanggan.isEmpty()) {
            System.out.println("Data pelanggan kosong");
        } else {
            for (Pelanggan p : daftarPelanggan) {
                System.out.println("Nama   : " + p.nama);
                System.out.println("Alamat : " + p.alamat);
                System.out.println();
            }
        }
    }
}