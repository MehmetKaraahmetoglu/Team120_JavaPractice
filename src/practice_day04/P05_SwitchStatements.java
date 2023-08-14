package practice_day04;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        //Kullanicidan o günün hangi gün oldugunu girmesini isteyip
        //Haftanin kacinci günü oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Bugün günlerden hangi gün?");
        String gun = scan.next();
        gun=gun.toLowerCase();
        switch (gun){
            case "pazartesi" :  //switch case durumunda eger case sayi ise direk yazilir, case String ise "" arasinda yazilir
                System.out.println(gun + "Haftanin 1. günüdür.");
                break;
            case "sali":
                System.out.println(gun + "Haftanin 2. günüdür.");
                break;
            case "carsamba":
                System.out.println(gun + "Haftanin 3. günüdür.");
                break;
            case "persembe":
                System.out.println(gun + "Haftanin 4. günüdür.");
                break;
            case "cuma":
                System.out.println(gun + "Haftanin 5. günüdür.");
                break;
            case"cumartesi":
                System.out.println(gun + "Haftanin 6. günüdür.");
                break;
            case "pazar":
                System.out.println(gun + "Haftanin 7. günüdür.");
                break;
            default:
                System.out.println("Yanlis gün girdiniz");
        }
    }
}
