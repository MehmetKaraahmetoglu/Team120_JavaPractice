package practice_day01;

public class P02_dataTypes {
    public static void main(String[] args) {

        /*
        byte: Sadece tam sayi deger ifade eder. - Hafizada 8 bit yer kaplar.
        short: Sadece tam sayi deger ifade eder. - Hafizada 16 bit yer kaplar.
        int: Sadece tam sayi deger ifade eder. - Hafizada 32 bit yer kaplar. (En cok kullanilan)
        long: Sadece tam sayi deger ifade eder. - Hafizada 64 bit yer kaplar.

        float: Ondalikli sayilari ifade eder. (Sonunda f yazmak zorunludur.)
        double: Ondalikli sayilari ifade eder. (Sonunda d yazmak zorunlu degil.)

        byte<short<int<long<float<double

        boolean: True ya da false
        char: tek tirnak icinde yazilir. Tek karakter alir.ASCII karakteri alir.
        */

        byte b1 = Byte.MAX_VALUE;
        byte b2 = Byte.MIN_VALUE;
        System.out.println("byte max deger: " + b1);  //127
        System.out.println("byte min deger: " + b2);  //-128
        //byte c=128; byte max 127 oldugu icin atayamiyoruz.

        short s1 = Short.MAX_VALUE;
        short s2 = Short.MIN_VALUE;
        System.out.println("short max deger: " + s1);  //32767
        System.out.println("short min deger: " + s2);  //-32768

        int i1= Integer.MAX_VALUE;
        int i2= Integer.MIN_VALUE;
        System.out.println("int max deger: " + i1);  //2147483647
        System.out.println("int min deger: " + i2); //-2147483648

        long l1= Long.MAX_VALUE;
        long l2= Long.MIN_VALUE;
        System.out.println("long max deger: " + l1);  //9223372036854775807
        System.out.println("long min deger: " + l2);  //-9223372036854775808

        float f1= Float.MAX_VALUE;
        float f2= Float.MIN_VALUE;
        System.out.println("float max deger: " + f1);  //3.4028235E38
        System.out.println("float min deger: " + f2);  //1.4E-45

        double d1= Double.MAX_VALUE;
        double d2= Double.MIN_VALUE;
        System.out.println("double max deger: " + d1);  //1.7976931348623157E308
        System.out.println("douuble min deger: "+ d2);  //4.9E-324


        /*
        nonPrimitive data turleri ise cok fazladir.
        String su an sadece bildigimiz.
        Ozellik: Karakter siniri yok.


         */

        String isim = "Mehmet";
        char giris = 'm';

        System.out.println("isim: " + isim);
        System.out.println("giris: " + giris);
        System.out.println(isim.charAt(3));

    }
}
