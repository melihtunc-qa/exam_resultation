import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner klavye = new Scanner(System.in);


        System.out.println("Öğrenci adı giriniz : ");
        String ogrenci1name = klavye.next();

        System.out.println("öğrenci no giriniz");
        int ogrenci1id=klavye.nextInt();



        System.out.println( ogrenci1name +  " isimli öğrencinin Matematik ders notu giriniz : ");

        int ogrenci1_m = klavye.nextInt();

        System.out.println(ogrenci1name + " isimli öğrencinin Fizik ders notunu giriniz : ");

        int ogrenci1_f = klavye.nextInt();

        System.out.println(ogrenci1name + " isimli öğrencinin Kimya ders notunu giriniz");

        int ogrenci1_k = klavye.nextInt();
        System.out.println(ogrenci1name +  " öğrenci no : "  +ogrenci1id+  " Matematik notu : " + ogrenci1_m + " Fizik notu : " + ogrenci1_f + " Kimya notu : " + ogrenci1_k );


        System.out.println("------------------------------------------");

        System.out.println("Öğrenci adı giriniz : ");
        String ogrenci2name = klavye.next();

        System.out.println("öğrenci no giriniz");
        int ogrenci2id=klavye.nextInt();



        System.out.println( ogrenci2name +  " isimli öğrencinin Matematik ders notu giriniz : ");

        int ogrenci2_m = klavye.nextInt();

        System.out.println(ogrenci2name + " isimli öğrencinin Fizik ders notunu giriniz : ");

        int ogrenci2_f = klavye.nextInt();

        System.out.println(ogrenci2name + " isimli öğrencinin Kimya ders notunu giriniz");

        int ogrenci2_k = klavye.nextInt();
        System.out.println(ogrenci2name +  "  öğrenci no : "  +ogrenci2id+  " Matematik notu : " + ogrenci2_m + " Fizik notu : " + ogrenci2_f + "  Kimya notu : " + ogrenci2_k );


        System.out.println("------------------------------------------");


        System.out.println("Öğrenci adı giriniz : ");
        String ogrenci3name = klavye.next();

        System.out.println("öğrenci no giriniz");
        int ogrenci3id=klavye.nextInt();



        System.out.println( ogrenci3name +  " isimli öğrencinin Matematik ders notu giriniz : ");

        int ogrenci3_m = klavye.nextInt();

        System.out.println(ogrenci3name + " isimli öğrencinin Fizik ders notunu giriniz : ");

        int ogrenci3_f = klavye.nextInt();

        System.out.println(ogrenci3name + " isimli öğrencinin Kimya ders notunu giriniz");

        int ogrenci3_k = klavye.nextInt();
        System.out.println(ogrenci3name +  " öğrenci no  : "  +ogrenci3id +  "  Matematik notu :  " + ogrenci3_m + " Fizik notu :  " + ogrenci3_f + " Kimya notu : " + ogrenci3_k );


        System.out.println("------------------------------------------");

        int ortalama_m = (ogrenci1_m + ogrenci2_m + ogrenci3_m)/3;
        int ortalama_k = (ogrenci1_k + ogrenci2_k + ogrenci3_k)/3;
        int ortalama_f = (ogrenci1_f + ogrenci2_f + ogrenci3_f)/3;

        System.out.println("  MATEMATİK dersininin ortalaması : " + ortalama_m);
        System.out.println(" FİZİK dersinin ortalaması : " + ortalama_f);
        System.out.println( " KİMYA dersinin ortalaması : " + ortalama_f );

        int canegrisi_m= (100 - ortalama_m );
        int canegrisi_f=(100-ortalama_f);
        int canegrisi_k=(100 -ortalama_k);


        System.out.println("---------------------------------------------------");



        if (ogrenci1_m>=ortalama_m){

            if (
                    ogrenci1_m <= ortalama_m + (canegrisi_m/7)
            ){
                System.out.println( ogrenci1name +  "   Matematik dersini " + " DD ile geçmiştir");
            } else if (ogrenci1_m <= ortalama_m + (2*canegrisi_m/7)) {

                System.out.println( ogrenci1name +  "  Matematik dersini " + " DC ile geçmiştir");

            }else if (ogrenci1_m <= ortalama_m + (3*canegrisi_m/7)) {

                System.out.println( ogrenci1name +  "  Matematik dersini " + " CC ile geçmiştir");

            }else if (ogrenci1_m <= ortalama_m + (4*canegrisi_m/7)) {

                System.out.println( ogrenci1name +  " Matematik dersini " + " CB ile geçmiştir");

            }else if (ogrenci1_m <= ortalama_m + (5*canegrisi_m/7)) {

                System.out.println( ogrenci1name +  " Matematik dersini " + " BB ile geçmiştir");

            }else if (ogrenci1_m <= ortalama_m + (6*canegrisi_m/7)) {

                System.out.println( ogrenci1name +  " Matematik dersini " + " BA ile geçmiştir");

            }else if (ogrenci1_m <= ortalama_m + canegrisi_m) {

                System.out.println( ogrenci1name +  " Matematik dersini " + " AA ile geçmiştir");

            }


        }else {
            System.out.println( ogrenci1name +  " Matematik dersinden FF ile kalmıştır");
        }



        if (ogrenci1_k>=ortalama_k){

            if (
                    ogrenci1_k <= ortalama_k + (canegrisi_k/7)
            ){
                System.out.println( ogrenci1name +  "  Kimya dersini " + " DD ile geçmiştir");
            } else if (ogrenci1_k <= ortalama_k + (2*canegrisi_m/7)) {

                System.out.println( ogrenci1name +  " Kimya dersini " + " DC ile geçmiştir");

            }else if (ogrenci1_k <= ortalama_k + (3*canegrisi_k/7)) {

                System.out.println( ogrenci1name +  " Kimya dersini " + " CC ile geçmiştir");

            }else if (ogrenci1_k <= ortalama_k + (4*canegrisi_k/7)) {

                System.out.println( ogrenci1name +  "Kimya dersini " + " CB ile geçmiştir");

            }else if (ogrenci1_k <= ortalama_k + (5*canegrisi_k/7)) {

                System.out.println( ogrenci1name +  "Kimya dersini " + " BB ile geçmiştir");

            }else if (ogrenci1_k <= ortalama_k + (6*canegrisi_k/7)) {

                System.out.println( ogrenci1name +  "Kimya dersini " + " BA ile geçmiştir");

            }else if (ogrenci1_k <= ortalama_k + canegrisi_k) {

                System.out.println( ogrenci1name +  "Kimya dersini " + " AA ile geçmiştir");

            }
    }



        if (ogrenci1_f>=ortalama_f){

            if (
                    ogrenci1_f <= ortalama_f + (canegrisi_f/7)
            ){
                System.out.println( ogrenci1name +  "  Fizik dersini " + " DD ile geçmiştir");
            } else if (ogrenci1_f <= ortalama_f + (2*canegrisi_f/7)) {

                System.out.println( ogrenci1name +  " Fizik dersini " + " DC ile geçmiştir");

            }else if (ogrenci1_f <= ortalama_f + (3*canegrisi_f/7)) {

                System.out.println( ogrenci1name +  " Fizik dersini " + " CC ile geçmiştir");

            }else if (ogrenci1_f <= ortalama_f + (4*canegrisi_f/7)) {

                System.out.println( ogrenci1name +  "Fizik dersini " + " CB ile geçmiştir");

            }else if (ogrenci1_f <= ortalama_f + (5*canegrisi_f/7)) {

                System.out.println( ogrenci1name +  "Fizik dersini " + " BB ile geçmiştir");

            }else if (ogrenci1_f <= ortalama_f + (6*canegrisi_f/7)) {

                System.out.println( ogrenci1name +  " Fizik dersini " + " BA ile geçmiştir");

            }else if (ogrenci1_f <= ortalama_f + canegrisi_f) {

                System.out.println( ogrenci1name +  "Fizik dersini " + " AA ile geçmiştir");

            }
        }



        if (ogrenci2_m>=ortalama_m){

            if (
                    ogrenci2_m <= ortalama_m + (canegrisi_m/7)
            ){
                System.out.println( ogrenci2name +  "   Matematik dersini " + " DD ile geçmiştir");
            } else if (ogrenci2_m <= ortalama_m + (2*canegrisi_m/7)) {

                System.out.println( ogrenci2name +  "  Matematik dersini " + " DC ile geçmiştir");

            }else if (ogrenci2_m <= ortalama_m + (3*canegrisi_m/7)) {

                System.out.println( ogrenci2name +  "  Matematik dersini " + " CC ile geçmiştir");

            }else if (ogrenci2_m <= ortalama_m + (4*canegrisi_m/7)) {

                System.out.println( ogrenci2name +  " Matematik dersini " + " CB ile geçmiştir");

            }else if (ogrenci2_m <= ortalama_m + (5*canegrisi_m/7)) {

                System.out.println( ogrenci2name +  " Matematik dersini " + " BB ile geçmiştir");

            }else if (ogrenci2_m <= ortalama_m + (6*canegrisi_m/7)) {

                System.out.println( ogrenci2name +  " Matematik dersini " + " BA ile geçmiştir");

            }else if (ogrenci2_m <= ortalama_m + canegrisi_m) {

                System.out.println( ogrenci2name +  " Matematik dersini" + " AA ile geçmiştir");

            }


        }else {
            System.out.println( ogrenci2name +  " Matematik dersinden FF ile kalmıştır");
        }

        if (ogrenci2_k>=ortalama_k){

            if (
                    ogrenci2_k <= ortalama_k + (canegrisi_k/7)
            ){
                System.out.println( ogrenci2name +  "   Kimya dersini " + " DD ile geçmiştir");
            } else if (ogrenci2_k <= ortalama_k + (2*canegrisi_k/7)) {

                System.out.println( ogrenci2name +  "  Kimya dersini " + " DC ile geçmiştir");

            }else if (ogrenci2_k <= ortalama_k + (3*canegrisi_k/7)) {

                System.out.println( ogrenci2name +  "  Kimya dersini " + " CC ile geçmiştir");

            }else if (ogrenci2_k <= ortalama_k + (4*canegrisi_k/7)) {

                System.out.println( ogrenci2name +  " Kimya dersini " + " CB ile geçmiştir");

            }else if (ogrenci2_k <= ortalama_k + (5*canegrisi_k/7)) {

                System.out.println( ogrenci2name +  " Kimya dersini " + " BB ile geçmiştir");

            }else if (ogrenci2_k <= ortalama_k + (6*canegrisi_k/7)) {

                System.out.println( ogrenci2name +  " Kimya dersini " + " BA ile geçmiştir");

            }else if (ogrenci2_k <= ortalama_k + canegrisi_k) {

                System.out.println( ogrenci2name +  " Kimya dersini" + "AA ile geçmiştir");

            }


        }else {
            System.out.println( ogrenci2name +  " Kimya dersinden FF ile kalmıştır");
        }

        if (ogrenci2_f>=ortalama_f){

            if (
                    ogrenci2_f <= ortalama_f + (canegrisi_f/7)
            ){
                System.out.println( ogrenci2name +  "   Fizik dersini " + " DD ile geçmiştir");
            } else if (ogrenci2_f <= ortalama_f + (2*canegrisi_f/7)) {

                System.out.println( ogrenci2name +  "  Fizik dersini " + " DC ile geçmiştir");

            }else if (ogrenci2_f <= ortalama_f + (3*canegrisi_f/7)) {

                System.out.println( ogrenci2name +  "  Fizik dersini " + " CC ile geçmiştir");

            }else if (ogrenci2_f <= ortalama_f + (4*canegrisi_f/7)) {

                System.out.println( ogrenci2name +  " Fizik dersini " + " CB ile geçmiştir");

            }else if (ogrenci2_f <= ortalama_f + (5*canegrisi_f/7)) {

                System.out.println( ogrenci2name +  " Fizik dersini " + " BB ile geçmiştir");

            }else if (ogrenci2_f <= ortalama_f + (6*canegrisi_f/7)) {

                System.out.println( ogrenci2name +  " Fizik dersini " + " BA ile geçmiştir");

            }else if (ogrenci2_f <= ortalama_f + canegrisi_f) {

                System.out.println( ogrenci2name +  " Fizik dersini " + " AA ile geçmiştir");

            }


        }else {
        System.out.println( ogrenci2name +  " Fizik dersinden FF ile kalmıştır");
    }



        if (ogrenci3_m>=ortalama_m){

            if (
                    ogrenci3_m <= ortalama_m + (canegrisi_m/7)
            ){
                System.out.println( ogrenci3name +  "   Matematik dersini " + " DD ile geçmiştir");
            } else if (ogrenci3_m <= ortalama_m + (2*canegrisi_m/7)) {

                System.out.println( ogrenci3name +  "  Matematik dersini " + " DC ile geçmiştir");

            }else if (ogrenci3_m <= ortalama_m + (3*canegrisi_m/7)) {

                System.out.println( ogrenci3name +  "  Matematik dersini " + " CC ile geçmiştir");

            }else if (ogrenci3_m <= ortalama_m + (4*canegrisi_m/7)) {

                System.out.println( ogrenci3name +  " Matematik dersini " + " CB ile geçmiştir");

            }else if (ogrenci3_m <= ortalama_m + (5*canegrisi_m/7)) {

                System.out.println( ogrenci3name +  " Matematik dersini " + " BB ile geçmiştir");

            }else if (ogrenci3_m <= ortalama_m + (6*canegrisi_m/7)) {

                System.out.println( ogrenci3name +  " Matematik dersini " + " BA ile geçmiştir");

            }else if (ogrenci3_m <= ortalama_m + canegrisi_m) {

                System.out.println( ogrenci3name +  "  Matematik dersini " + " AA ile geçmiştir");

            }


        }else {
            System.out.println( ogrenci3name +  "matematik dersinden FF ile kalmıştır");
        }


        if (ogrenci3_k>=ortalama_k){

            if (
                    ogrenci3_k <= ortalama_k + (canegrisi_k/7)
            ){
                System.out.println( ogrenci3name +  "   Kimya dersini " + " DD ile geçmiştir");
            } else if (ogrenci3_k <= ortalama_k + (2*canegrisi_k/7)) {

                System.out.println( ogrenci3name +  "  Kimya dersini " + " DC ile geçmiştir");

            }else if (ogrenci3_k <= ortalama_k + (3*canegrisi_k/7)) {

                System.out.println( ogrenci3name +  "  Kimya dersini " + " CC ile geçmiştir");

            }else if (ogrenci3_k <= ortalama_k + (4*canegrisi_k/7)) {

                System.out.println( ogrenci3name +  " Kimya dersini " + " CB ile geçmiştir");

            }else if (ogrenci3_k <= ortalama_k + (5*canegrisi_k/7)) {

                System.out.println( ogrenci3name +  " Kimya dersini " + " BB ile geçmiştir");

            }else if (ogrenci3_k <= ortalama_k + (6*canegrisi_k/7)) {

                System.out.println( ogrenci3name +  " Kimya dersini " + " BA ile geçmiştir");

            }else if (ogrenci3_k <= ortalama_k + canegrisi_k) {

                System.out.println( ogrenci3name +  " Kimya dersini " + " AA ile geçmiştir");

            }


        }else {
            System.out.println( ogrenci3name +  " Kimya dersinden FF ile kalmıştır");
        }


        if (ogrenci3_f>=ortalama_f){

            if (
                    ogrenci3_f <= ortalama_f + (canegrisi_f/7)
            ){
                System.out.println( ogrenci3name +  "   Fizik dersini " + " DD ile geçmiştir");
            } else if (ogrenci3_f <= ortalama_f + (2*canegrisi_f/7)) {

                System.out.println( ogrenci3name +  "  Fizik dersini " + " DC ile geçmiştir");

            }else if (ogrenci3_f <= ortalama_f + (3*canegrisi_f/7)) {

                System.out.println( ogrenci3name +  "  Fizik dersini " + " CC ile geçmiştir");

            }else if (ogrenci3_f <= ortalama_f + (4*canegrisi_f/7)) {

                System.out.println( ogrenci3name +  " Fizik dersini " + " CB ile geçmiştir");

            }else if (ogrenci3_f <= ortalama_f + (5*canegrisi_f/7)) {

                System.out.println( ogrenci3name +  " Fizik dersini " + " BB ile geçmiştir");

            }else if (ogrenci3_f <= ortalama_f + (6*canegrisi_f/7)) {

                System.out.println( ogrenci3name +  " Fizik dersini " + " BA ile geçmiştir");

            }else if (ogrenci3_f <= ortalama_f + canegrisi_f) {

                System.out.println( ogrenci3name +  " Fizik dersini " + " AA ile geçmiştir");

            }


        }else {
            System.out.println( ogrenci3name +  " Kimya dersinden FF ile kalmıştır");
        }



}

}