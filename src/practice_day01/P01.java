package practice_day01;

public class P01 {
    public static void main(String[] args) {

        //System.out.println("Hello World!");
        //System.out.println("Merhaba Java"); //println fonksiyonu verilen  string ifadeyi yazdirip bir alt satira gecer
        //System.out.print("yazdirma fonksiyonu-"); //print fonksiyonu verilen string ifadeyi yazdirir ve alt satira gecmez.
        //System.out.println("Merhaba");

        //Bu isaret tek satirlik yorum icin kullanilir.

        /*
        Birden fazla satirlik yorum yazmak gerekirse
        bu sekilde kullanim yapilmalidir.
         */

        // Soru1: Konsola "Hello Java Ben Geldim" yazdiriniz.

        System.out.println("Hello Java Ben Geldim");  //bunda tirnak isareti olmadan yaziyor.
        System.out.println("\"Hello Java Ben Geldim\"");

        /*
        \" :Cift tirnak isareti yazdirir.
        \' :Tek tirnak kullanmak istiyorsak bu sekilde kullaniriz.
        \n :Kendinden sonra gelen metni bir alt satirdan baslatir.
        \t :Kendinden sonra bir tam bosluk birakir.
         */

        System.out.println("\'Hello Wise\'");
        System.out.println();
        System.out.println("Hello Wise\nHave a nice day!");
        System.out.println("Hello Java\rSen neymissin be abi!");
        System.out.println();
        System.out.println("Hello Wise\tHello Future");

        System.err.println("Babayigit hoca"); //Kirmizi yazdirdi.


        /*Soru2 : Konsola deger atayarak

         Mehmet Emin Karaahmetoglu - Software Devolopment Engineer in TEST

         yazdiriz.
         */

        String str1 = "Mehmet Emin Karaahmetoglu ";
        String str2 = "- Software Devolopment Engineer in TEST";

        System.out.println(str1 + str2);


        /*
        Ödev sorusu: Asagidaki gibi bir ATM karsilama ekrani hazirlayip yazdiriniz.

        **********  WISE BANK   **********
        WISE ATM'YE HOŞGELDİNİZ
        1 – Bakiye Sorgulama
        2 – Para Yatırma
        3 – Para Çekme
        4 – Bilgi Güncelleme
        5 – Kart İade
        **********  WISE BANK   **********




         */

        String baslik1 = "**********  WISE BANK   **********";
        String baslik2 = "WISE ATM'YE HOŞGELDİNİZ";
        String menu1 = "1 – Bakiye Sorgulama";
        String menu2 = "2 – Para Yatırma";
        String menu3 = "3 – Para Çekme";
        String menu4 = "4 – Bilgi Güncelleme";
        String menu5 = "5 – Kart İade";
        String kapanis = "**********  WISE BANK   **********";

        System.out.println(baslik1 + '\n' + '\t' + baslik2 + '\n' + '\t' + menu1 + '\n' + '\t' + menu2 +
                '\n' + '\t' + menu3 + '\n' + '\t' + menu4 + '\n' + '\t' + menu5 + '\n' + kapanis);


    }
}
