package Nomor1;

// Program untuk menghitung luas dan keliling persegi panjang
import java.util.Scanner;

public class PersegiPanjang {
    // Variabel untuk panjang dan lebar
    private double panjang;
    private double lebar;

    // Konstruktor untuk menginisialisasi panjang dan lebar
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method untuk mengubah panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Method untuk mengubah lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Method untuk mengembalikan panjang
    public double getPanjang() {
        return panjang;
    }

    // Method untuk mengembalikan lebar
    public double getLebar() {
        return lebar;
    }

    // Method untuk menampilkan informasi persegi panjang
    public void tampilkanInformasi() {
        System.out.println("Panjang: " + getPanjang());
        System.out.println("Lebar: " + getLebar());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    // Method untuk menghitung luas dan keliling dengan parameter tambahan
    public double hitungLuasDanKeliling(double tambahan) {
        return hitungLuas() + hitungKeliling() + tambahan;
    }

    // Method untuk menghitung luas dan keliling dengan parameter tambahan
    public double hitungLuasDanKeliling(double tambahan1, double tambahan2) {
        return hitungLuas() + hitungKeliling() + tambahan1 + tambahan2;
    }
}

// Main class untuk menguji program
class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);

        // Minta input panjang dan lebar dari user
        System.out.println("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.println("Masukkan lebar: ");
        double lebar = scanner.nextDouble();

        // Membuat objek PersegiPanjang dengan input dari user
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        // Mengubah panjang dan lebar
        System.out.println("Masukkan panjang baru (opsional): ");
        double panjangBaru = scanner.nextDouble();
        if (panjangBaru != 0) {
            persegiPanjang.setPanjang(panjangBaru);
        }

        System.out.println("Masukkan lebar baru (opsional): ");
        double lebarBaru = scanner.nextDouble();
        if (lebarBaru != 0) {
            persegiPanjang.setLebar(lebarBaru);
        }

        // Menampilkan informasi persegi panjang
        persegiPanjang.tampilkanInformasi();

        // Menghitung luas dan keliling dengan tambahan
        System.out.println("Masukkan tambahan untuk menghitung luas dan keliling: ");
        double tambahan = scanner.nextDouble();
        System.out.println("Luas dan Keliling dengan tambahan: " + persegiPanjang.hitungLuasDanKeliling(tambahan));

        System.out.println("Masukkan tambahan lain untuk menghitung luas dan keliling: ");
        double tambahan1 = scanner.nextDouble();
        System.out.println("Masukkan tambahan lain lain untuk menghitung luas dan keliling: ");
        double tambahan2 = scanner.nextDouble();
        System.out.println("Luas dan Keliling dengan tambahan lain: " + persegiPanjang.hitungLuasDanKeliling(tambahan1, tambahan2));
    }
}
