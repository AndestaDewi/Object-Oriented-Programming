class Mobil extends KendaraanDarat implements Kendaraan {
    @Override
    public void jalan() {
        System.out.println("Mobil berjalan di jalan raya");
    }

    @Override
    void bahanBakar() {
        System.out.println("Mobil menggunakan bensin");
    }
}