package practice_day02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
            /*
1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
sisteme kaydedildiğini aşağıdaki formatta yazdırın.
 *****       KAYIT BAŞARILI      *****
Adınız: Tarık
Soyadınız: Yiğit
Yaşınız:42
Mail Adresiniz:tarik@yigit.com
Şifreniz: A2e365
şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
 */
      Scanner scanner = new Scanner(System.in);
     // System.out.println("Lütfen asagida ki bilgileri giriniz");
     // System.out.println("Adiniz: ");
     // String name = scanner.nextLine();

     // System.out.println("");

     // System.out.println("Soyadiniz: ");
     // String surname = scanner.nextLine();

     // System.out.println();

     // System.out.println("Yasiniz: ");
     // int yas = scanner.nextInt();

     // System.out.println();

     // System.out.println("Mail Adresiniz: ");
     // String mail = scanner.next();

     // System.out.println();

     // System.out.println("Sifreniz: ");
     // String pass = scanner.next();

     // System.out.println();

     // System.out.println("*****       KAYIT BAŞARILI      *****");

     // System.out.println("Adiniz: " + name);
     // System.out.println("Soyadiniz: " + surname);
     // System.out.println("Yasiniz: " + yas);
     // System.out.println("Mail adresiniz: " + mail);
     // System.out.println("Sifreniz: " + pass);
     // System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");

        /*
2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
üçgenin alanını hesaplayıp yazdırın


         */

        System.out.println("Lütfen alani hesaplanacak olan ücgenin ayrit degerlerini giriniz");
        System.out.println("Ücgenin bir kenarinin uzunlugunu giriniz: ");
        double kenar = scanner.nextDouble();
        System.out.println("O kenara ait yüksekligi giriniz: ");
        double yükseklik = scanner.nextDouble();
        System.out.println("========Bilgileri girilen ücgenin alan hesabi sonucu=======");
        System.out.println("Ücgenin alani: " + ((kenar*yükseklik)/2));


    }
}
