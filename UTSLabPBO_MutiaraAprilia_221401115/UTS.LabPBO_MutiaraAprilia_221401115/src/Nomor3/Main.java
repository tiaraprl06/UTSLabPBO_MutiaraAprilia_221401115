package Nomor3;

public class Main {

    public static void main(String[] args) {
        // Menciptakan dua objek Account
        Account account1 = new Account("ACC1234", "Akun 1", 1000000);
        Account account2 = new Account("ACC5678", "Akun 2");

        // Mentransfer 500.000 dari Akun 1 ke Akun 2
        account1.transferTo(account2, 500000);

        // Menampilkan saldo akun
        System.out.println("Saldo Akun 1: " + account1.getBalance());
        System.out.println("Saldo Akun 2: " + account2.getBalance());

        // Mencoba mendebit 2.000.000 dari Akun 1
        account1.debit(2000000);

        // Menampilkan saldo akun setelah penarikan yang gagal
        System.out.println("Saldo Akun 1: " + account1.getBalance());
    }
}


