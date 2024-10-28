package hehe;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Buat objek PinjamanOnline
        PinjamanOnline pinjaman = new PinjamanOnline("Yanto", 5000000, LocalDate.of(2023, 10, 1), LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 5));

        // Tampilkan informasi pinjaman sebelum keterlambatan
        pinjaman.hitungTotalBayar();  // Panggil hitungTotalBayar sebelum keterlambatan
        pinjaman.tampilkanInfoPinjaman();

        // Hitung bunga jika ada keterlambatan
        pinjaman.hitungBungaKeterlambatan();

        // Hitung total bayar setelah bunga
        pinjaman.hitungTotalBayar();  // Panggil hitungTotalBayar setelah keterlambatan
        pinjaman.tampilkanInfoPinjaman();
    }
}
