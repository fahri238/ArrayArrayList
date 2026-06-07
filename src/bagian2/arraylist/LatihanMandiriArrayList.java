package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {

        // Soal 1
        System.out.println("=== Soal 1 ===");

        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        System.out.println("Daftar belanja Sebelum: " + belanja);

        // Hapus item ke-2 (indeks 1)
        belanja.remove(1);

        System.out.println("Daftar belanja Sesudah: " + belanja);
        System.out.println("Jumlah item : " + belanja.size());

        // Soal 2
        System.out.println("\n=== Soal 2 ===");

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(15);
        angka.add(30);
        angka.add(8);
        angka.add(45);
        angka.add(20);

        int terbesar = angka.get(0);

        for (int a : angka) {
            if (a > terbesar) {
                terbesar = a;
            }
        }

        System.out.println("Data angka : " + angka);
        System.out.println("Nilai terbesar : " + terbesar);

        // Soal 3
        System.out.println("\n=== Soal 3 ===");

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Anton");
        nama.add("Dina");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
