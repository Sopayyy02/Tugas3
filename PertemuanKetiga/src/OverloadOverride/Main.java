package OverloadOverride;

public class Main extends Hitung{
    public static void main(String[] args) {
        // --- Contoh Hitung ---
        System.out.println("=== Contoh Overload ===");
        Hitung ol = new Hitung();
        System.out.println("Penjumlahan : 5 + 3 = " + ol.Menghitung(5, 3));
        System.out.println("Penjumlahan dan Perkalian : 1 + 2 * 3 = " + ol.Menghitung(1, 2, 3));
        System.out.println("Pengurangan : 6 - 2 = " + ol.Menghitung(6, 2));

        // --- Contoh Override ---
        System.out.println("\n=== Contoh Override ===");
        Main or = new Main();
        or.Menghitung(); // method ini menimpa yang ada di Hitung
    }
}
