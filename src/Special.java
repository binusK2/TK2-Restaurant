

public class Special extends Menu {
    private int discount;
    
    public Special(){
        
    }
    public Special(String kode, String nama, double harga, int discount) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.discount = discount;
    }

    @Override
    public String getKode() {
        return kode;
    }

    @Override
    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
}
}