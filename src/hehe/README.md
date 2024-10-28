# Pinjaman Online

Proyek ini adalah aplikasi sederhana untuk mengelola data peminjaman dan menghitung bunga serta keterlambatan pembayaran. Aplikasi ini dibangun menggunakan bahasa pemrograman Java dan mendemonstrasikan pemahaman dasar mengenai kelas, objek, dan perhitungan tanggal menggunakan `java.time`.

## Struktur Proyek

Proyek ini terdiri dari dua file utama:
1. `Main.java`: Program utama yang digunakan untuk membuat objek `PinjamanOnline` dan menjalankan berbagai fungsi dari kelas tersebut.
2. `PinjamanOnline.java`: Kelas utama yang berfungsi untuk menyimpan data pinjaman dan melakukan perhitungan terkait bunga dan keterlambatan.

## Fitur Utama

### 1. Kelas `PinjamanOnline`
Kelas ini berfungsi untuk menyimpan informasi terkait peminjaman dan menghitung bunga serta keterlambatan. Properti-properti yang ada di kelas ini antara lain:
- **namaPeminjam**: Nama peminjam.
- **jumlahPinjaman**: Jumlah uang yang dipinjam.
- **bunga**: Nilai bunga yang dikenakan pada pinjaman.
- **tanggalPinjam**: Tanggal awal peminjaman.
- **jatuhTempo**: Tanggal jatuh tempo pembayaran pinjaman.
- **tanggalBayar**: Tanggal aktual pembayaran pinjaman.
- **totalBayar**: Total jumlah yang harus dibayar setelah perhitungan bunga dan keterlambatan.

### 2. Konstruktor `PinjamanOnline`
Konstruktor kelas ini menerima beberapa parameter, seperti nama peminjam, jumlah pinjaman, tanggal pinjam, tanggal jatuh tempo, dan tanggal bayar. Konstruktor secara otomatis menghitung bunga awal sebesar 10% dari jumlah pinjaman.

### 3. Metode `hitungBungaAwal()`
Metode ini digunakan untuk menghitung bunga awal sebesar 10% dari jumlah pinjaman.

### 4. Metode `hitungBungaKeterlambatan()`
Metode ini menghitung bunga tambahan jika pembayaran dilakukan setelah tanggal jatuh tempo. Jika terlambat, maka ditambahkan bunga keterlambatan sebesar 10% dari jumlah pinjaman.

### 5. Metode `hitungTotalBayar()`
Metode ini menghitung total pembayaran setelah memperhitungkan bunga awal dan, jika ada, bunga keterlambatan.

### 6. Metode `tampilkanInfoPinjaman()`
Metode ini menampilkan informasi lengkap mengenai pinjaman, seperti nama peminjam, jumlah pinjaman, bunga, tanggal pinjam, jatuh tempo, tanggal bayar, dan total bayar.

## Cara Menggunakan

1. Buat objek `PinjamanOnline` di dalam kelas `Main` dengan parameter yang sesuai.
2. Panggil metode `hitungTotalBayar()` untuk menghitung total bayar sebelum keterlambatan.
3. Tampilkan informasi pinjaman menggunakan metode `tampilkanInfoPinjaman()`.
4. Panggil metode `hitungBungaKeterlambatan()` untuk menghitung bunga jika ada keterlambatan.
5. Panggil metode `hitungTotalBayar()` sekali lagi untuk menghitung total bayar setelah keterlambatan, jika ada.
6. Tampilkan informasi pinjaman yang diperbarui.

## Contoh Penggunaan

Contoh penggunaan program dapat dilihat pada file `Main.java`, di mana dibuat objek pinjaman dengan data sebagai berikut:
- Nama Peminjam: Yanto
- Jumlah Pinjaman: Rp 5,000,000
- Tanggal Pinjam: 1 Oktober 2023
- Jatuh Tempo: 1 Oktober 2024
- Tanggal Bayar: 5 Oktober 2024

Proses yang dilakukan meliputi perhitungan total bayar sebelum dan sesudah keterlambatan, serta penambahan bunga akibat keterlambatan.

## Output Program

Output dari program ini adalah informasi pinjaman yang mencakup semua data penting, seperti total bayar sebelum dan setelah keterlambatan. Jika terjadi keterlambatan, program akan menampilkan pesan tambahan yang menunjukkan adanya bunga tambahan sebesar 10%.

## Dependensi

Proyek ini tidak memiliki dependensi eksternal dan hanya menggunakan pustaka standar Java (`java.time`) untuk pengelolaan tanggal.

## Lisensi

Proyek ini adalah contoh untuk latihan pemrograman dan tidak memiliki lisensi khusus.
