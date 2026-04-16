public class Main {

    public static void main(String[] args) {

        Kucing kucing = new Kucing();

        kucing.setNama("Garfield");

        System.out.println("Nama Hewan: " + kucing.getNama());

        kucing.suara();
    }
}
