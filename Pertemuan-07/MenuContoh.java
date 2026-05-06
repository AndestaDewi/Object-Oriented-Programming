import java.util.Scanner;

public class MenuContoh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Tambah");
        System.out.println("2. Tampilkan");
        System.out.println("3. Keluar");
        System.out.print("Pilih: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih tambah data");
                break;
            case 2:
                System.out.println("Menampilkan data...");
                break;
            case 3:
                System.out.println("Program selesai.");
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}