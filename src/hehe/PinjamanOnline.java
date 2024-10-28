package hehe;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Kelas PinjamanOnline digunakan untuk mengelola data peminjaman dan menghitung bunga.
 */
public class PinjamanOnline {
    private String namaPeminjam;
    private double jumlahPinjaman;
    private double bunga;
    private LocalDate tanggalPinjam;
    private LocalDate jatuhTempo;
    private LocalDate tanggalBayar;
    private double totalBayar;

    /**
     * Konstruktor untuk membuat objek PinjamanOnline baru.
     *
     * @param namaPeminjam   Nama peminjam.
     * @param jumlahPinjaman Jumlah pinjaman.
     * @param tanggalPinjam  Tanggal peminjaman.
     * @param jatuhTempo     Tanggal jatuh tempo pembayaran.
     * @param tanggalBayar   Tanggal pembayaran aktual.
     */
    /**
     * apa ini
     * @param namaPeminjam
     * @param jumlahPinjaman
     * @param tanggalPinjam
     * @param jatuhTempo
     * @param tanggalBayar
     */
    public PinjamanOnline(String namaPeminjam, double jumlahPinjaman, LocalDate tanggalPinjam, LocalDate jatuhTempo, LocalDate tanggalBayar) {
        setNamaPeminjam(namaPeminjam);
        setJumlahPinjaman(jumlahPinjaman);
        setTanggalPinjam(tanggalPinjam);
        setJatuhTempo(jatuhTempo);
        setTanggalBayar(tanggalBayar);
        hitungBungaAwal();
    }

    /**
     * Mendapatkan nama peminjam.
     *
     * @return Nama peminjam.
     */
    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void setJumlahPinjaman(double jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public LocalDate getJatuhTempo() {
        return jatuhTempo;
    }

    public void setJatuhTempo(LocalDate jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    public LocalDate getTanggalBayar() {
        return tanggalBayar;
    }

    public void setTanggalBayar(LocalDate tanggalBayar) {
        this.tanggalBayar = tanggalBayar;
    }

    /**
     * Menghitung bunga awal (10% dari jumlah pinjaman).
     */
    private void hitungBungaAwal() {
        bunga = getJumlahPinjaman() * 0.1;
    }

    /**
     * Menghitung bunga keterlambatan jika pembayaran dilakukan setelah jatuh tempo.
     * Menambahkan 10% bunga dari jumlah pinjaman.
     */
    public void hitungBungaKeterlambatan() {
        long hariTelat = ChronoUnit.DAYS.between(jatuhTempo, tanggalBayar);
        if (hariTelat > 0) {
            bunga += getJumlahPinjaman() * 0.1;
            System.out.println("Bunga bertambah 10% karena keterlambatan.");
        }
    }

    /**
     * Menghitung total bayar setelah bunga.
     */
    public void hitungTotalBayar() {
        totalBayar = jumlahPinjaman + bunga;
    }

    /**
     * Menampilkan informasi pinjaman termasuk nama peminjam, jumlah pinjaman, bunga, tanggal pinjam, jatuh tempo, tanggal bayar, dan total bayar.
     */
    public void tampilkanInfoPinjaman() {
        System.out.println("Nama Peminjam: " + getNamaPeminjam());
        System.out.println("Jumlah Pinjaman: " + getJumlahPinjaman());
        System.out.println("Bunga: " + bunga);
        System.out.println("Tanggal Pinjam: " + getTanggalPinjam());
        System.out.println("Jatuh Tempo: " + getJatuhTempo());
        System.out.println("Tanggal Bayar: " + getTanggalBayar());
        System.out.println("Total Bayar: Rp " + totalBayar);
    }
}
