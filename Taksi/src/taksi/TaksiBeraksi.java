
package taksi;

import java.util.Scanner;

public class TaksiBeraksi {
    public static void main(String[] args) {

        // Error Handling 
        try {

        Scanner scanner = new Scanner(System.in);

        // IO Sederhana 
        System.out.print("Masukkan nomor taksi: ");
        String nomorTaksi = scanner.nextLine();
        System.out.print("Masukkan merek taksi: ");
        String merek = scanner.nextLine();
        System.out.print("Masukkan tarif per km: ");
        double tarifPerKm = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan nama pengemudi: ");

        // Membuat objek 
        Taksi taksi = new Taksi(nomorTaksi, merek, tarifPerKm);


        // Seleksi 
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarakTempuh = scanner.nextDouble();
        if (jarakTempuh > 0) {
            taksi.setJarakTempuh(jarakTempuh);
            taksi.tampilkanInfo();
        } else {
            System.out.println("Jarak tempuh tidak valid.");
        }

        // Array 
        String[] dataTaksi = { taksi.getNomorKendaraan(), taksi.getMerek(), String.valueOf(taksi.hitungTarif()) };
        for (String data : dataTaksi) {
            System.out.println(data);
        }

        // Perulangan (
        for (int i = 0; i < dataTaksi.length; i++) {
            System.out.println("Data taksi ke-" + (i + 1) + ": " + dataTaksi[i]);
        }
        scanner.close();


        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        
    }
}
