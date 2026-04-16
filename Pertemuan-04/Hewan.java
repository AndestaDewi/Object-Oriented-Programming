abstract class Hewan {

    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    abstract void suara();
}