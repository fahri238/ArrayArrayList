# Latihan Terbimbing Pemrograman Berorientasi Objek (Java)

## Deskripsi

Repository ini berisi kumpulan latihan dan tugas mandiri pada mata kuliah Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java.

Materi yang dikerjakan meliputi:

* Array
* ArrayList
* Multi-Class dan Object-Oriented Programming (OOP)

---

# Struktur Project

```text
src/
└── bagian1/
    └── array/
        ├── Latihan1.java
        ├── Latihan2.java
        └── LatihanMandiri3.java

└── bagian2/
    └── arraylist/
        ├── Latihan3.java
        ├── Latihan4.java
        ├── Latihan5.java
        └── LatihanMandiriArrayList.java

└── bagian3/
    └── perpustakaan/
        ├── Buku.java
        ├── Perpustakaan.java
        └── MainPerpustakaan.java
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
* Menguji peminjaman
* Menguji pengembalian
* Menguji pencarian penulis

---

# Konsep OOP yang Dipelajari

* Class dan Object
* Constructor
* Encapsulation
* Getter dan Setter
* ArrayList of Objects
* Method pada Object
* Interaksi antar Class
* Object Composition

---

# Teknologi

* Java
* NetBeans IDE
* JDK 17+ (atau sesuai kebutuhan praktikum)

---

# Author

Muhammad Fahri Ilmi

Program Studi Ilmu Komputer
