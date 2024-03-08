import java.util.Scanner;

public class KonversiSuhuDanPerhitungan {

    // Konversi suhu dari Reamur ke Celcius, Fahrenheit, dan Kelvin
    public static void konversiSuhu(double reamur) {
        double celcius = reamur * 5/4;
        double fahrenheit = reamur * 9/4 + 32;
        double kelvin = reamur * 5/4 + 273.15;

        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }

    // Menghitung umur berdasarkan tahun lahir
    public static void hitungUmur(int tahunLahir) {
        int tahunSekarang = java.time.Year.now().getValue();
        int umur = tahunSekarang - tahunLahir;

        System.out.println("Umur: " + umur + " tahun");
    }

    // Menghitung luas dan keliling segitiga
    public static void hitungSegitiga(double alas, double tinggi) {
        double luas = (alas * tinggi) / 2;
        double keliling = alas + tinggi + Math.sqrt(alas*alas + tinggi*tinggi); // asumsi segitiga siku-siku

        System.out.println("Luas Segitiga: " + luas);
        System.out.println("Keliling Segitiga: " + keliling);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Reamur: ");
        double reamur = scanner.nextDouble();
        konversiSuhu(reamur);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();
        hitungUmur(tahunLahir);

        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        hitungSegitiga(alas, tinggi);

        scanner.close();
    }
}
