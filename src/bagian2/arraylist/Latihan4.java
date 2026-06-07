package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan4 {
    public static void main(String[] args) {

        ArrayList<String> belanja = new ArrayList<>();

        belanja.add("Beras");
        belanja.add("Gula");
        belanja.add("Minyak");
        belanja.add("Telur");

        System.out.println("Sebelum dihapus : " + belanja);

        // Hapus item ke-2 (indeks 1)
        belanja.remove(1);

        System.out.println("Sesudah dihapus : " + belanja);
        System.out.println("Jumlah item : " + belanja.size());
    }
}
