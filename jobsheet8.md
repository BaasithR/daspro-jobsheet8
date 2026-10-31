# JOBSHEET 8 - PERULANGAN 2

**Identitas Mahasiswa:**
* **Nama:** Mochamad Razan Al Baasith
* **NIM:** 264107020145
* **Kelas / No. Presensi:** TI-1D / 19

---

## 1: TUJUAN PRAKTIKUM

1. Memahami konsep perulangan bersarang pada algoritma 
2. Memahami alur perulangan bersarang
3. Mengenal sintaks perulangan bersarang
4. Mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus
sederhana.

---

## 2: Praktikum

### 2.1 Percobaan 1: Review Perulangan 1

#### 2.1.1 Kode Program Java
```java
import java.util.Scanner;

public class Star19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
            
        }
        System.out.println();
        sc.close();
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output

![Output Percobaan 1](<Output Star.png>)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jika inisialisasi i = 1 diubah menjadi i = 0 tanpa mengubah kondisi, berapa karakter * yang tercetak ketika n = 5? Jelaskan.
  * **Jawab:** .
![Output Percobaan](<Output Modif Star.png>)
* **Pertanyaan 2:** Jika kondisi i <= n diganti menjadi i < n, berapa kali perulangan dijalankan saat n = 5? Mengapa hasilnya berbeda?
  * **Jawab:** .
* **Pertanyaan 3:** Prediksi output potongan kode berikut ketika n = 9, kemudian buktikan dengan mengganti perulangan FOR pada program Anda dan menjalankannya.
```
for (int i = 2; i <= n; i += 2) {
    System.out.print(i+ " ");
}
```
Modifikasi kode tersebut agar mencetak bilangan ganjil positif yang tidak melebihi n.
  * **Jawab:**
* **Pertanyaan 4:** Jelaskan mengapa perubahan increment i++ menjadi i-- (dengan kondisi tetap i <= n) membuat perulangan berjalan terus-menerus dan tidak berhenti dalam waktu wajar untuk n positif. Jangan menjalankan versi tersebut; jika terlanjur berjalan, hentikan
program dengan menekan Ctrl + C pada terminal.
  * **Jawab:**
    
---

### 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)


#### 2.2.1 Kode Program
```java
import java.util.Scanner;

public class Rectangle19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris = ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom = ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

```

#### 2.2.2 Hasil Running

![Output Percobaan 2](<Output Rectangle.png>)

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Tentukan fungsi variabel i dan j pada program tersebut.
  * **Jawab:** 
* **Pertanyaan 2:** Berapa kali outer loop, inner loop, dan perintah print("*") dijalankan untuk baris = 4 dan kolom = 7?
  * **Jawab:**
* **Pertanyaan 3:** Apa yang terjadi jika batas perulangan luar dan dalam ditukar (outer menggunakan kolom, inner menggunakan baris)? Gunakan baris = 3 dan kolom = 6 untuk menjelaskan.
  * **Jawab:**
* **Pertanyaan 4:** Jelaskan akibat penghapusan System.out.println(); setelah inner loop.
  * **Jawab:** 
* **Pertanyaan 5:**  Modifikasi program agar karakter yang dicetak adalah #, lalu commit dan push perubahan ke GitHub
  * **Jawab:** 
---

### 2.3 Percobaan 3: Debugging Bintang Segitiga – Nested WHILE
#### 2.3.1 Kode Program Java
 ```java
import java.util.Scanner;

public class Triangle19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i < n){
            int j = 0;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            i++;
        }
        sc.close();
    }
}

```
#### 2.3.2 Hasil Running

![Output Percobaan 3](<Output Triangle.png>)

#### Hasil Running Modifikasi

![Output Percobaan 3](<Output Modif Triangle.png>)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk menghasilkan pola segitiga bertingkat.
  * **Jawab:** 
* **Pertanyaan 2:** Jelaskan peran variabel i dan j. Mengapa nilai j harus diinisialisasi kembali ke 0 pada setiap iterasi outer loop? Apa yang terjadi jika j tidak di-reset?
  * **Jawab:** 
* **Pertanyaan 3:** Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (update) pada outer loop yang diperlukan untuk membentuk segitiga terbalik.
  * **Jawab:** 

### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok
#### 2.4.1 Kode Program Java
```java
import java.util.Scanner;

public class NilaiKelompok19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai  : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;        // penghitung outer loop
            double rataTertinggi = -1;    // - 1 agar kelompok pertama pasti tercatat
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) {        // inner loop penilai
                    int nilai;
                    do {
                        System.out.print("  Nilai dari penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("  Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }
                double rataNilai = totalNilai/jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }
                nomorKelompok++;
            }
            System.out.println("===============================");
            System.out.println("Kelompok terbaik     : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi  : " + rataTertinggi);
        }
        sc.close();
    }
}

```
#### 2.4.2 Hasil Running

![Output Percobaan 4](<Output Nilai Kelompok.png>)

#### 2.4.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Mengapa totalNilai perlu di-reset di dalam outer loop, tetapi rataTertinggi tidak boleh di-reset pada setiap kelompok?
  * **Jawab:** 
* **Pertanyaan 2:** Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan FOR dijalankan secara keseluruhan?
  * **Jawab:** 
* **Pertanyaan 3:** Apa yang terjadi jika totalNilai dideklarasikan sebagai int dan rata-rata dihitung menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.
  * **Jawab:**
* **Pertanyaan 4:** Mengapa rataTertinggi diberi nilai awal -1, bukan 0? Berikan contoh input yang membuat hasil salah apabila nilai awalnya 0.
  * **Jawab:**
* **Pertanyaan 5:**  Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan beserta perannya.
  * **Jawab:** 



## 3: TUGAS MANDIRI
   1. Tugas 1: Buat program untuk mencetak pola bilangan 1 sampai nomor baris. Masukkan bilangan bulat n (n minimal 1). Pada baris pertama tercetak 1, pada baris kedua 1 2, dan seterusnya sampai baris ke-n. Setelah pola selesai, tampilkan total banyaknya angka yang telah dicetak
   * **Kode Program java**
```java
import java.util.Scanner;

public class tugas1diskonBuku19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int diskon = 0; 
    String buku;
    int jumlah;

    System.out.print("Buku apa yg ingin kamu beli?  ");
    buku = sc.next();

    System.out.print("Berapa jumlah bukunya? ");
    jumlah = sc.nextInt();

    if (buku.equalsIgnoreCase("kamus")) {
      diskon = 10;
      if (jumlah > 2) {
        diskon += 0.02;
      }
    } else if (buku.equalsIgnoreCase("novel")) {
      diskon = 7;
      if (jumlah > 3) {
        diskon += 3;
      } else {
        diskon += 0.01;
      }
    } else {
      if (jumlah > 3) {
        diskon = 5;
      }

    }
    sc.close();
    System.out.println(String.format("Total diskonmu adalah %d%%",  diskon));
  }
}
```
   * **Hasil Running**

![Output Tugas 1](<output diskon buku.png>)

   2. Tugas 2: Buat program untuk menampilkan tabel perkalian berukuran n × n menggunakan nested FOR atau WHILE. Nilai n minimal 3. Setiap posisi menampilkan hasil perkalian nomor baris dan nomor kolom. Atur spasi agar keluaran rapi, lalu tampilkan jumlah seluruh angka pada tabel
   * **Kode Program Java**
```java


```
   * **Hasil Running**

![Output Tugas 2](<output seleksi asisten.png>)

   3. Tugas 3: Sebuah pusat perbelanjaan memiliki beberapa toko. Setiap toko melayani sejumlah pelanggan pada hari yang sama, dan setiap pelanggan membeli beberapa barang. Program meminta jumlah toko, kemudian jumlah pelanggan pada masing-masing toko, dan jumlah
barang yang dibeli setiap pelanggan. Hitung dan tampilkan total pelanggan serta total barang per toko, total barang seluruh toko, dan nomor toko dengan jumlah barang terbanyak. Jika terdapat nilai tertinggi yang sama, tampilkan toko dengan nomor paling kecil
   * **Kode Program Java**
```java


```
   * **Hasil Running**

![Output Tugas 3](<output seleksi asisten.png>)
