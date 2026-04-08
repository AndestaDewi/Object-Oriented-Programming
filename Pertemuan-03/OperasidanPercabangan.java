public class OperasidanPercabangan {
    public static void main(String[] args) {

        int nilai = 82;
        int angka = 7;

        // ==========
        // 1. Operator Perbandingan
        // ==========
        System.out.println("=== Operator Perbandingan ===");
        System.out.println("Nilai > 75  : " + (nilai > 75));
        System.out.println("Nilai == 82 : " + (nilai == 82));
        System.out.println("Nilai < 50  : " + (nilai < 50));

        // ==========
        // 2. Operator Logika
        // ==========

        System.out.println("\n=== Operator Logika ===");

        boolean lulus = (nilai >= 75);
        boolean nilaiBagus = (nilai >= 80);

        System.out.println("Lulus AND Nilai Bagus   : " + (lulus && nilaiBagus));
        System.out.println("Lulus OR Nilai Bagus    : " + (lulus || nilaiBagus));
        System.out.println("NOT Lulus               : " + (!lulus));

        // ==========
        // 3. Percabangan If Else If
        // ==========
        System.out.println("\n=== Penilaian ===");

        if (nilai >= 85) {
            System.out.println("Grade A");
        } else if (nilai >= 75) {
            System.out.println("Grade B");
        } else if (nilai >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        // ===========
        // 4. Percabangan If Else
        // ===========
        System.out.println("\n=== Status Kelulusan ===");

        if (nilai >= 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        // ===========
        // 5. Gannjil/Genap (Modulus)
        // ===========
        System.out.println("\n=== Ganjil/Genap ===");

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilang Ganjil");
        }
    }
}