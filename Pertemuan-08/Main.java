import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();

            int hasil = 100 / angka;

            System.out.println("Hasil: " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("Tidak boleh membagi dengan nol!");
        } catch (Exception e) {
            System.out.println("Input tidak valid!");
        } finally {
            System.out.println("Program selesai dijalankan.");
            input.close();
        }
    }

}