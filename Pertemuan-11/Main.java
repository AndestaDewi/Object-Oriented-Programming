import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        try {

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/isi nama database",
                    "isi username database",
                    "isi password database");
            System.out.println("Koneksi berhasil!");

            conn.close();

        } catch (Exception e) {
            System.out.println("Koneksi gagal");
            System.out.println(e.getMessage());
        }
    }
}