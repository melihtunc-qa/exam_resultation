import java.util.Scanner;

public class Ogrenci {
    String ad;
    int ogrenciNo;
    int matematikNotu;
    int fizikNotu;
    int kimyaNotu;

    public Ogrenci(String ad, int ogrenciNo) {
        this.ad = ad;
        this.ogrenciNo = ogrenciNo;
    }

    public void notlariGir(Scanner klavye) {
        System.out.println(ad + " isimli öğrencinin Matematik ders notu giriniz: ");
        matematikNotu = klavye.nextInt();

        System.out.println(ad + " isimli öğrencinin Fizik ders notunu giriniz: ");
        fizikNotu = klavye.nextInt();

        System.out.println(ad + " isimli öğrencinin Kimya ders notunu giriniz: ");
        kimyaNotu = klavye.nextInt();
    }

    public void notlariGoster() {
        System.out.println(ad + " öğrenci no: " + ogrenciNo +
                " Matematik notu: " + matematikNotu +
                " Fizik notu: " + fizikNotu +
                " Kimya notu: " + kimyaNotu);
    }

    public double notOrtalamasiHesapla() {
        return (matematikNotu + fizikNotu + kimyaNotu) / 3.0;
    }
}
