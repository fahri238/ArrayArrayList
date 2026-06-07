/*
Nama : Muhammad Fahri Ilmi
NPM  : 2210010160
*/

package tugas;

public class MainTugas {

    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array mata kuliah
        // Array mata kuliah
    String[] mataKuliah = {
    "Pemrograman Berorientasi Objek",
    "Struktur Data",
    "Basis Data",
    "Jaringan Komputer",
    "Sistem Operasi",
    "Kecerdasan Buatan"
    };

    System.out.println("=== Mata Kuliah ===");

    for (String mk : mataKuliah) {
        System.out.println("- " + mk);
    }

    System.out.println();

    // Data mahasiswa
    kelas.tambahMahasiswa(new Mahasiswa("Andi Saputra", "231001", 80));
    kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso", "231002", 55));
    kelas.tambahMahasiswa(new Mahasiswa("Citra Lestari", "231003", 90));
    kelas.tambahMahasiswa(new Mahasiswa("Dina Permata","231004",70));
    kelas.tambahMahasiswa(new Mahasiswa("Eko Pratama", "231005", 50));
    kelas.tambahMahasiswa(new Mahasiswa("Fajar Ramadhan", "231006",88));
    kelas.tambahMahasiswa(new Mahasiswa("Gita Maharani", "231007", 76));
    kelas.tambahMahasiswa(new Mahasiswa("Hendra Wijaya", "231008", 62));
    kelas.tambahMahasiswa(new Mahasiswa("Intan Sari", "231009", 95));
    kelas.tambahMahasiswa(new Mahasiswa("Joko Susilo", "231010", 58));
    
    kelas.tampilkanSemua();

    System.out.println();

    System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
    System.out.println("Jumlah lulus : " + kelas.jumlahLulus());

    System.out.println();

    System.out.println("Jumlah data awal : "+ kelas.jumlahMahasiswa());

    // Tambah mahasiswa baru
    kelas.tambahMahasiswa(new Mahasiswa("Muhammad Fahri Ilmi", "231011", 92));
    
    System.out.println("Jumlah data setelah ditambah : "+ kelas.jumlahMahasiswa());
    kelas.tampilkanMahasiswaTerbaru();
    }
}