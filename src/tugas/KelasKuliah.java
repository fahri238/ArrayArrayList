package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa =
            new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public double hitungRataRata() {

        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {

        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public void tampilkanSemua() {

        System.out.println("=== Daftar Mahasiswa ===");

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m.info());
        }
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
    
    public void tampilkanMahasiswaTerbaru() {
    Mahasiswa m =
            daftarMahasiswa.get(
                    daftarMahasiswa.size() - 1);

    System.out.println("Mahasiswa Baru/Ditambahkan: " + m.info());
}
}