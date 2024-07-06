package taksi;

public class Taksi extends Kendaraan {
    // Atribut tambahan
        private double tarifPerKm;
        private double jarakTempuh;
    
        // Constructor (
        public Taksi(String nomorTaksi, String merek, double tarifPerKm) {
            super(nomorTaksi, merek); // Memanggil constructor superclass 
            this.tarifPerKm = tarifPerKm;
            this.jarakTempuh = 0.0;
        }
    
        // Mutator 
        public void setJarakTempuh(double jarakTempuh) {
            this.jarakTempuh = jarakTempuh;
        }
    
        // Accessor 
        public double getJarakTempuh() {
            return jarakTempuh;
        }
    
        public double hitungTarif() {
            return tarifPerKm * jarakTempuh;
        }
    
        //(Polymorphism) (9)
        @Override
        public void tampilkanInfo() {
            super.tampilkanInfo();
            System.out.println("Tarif per Km: " + tarifPerKm);
            System.out.println("Jarak Tempuh: " + jarakTempuh);
            System.out.println("Total Tarif: " + hitungTarif());
        }
}
