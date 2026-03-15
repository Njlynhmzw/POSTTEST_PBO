import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Novel> daftarNovel = new ArrayList<>();
        ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\n=== Sistem Manajemen Penjualan Novel ===");
            System.out.println("1. Tambah Daftar Novel");
            System.out.println("2. Tampilkan Daftar Novel");
            System.out.println("3. Ubah Daftar Novel");
            System.out.println("4. Hapus Daftar Novel");
            System.out.println("5. Tambah Pelanggan");
            System.out.println("6. Tampil Pelanggan");
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan)
            {
                case 1 -> TambahNovel(daftarNovel, input);
                case 2 -> TampilNovel(daftarNovel);
                case 3 -> UbahDaftarNovel(daftarNovel, input);
                case 4 -> HapusNovel(daftarNovel, input);
                case 5 -> TambahPelanggan(daftarPelanggan, input);
                case 6 -> TampilPelanggan(daftarPelanggan);
            }
        }
        while (pilihan != 0);
        System.out.println("Program selesai");
    }

    static void TambahNovel(ArrayList<Novel> daftarNovel, Scanner input)
    {
        System.out.print("Masukkan judul novel yang baru : ");
        String judul = input.nextLine();
        System.out.print("Masukkan penulis novel yang baru : ");
        String penulis = input.nextLine();
        System.out.print("Masukkan harga novel yang baru : ");
        int harga = input.nextInt();
        input.nextLine();
        Novel novel = new Novel(judul, penulis, harga);
        daftarNovel.add(novel);
        System.out.println("Novel berhasil ditambahkan");
    }

    static void TampilNovel(ArrayList<Novel> daftarNovel)
    {
        if (daftarNovel.isEmpty())
        {
            System.out.println("Daftar novel kosong");
        }
        else
        {
            int i = 1;
            for (Novel novel : daftarNovel)
            {
                System.out.println("Novel : " + i);
                System.out.println("Judul : " + novel.getJudul());
                System.out.println("Penulis : " + novel.getPenulis());
                System.out.println("Harga : " + novel.getHarga());
                System.out.println();
                i++;
            }
        }
    }

    static void UbahDaftarNovel(ArrayList<Novel> daftarNovel, Scanner input)
    {
        TampilNovel(daftarNovel);
        if (!daftarNovel.isEmpty())
        {
            System.out.print("Pilih novel yang ingin diupdate : ");
            int index = input.nextInt() - 1;
            input.nextLine();
            System.out.print("Judul baru : ");
            String judul = input.nextLine();
            System.out.print("Penulis baru : ");
            String penulis = input.nextLine();
            System.out.print("Harga baru : ");
            int harga = input.nextInt();
            input.nextLine();
            daftarNovel.get(index).setJudul(judul);
            daftarNovel.get(index).setPenulis(penulis);
            daftarNovel.get(index).setHarga(harga);
            TampilNovel(daftarNovel);
            System.out.println("Novel berhasil diubah");
        }
    }

    static void HapusNovel(ArrayList<Novel> daftarNovel, Scanner input)
    {
        TampilNovel(daftarNovel);
        if (!daftarNovel.isEmpty())
        {
            System.out.print("Pilih novel yang ingin dihapus : ");
            int index = input.nextInt() - 1;
            input.nextLine();
            daftarNovel.remove(index);
            TampilNovel(daftarNovel);
            System.out.println("Novel berhasil dihapus");
        }
    }

    static void TambahPelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input)
    {
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan alamat : ");
        String alamat = input.nextLine();
        Pelanggan pelanggan = new Pelanggan(nama, alamat);
        daftarPelanggan.add(pelanggan);
        System.out.println("Data pelanggan berhasil ditambah");
    }

    static void TampilPelanggan(ArrayList<Pelanggan> daftarPelanggan)
    {
        if (daftarPelanggan.isEmpty())
        {
            System.out.println("Data pelanggan kosong");
        }
        else
        {
            for (Pelanggan pelanggan : daftarPelanggan)
            {
                System.out.println("Nama : " + pelanggan.getNama());
                System.out.println("Alamat : " + pelanggan.getAlamat());
                System.out.println();
            }
        }
    }
}