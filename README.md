# 🤓Tugas PBO Pertemuan Ketiga

Tugas ini bertujuan untuk mengimplementasikan konsep-konsep **Pemrograman Berorientasi Objek (PBO)** menggunakan bahasa Java, yaitu:

- Abstract Class
- Interface
- Method Overloading
- Method Overriding

## 🎯 Tujuan
1. Memahami perbedaan antara **abstract class** dan **interface**.
2. Menerapkan konsep **method overloading** (nama method sama, parameter berbeda).
3. Menerapkan konsep **method overriding** (method superclass ditulis ulang di subclass).
4. Membandingkan implementasi dari abstract class, interface, overloading, dan overriding agar perbedaannya jelas.

---

## 📖 Penjelasan Teori

### 1. Abstract Class
- Tidak bisa dibuat objek secara langsung.
- Bisa memiliki atribut/field, constructor, method biasa, dan method abstract.
- Fungsinya sebagai **blueprint** untuk subclass.

**Contoh:**
```java
abstract class Pegawai {
    protected String nama;
    protected String id;

    public Pegawai(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
}
```
**2. Interface**
- Tidak bisa memiliki constructor.
- Semua atribut otomatis bersifat public static final (konstanta).
- Semua method otomatis abstract (hanya deklarasi, tanpa implementasi).
- Satu class bisa mengimplementasikan lebih dari satu interface (multiple inheritance).
- Interface berfungsi sebagai kontrak yang harus dipatuhi oleh class yang mengimplementasikannya.

**Contoh:**
```java
interface Kerja {
    void bekerja();
}

interface Pengamat {
    void mengamati();
}

interface BeriPerintah {
    void memerintah();
}
```
3. Overloading
- Overloading adalah konsep method dengan nama sama tetapi parameter berbeda (jumlah atau tipe data).
- Terjadi dalam satu class.
- Memberikan fleksibilitas agar method bisa dipanggil dengan cara berbeda sesuai kebutuhan.

**Contoh:**
```java
public class Kalkulator {
    // Overload untuk penjumlahan bilangan bulat
    public int hitung(int a, int b) {
        return a + b;
    }

    // Overload untuk penjumlahan 3 bilangan bulat
    public int hitung(int a, int b, int c) {
        return a + b + c;
    }

    // Overload untuk penjumlahan bilangan pecahan
    public double hitung(double a, double b) {
        return a + b;
    }
}
```
4. Overriding
- Overriding adalah konsep ketika subclass menulis ulang method dari superclass dengan implementasi berbeda.
- Nama method, parameter, dan tipe kembalian harus sama.
- Terjadi antara superclass dan subclass.
- Mendukung polymorphism, karena objek dari subclass bisa berperilaku berbeda walau dipanggil dengan referensi superclass.

**Contoh:**
```java
class Kendaraan {
    public void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

class Mobil extends Kendaraan {
    @Override
    public void info() {
        System.out.println("Ini adalah mobil dengan 4 roda.");
    }
}
```
# ✍️ Kesimpulan
1. Abstract Class berfungsi sebagai blueprint yang dapat memiliki atribut, constructor, method biasa, maupun method abstract. Objek tidak bisa dibuat langsung dari abstract class, tetapi harus dari subclass-nya.
2. Interface berisi kontrak perilaku yang harus diimplementasikan oleh class. Semua method di dalamnya bersifat abstract dan tidak memiliki implementasi. Interface mendukung multiple inheritance.
3. Overloading terjadi dalam satu class, dengan nama method yang sama tetapi parameter berbeda. Tujuannya untuk memberikan fleksibilitas pemanggilan method sesuai kebutuhan.
4. Overriding terjadi antara superclass dan subclass, di mana subclass menulis ulang method dari superclass agar memiliki perilaku berbeda. Hal ini mendukung konsep polymorphism.
# 🔑 Dengan mengerjakan tugas ini, perbedaan dan hubungan antar konsep abstract class, interface, overloading, dan overriding bisa dipahami lebih jelas
- Abstract class dan interface menekankan pada desain (blueprint dan kontrak).
- Overloading dan overriding menekankan pada implementasi (perilaku method yang berbeda).
