package practice_day08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Soru: Verilen bir tarihten belirli gün sayısını ekleyerek gelecekteki bir tarihi hesaplayan bir
public class DateClass02 {
    public static void main(String[] args) {

        //LocalDateTime: Yil, gün, ay, saat, dakika, saniye
        //LocalDate: Yil, gün, ay

        LocalDate startDate = LocalDate.of(2023,8,12);
        //Baslangic tarihini belirledik.

        LocalDate futureDate = calculateFuturDate(startDate,35000);
        //Baslangic tarihine ne kadar gün eklemek istiyorsam method icinde yaziyorum.
        System.out.println(futureDate);
    }
    static LocalDate calculateFuturDate(LocalDate startDate,long addDay){
        return startDate.plus(addDay, ChronoUnit.DAYS);
    }

}
