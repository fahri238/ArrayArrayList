package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan5 {
    public static void main(String[] args) {

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

        System.out.println("Data : " + angka);
        System.out.println("Nilai terbesar : " + terbesar);
    }
}
