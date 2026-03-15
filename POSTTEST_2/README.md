# POSTTEST 2
## Sistem Manajemen Penjualan Novel

### Nama : Nou Julyanah Mazuwa
### NIM : 2409106066
### Kelas : B1' 24

---

# Deskripsi Program
Program ini dibuat untuk menjelaskan tentang sistem management penjualan novel dengan berbagai fungsi utama, seperti menambah, menampilkan, memperbarui, dan menghapus data novel yang tersimpan di dalam program.
Sistem ini memanfaatkan ArrayList sebagai tempat penyimpanan data sehingga data dapat dikelola secara dinamis selama program berjalan.

Program juga telah menerapkan konsep Encapsulation. Encapsulation merupakan konsep dalam pemrograman berorientasi objek yang digunakan untuk membatasi akses langsung terhadap data di dalam class dengan menggunakan access modifier serta method getter dan setter.

Pada program ini, data pada class Novel dan Pelanggan dibuat dengan access modifier private, sehingga tidak dapat diakses secara langsung dari luar class. Untuk mengakses dan mengubah data tersebut digunakan method getter dan setter.

---

# Penjelasan Class

## Class Novel
Class Novel digunakan untuk menyimpan data novel yang terdapat pada sistem penjualan novel. Class ini menerapkan konsep Encapsulation dengan menggunakan access modifier private serta method getter dan setter untuk mengakses data.

Atribut yang terdapat pada class Novel yaitu:

- judul → menyimpan judul novel
- penulis → menyimpan nama penulis novel
- harga → menyimpan harga novel

Atribut tersebut dibuat private sehingga tidak dapat diakses langsung dari luar class dan hanya dapat diakses menggunakan getter dan setter.

---

## Class Pelanggan
Class Pelanggan digunakan untuk menyimpan data pelanggan pada sistem penjualan novel.

Class ini juga menerapkan konsep Encapsulation dengan membuat atribut bersifat private dan mengaksesnya menggunakan method getter dan setter.

Atribut pada class Pelanggan yaitu:

- nama → menyimpan nama pelanggan
- alamat → menyimpan alamat pelanggan

Dengan adanya class ini, data pelanggan dapat dikelola secara lebih terstruktur di dalam program.

---

# Penjelasan Fungsi Program

## Fungsi TambahNovel()
Fungsi TambahNovel() digunakan untuk menambahkan data novel baru ke dalam sistem. Program akan meminta pengguna memasukkan judul novel, penulis, dan harga novel kemudian data tersebut disimpan ke dalam ArrayList daftarNovel.

---

## Fungsi TampilNovel()
Fungsi TampilNovel() digunakan untuk menampilkan seluruh data novel yang tersimpan di dalam sistem. Jika daftar novel kosong maka program akan menampilkan pesan bahwa data kosong.

---

## Fungsi UbahDaftarNovel()
Fungsi UbahDaftarNovel() digunakan untuk memperbarui data novel yang sudah ada. Program akan menampilkan daftar novel terlebih dahulu kemudian pengguna memilih novel yang ingin diubah dan memasukkan data novel yang baru.

---

## Fungsi HapusNovel()
Fungsi HapusNovel() digunakan untuk menghapus data novel dari sistem. Program akan menampilkan daftar novel kemudian pengguna memilih novel yang ingin dihapus.

---

## Fungsi TambahPelanggan()
Fungsi TambahPelanggan() digunakan untuk menambahkan data pelanggan ke dalam sistem. Program akan meminta pengguna memasukkan nama dan alamat pelanggan kemudian data tersebut disimpan ke dalam ArrayList daftarPelanggan.

---

## Fungsi TampilPelanggan()
Fungsi TampilPelanggan() digunakan untuk menampilkan data pelanggan yang tersimpan di dalam sistem.

---

# Tampilan Program

## Menu Utama Program
![main.png](../../POSTTEST_2/POSTTEST_2/Assets/main.png)

Menu utama berfungsi untuk memilih fitur yang tersedia pada sistem manajemen penjualan novel.

---

## Menu 1 : Tambah Novel
![Tambah-novel.png](../../POSTTEST_2/POSTTEST_2/Assets/Tambah-novel.png)

Program akan meminta pengguna untuk menginputkan **judul, penulis, dan harga novel** yang ingin ditambahkan ke dalam daftar novel. Setelah data dimasukkan, sistem akan menampilkan pesan bahwa **novel berhasil ditambahkan**.

---

## Menu 2 : Tampilkan Daftar Novel
![TampilNovel.png](../../POSTTEST_2/POSTTEST_2/Assets/TampilNovel.png)

Program akan menampilkan **seluruh daftar novel** yang tersimpan di dalam sistem.

---

## Menu 3 : Ubah Data Novel
![UpdateNovel.png](../../POSTTEST_2/POSTTEST_2/Assets/UpdateNovel.png)

Program akan menampilkan daftar novel terlebih dahulu, kemudian pengguna diminta untuk **memilih novel yang ingin diubah**. Setelah itu pengguna dapat menginputkan **judul, penulis, dan harga baru** dari novel tersebut. Sistem kemudian akan menampilkan pesan bahwa **data novel berhasil diubah**.

---

## Menu 4 : Hapus Data Novel
![Hapusnovel.png](../../POSTTEST_2/POSTTEST_2/Assets/Hapusnovel.png)

Program akan menampilkan daftar novel dan meminta pengguna untuk memilih **novel yang ingin dihapus**. Setelah dipilih, sistem akan menghapus data tersebut dan menampilkan pesan bahwa **novel berhasil dihapus**.

---

## Menu 5 : Tambah Pelanggan
![tambah-pelanggan.png](../../POSTTEST_2/POSTTEST_2/Assets/tambah-pelanggan.png)

Program akan meminta pengguna untuk menginputkan **nama dan alamat pelanggan** yang akan disimpan ke dalam sistem.

---

## Menu 6 : Tampilkan Data Pelanggan
![Tampil-pelanggan.png](../../POSTTEST_2/POSTTEST_2/Assets/Tampil-pelanggan.png)

Program akan menampilkan **data pelanggan** yang telah tersimpan di dalam sistem.

---

# Kesimpulan
Program ini menunjukkan penerapan konsep Object Oriented Programming (OOP) dalam bahasa pemrograman Java dengan memanfaatkan ArrayList untuk menyimpan data serta menerapkan konsep Encapsulation dengan menggunakan access modifier dan method getter setter untuk mengatur akses terhadap data pada class.