public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        Ogrenci ogrenci1 = new Ogrenci("Öğrenci 1", 1);
        Ogrenci ogrenci2 = new Ogrenci("Öğrenci 2", 2);
        Ogrenci ogrenci3 = new Ogrenci("Öğrenci 3", 3);

        ogrenci1.notlariGir(klavye);
        ogrenci1.notlariGoster();

        System.out.println("------------------------------------------");

        ogrenci2.notlariGir(klavye);
        ogrenci2.notlariGoster();

        System.out.println("------------------------------------------");

        ogrenci3.notlariGir(klavye);
        ogrenci3.notlariGoster();

        System.out.println("------------------------------------------");

        double ortalamaMat = (ogrenci1.notOrtalamasiHesapla() + ogrenci2.notOrtalamasiHesapla() + ogrenci3.notOrtalamasiHesapla()) / 3;
        double ortalamaFizik = (ogrenci1.fizikNotu + ogrenci2.fizikNotu + ogrenci3.fizikNotu) / 3;
        double ortalamaKimya = (ogrenci1.kimyaNotu + ogrenci2.kimyaNotu + ogrenci3.kimyaNotu) / 3;

        System.out.println("Matematik dersininin ortalaması: " + ortalamaMat);
        System.out.println("Fizik dersinin ortalaması: " + ortalamaFizik);
        System.out.println("Kimya dersinin ortalaması: " + ortalamaKimya);

        klavye.close();
    }
}
