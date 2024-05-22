package Nomor2;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        boolean result = isPalindrome(str); // Mengkonversi menjadi nilai boolean
        System.out.println("Is palindrome: " + result);
    }

    public static boolean isPalindrome(String str) { // Memeriksa apakah inputan string adalah palindrome/tidak
        String reversed = new StringBuilder(str).reverse().toString(); // Mengubah string menjadi terbalik
        return str.equalsIgnoreCase(reversed); // Membandingkan string asli dengan yang sudah terbalik serta tidak melihat huruf besar/kecil
    }
}