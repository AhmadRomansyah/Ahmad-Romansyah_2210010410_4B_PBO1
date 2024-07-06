package taksi;

public class Kendaraan {
    // Atribut 
    protected String nomorKendaraan;
    protected String merek;

    // Constructor 
    public Kendaraan(String nomorKendaraan, String merek) {
        this.nomorKendaraan = nomorKendaraan;
        this.merek = merek;
    }

    // Accessor 
    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public String getMerek() {
        return merek;
    }

    // Method umum 
    public void tampilkanInfo() {
        System.out.println("Nomor Kendaraan: " + nomorKendaraan);
        System.out.println("Merek: " + merek);
    }
}
