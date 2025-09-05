package OverloadOverride;

public class Hitung {
    // Method tanpa parameter
    public void Menghitung() {
        System.out.println("Mari berhitung bersama 1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
    }

    // === Overloading (nama sama, parameter berbeda) ===
    public int Menghitung(int a, int b) {
        return a + b;
    }

    public int Menghitung(int a, int b, int c) {
        return a + b * c;
    }

    public double Menghitung(double a, double b) {
        return a - b;
    }
}
