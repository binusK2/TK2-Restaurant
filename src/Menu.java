

public class Menu {
    protected String kode;
    protected String nama;
    protected double harga;
   
    public Menu() {
    }

    public Menu(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

   public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

}