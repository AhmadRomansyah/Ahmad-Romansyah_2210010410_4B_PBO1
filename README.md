# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kendaraan`, `Taksi`, dan `TaksiBeraksi` adalah contoh dari class.

```bash
    public class Kendaraan {
        ...
    }

    public class Taksi extends Kendaraan {
        ...
    }

    public class TaksiBeraksi {
        ...
    }
```

2. **Object** adalah instance dari class. Pada kode ini, `Taksi taksi = new Taksi(nomorTaksi, merek, tarifPerKm);` adalah contoh pembuatan object.

```bash
    Taksi taksi = new Taksi(nomorTaksi, merek, tarifPerKm);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nomorKendaraan` dan `merek` adalah contoh atribut.

```bash
    String nomorKendaraan;
    String merek;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kendaraan` dan `Taksi`.

```bash
    public Kendaraan(String nomorKendaraan, String merek) {
        this.nomorKendaraan = nomorKendaraan;
        this.merek = merek;
    }

    public Taksi(String nomorTaksi, String merek, double tarifPerKm) {
        super(nomorTaksi, merek); // Memanggil constructor superclass 
        this.tarifPerKm = tarifPerKm;
        this.jarakTempuh = 0.0;
        }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJarakTempuh` adalah contoh method mutator.

```bash
        public void setJarakTempuh(double jarakTempuh) {
            this.jarakTempuh = jarakTempuh;
        }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJarakTempuh`,  `getNomorKendaraan`, `getMerek` adalah contoh method accessor.

```bash 
    public double getJarakTempuh() {
        return jarakTempuh;
    }
    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public String getMerek() {
        return merek;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `tarifPerKm`, `jarakTempuh` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private double tarifPerKm;
    private double jarakTempuh;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Taksi` mewarisi `Kendaraan` dengan sintaks `extends`.

```bash
public class Kendaraan extends Taksi {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `Taksi` merupakan override dari method `tampilkanInfo()` di `Kendaraan`.

```bash
    public void tampilkanInfo() {
        System.out.println("Nomor Kendaraan: " + nomorKendaraan);
        System.out.println("Merek: " + merek);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tarif per Km: " + tarifPerKm);
        System.out.println("Jarak Tempuh: " + jarakTempuh);
        System.out.println("Total Tarif: " + hitungTarif());
        }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKapasitasStok`.

```bash
    if (jarakTempuh > 0) {
        taksi.setJarakTempuh(jarakTempuh);
        taksi.tampilkanInfo();
    } else {
        System.out.println("Jarak tempuh tidak valid.");
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
    for (int i = 0; i < dataTaksi.length; i++) {
        ...
    }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
    System.out.print("Masukkan nomor taksi: ");
    String nomorTaksi = scanner.nextLine();
    System.out.print("Masukkan merek taksi: ");
    String merek = scanner.nextLine();
    System.out.print("Masukkan tarif per km: ");
    double tarifPerKm = scanner.nextDouble();

    System.out.println(data);
    System.out.println("Data taksi ke-" + (i + 1) + ": " + dataTaksi[i]);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `String[] dataTaksi = { taksi.getNomorKendaraan(), taksi.getMerek(), String.valueOf(taksi.hitungTarif()) };` adalah contoh penggunaan array.

```bash
String[] dataTaksi = { taksi.getNomorKendaraan(), taksi.getMerek(), String.valueOf(taksi.hitungTarif()) };
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    ...
} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ahmad Romansyah
NPM: 2210010410
