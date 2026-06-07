# Latihan Terbimbing Pemrograman Berorientasi Objek (Java)

## Deskripsi

Repository ini berisi kumpulan latihan dan tugas pada mata kuliah Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java.

Materi yang dikerjakan meliputi:

* Array
* ArrayList
* Multi-Class dan Object-Oriented Programming (OOP)
* Studi Kasus Pengelolaan Nilai Mahasiswa

---

# Struktur Project

```text
src/
├── bagian1/
│   └── array/
│       ├── Latihan1.java
│       ├── Latihan2.java
│       └── LatihanMandiri3.java
│
├── bagian2/
│   └── arraylist/
│       ├── Latihan3.java
│       ├── Latihan4.java
│       ├── Latihan5.java
│       └── LatihanMandiriArrayList.java
│
├── bagian3/
│   └── perpustakaan/
│       ├── Buku.java
│       ├── Perpustakaan.java
│       └── MainPerpustakaan.java
│
└── tugas/
    ├── Mahasiswa.java
    ├── KelasKuliah.java
    └── MainTugas.java
```

---

# Bagian 1 - Array

## Latihan 1

Materi:

* Deklarasi array
* Inisialisasi array
* Mengakses elemen array
* Menggunakan atribut `length`

## Latihan 2

Materi:

* Perulangan pada array
* Enhanced for-loop (for-each)
* Menghitung total nilai
* Menghitung rata-rata

## Latihan Mandiri

### Soal 1

Membuat array suhu harian bertipe `double` dan menentukan:

* Suhu tertinggi
* Suhu terendah

### Soal 2

Membuat array nama hari dan menampilkan nama yang memiliki lebih dari 5 huruf.

### Soal 3

Menghitung jumlah bilangan genap dari array:

```java
int[] angka = {4, 8, 15, 16, 23, 42};
```

---

# Bagian 2 - ArrayList

## Latihan 3

Materi:

* Membuat ArrayList
* Menambahkan elemen dengan `add()`
* Mengakses elemen dengan `get()`
* Menggunakan `size()`

## Latihan 4

Materi:

* Menyisipkan data
* Mengubah data dengan `set()`
* Menghapus data dengan `remove()`
* Mengecek data dengan `contains()`

## Latihan 5

Materi:

* ArrayList bertipe Integer
* Perulangan menggunakan for-each
* Menghitung total dan rata-rata

## Latihan Mandiri

### Soal 1

Membuat daftar belanja menggunakan `ArrayList<String>` kemudian:

* Menambahkan 4 item
* Menghapus item ke-2
* Menampilkan isi dan jumlah item

### Soal 2

Menentukan nilai terbesar dari sebuah `ArrayList<Integer>`.

### Soal 3

Menampilkan nama yang diawali huruf **A** menggunakan method:

```java
startsWith("A")
```

---

# Bagian 3 - Multi-Class (Perpustakaan)

Pada bagian ini dibuat simulasi sederhana sistem perpustakaan menggunakan beberapa class.

## Class Buku

Menyimpan informasi:

* Judul buku
* Penulis
* Tahun terbit
* Status peminjaman

Fitur:

* Constructor
* Getter
* Setter
* Method `info()`

## Class Perpustakaan

Mengelola koleksi buku menggunakan:

```java
ArrayList<Buku>
```

Fitur:

* Menambah buku
* Menampilkan koleksi
* Meminjam buku
* Mengembalikan buku
* Menghitung buku tersedia
* Mencari buku berdasarkan penulis

## Class MainPerpustakaan

Digunakan untuk:

* Membuat objek perpustakaan
* Menambahkan buku
* Menguji peminjaman buku
* Menguji pengembalian buku
* Menguji pencarian berdasarkan penulis
* Menampilkan jumlah buku yang tersedia

---

# Tugas Akhir - Pengelolaan Nilai Mahasiswa

Pada bagian ini dibuat sistem sederhana untuk mengelola data mahasiswa dan nilai mata kuliah menggunakan konsep Multi-Class dan Object-Oriented Programming (OOP).

## Class Mahasiswa

Menyimpan informasi mahasiswa berupa:

* Nama
* NPM
* Nilai

Fitur:

* Constructor
* Getter
* Method `lulus()`
* Method `info()`

Method `lulus()` digunakan untuk menentukan status kelulusan mahasiswa berdasarkan nilai:

```java
nilai >= 60
```

## Class KelasKuliah

Mengelola kumpulan objek mahasiswa menggunakan:

```java
ArrayList<Mahasiswa>
```

Fitur:

* Menambah mahasiswa
* Menampilkan seluruh data mahasiswa
* Menghitung rata-rata nilai
* Menghitung jumlah mahasiswa yang lulus
* Menghitung jumlah mahasiswa

Method utama:

* `tambahMahasiswa()`
* `tampilkanSemua()`
* `hitungRataRata()`
* `jumlahLulus()`
* `jumlahMahasiswa()`

## Class MainTugas

Digunakan untuk:

* Membuat objek KelasKuliah
* Menampilkan daftar mata kuliah menggunakan array
* Menambahkan data mahasiswa ke dalam koleksi
* Menampilkan seluruh data mahasiswa
* Menampilkan rata-rata nilai kelas
* Menampilkan jumlah mahasiswa yang lulus
* Menambahkan mahasiswa baru ke dalam koleksi
* Menampilkan jumlah data terbaru setelah penambahan

### Implementasi Array

Daftar mata kuliah disimpan menggunakan array dengan ukuran tetap.

Contoh:

```java
String[] mataKuliah = {
    "Pemrograman Berorientasi Objek",
    "Struktur Data",
    "Basis Data"
};
```

### Implementasi ArrayList

Data mahasiswa disimpan menggunakan:

```java
ArrayList<Mahasiswa>
```

Sehingga jumlah mahasiswa dapat bertambah secara dinamis selama program berjalan.

---

# Konsep OOP yang Dipelajari

* Class dan Object
* Constructor
* Encapsulation
* Getter dan Setter
* Method
* ArrayList of Objects
* Object Composition
* Aggregation
* Interaksi antar Class
* Multi-Class Programming

---

# Teknologi

* Java
* NetBeans IDE
* JDK

---

# Cara Menjalankan Program

1. Clone repository:

```bash
git clone [https://github.com/fahri238/ArrayArrayList.git]
```

2. Buka project menggunakan NetBeans IDE atau IDE Java lainnya.

3. Jalankan class yang ingin diuji, misalnya:

```text
MainPerpustakaan.java
```

atau

```text
MainTugas.java
```

4. Hasil program akan ditampilkan pada console/output IDE.

---

# Author

**Muhammad Fahri Ilmi**

Program Studi Teknik Informatika
