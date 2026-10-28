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

public class SiakadFor19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }   
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
    }
}

```

#### 2.1.2 Hasil Running / Screenshot Output

![Output Percobaan 1](<output ujian skripsi.png>)

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Jika inisialisasi i = 1 diubah menjadi i = 0 tanpa mengubah kondisi, berapa karakter * yang tercetak ketika n = 5? Jelaskan.
  * **Jawab:** .
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

public class SiakadWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;
        System.out.println("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100){
                System.out.println("Nilai tidak valid, Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah E");
            }
            i++;
        }
    }
        
}

```

#### 2.2.2 Hasil Running

![Output Percobaan 2](<output akses WIFI.png>)

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

public class KafeDoWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}

```
#### 2.3.2 Hasil Running

![Output Percobaan 3](<output akses lab.png>)

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi
* **Pertanyaan 1:** Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk menghasilkan pola segitiga bertingkat.
  * **Jawab:** 
* **Pertanyaan 2:** Jelaskan peran variabel i dan j. Mengapa nilai j harus diinisialisasi kembali ke 0 pada setiap iterasi outer loop? Apa yang terjadi jika j tidak di-reset?
  * **Jawab:** 
* **Pertanyaan 3:** Jelaskan perubahan inisialisasi, kondisi, dan perubahan nilai (update) pada outer loop yang diperlukan untuk membentuk segitiga terbalik.
  * **Jawab:** 


## 3: TUGAS MANDIRI
   1. Tugas 1: 
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

   2. Tugas 2:
   * **Kode Program Java**
```java
import java.util.Scanner;

public class tugas2SeleksiAsisten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isAktif;
        boolean sedangDisanksi;
        int nilaiDaspro,nilaiWawancara;
        boolean hasSertifikat;
        
        System.out.print("Apakah status mahasiswa aktif? ");
        isAktif = sc.nextBoolean();
        System.out.print("Apakah Mahasiswa mendapatkan sanksi akademik? ");
        sedangDisanksi = sc.nextBoolean();

        if (isAktif && !sedangDisanksi) {
            System.out.print("Berapa nilai Dasar Pemrograman? ");
            nilaiDaspro = sc.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? ");
            hasSertifikat = sc.nextBoolean();
            if (nilaiDaspro >= 80 || hasSertifikat) {
                System.out.print("Berapa nilai wawancara? ");
                nilaiWawancara = sc.nextInt();
                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa diterima sebagai asisten");
                } else {
                    System.out.println("Ditolak sebagai asisten");
                }
            } else {
                System.out.println("Maaf syarat berkas tidak terpenuhi");
            } 
        } else {
            System.out.println("Maaf syaratmu tidak terpenuhi");
        }
        sc.close();
    }
}
```
   * **Hasil Running**

![Output Tugas 2](<output seleksi asisten.png>)
