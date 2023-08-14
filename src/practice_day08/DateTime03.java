package practice_day08;
// Belirli bir tarih girip o günden bugüne geçen zamanı gün saat dakika saniye olarak yazdırın

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime belirliGun = LocalDateTime.of(2014,8,17,14,00);

        LocalDateTime bugun = LocalDateTime.now();

        Duration duration = Duration.between(belirliGun,bugun);

        long day = duration.toDaysPart();
        long hour = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        System.out.println("Evliligimizde bugün: \n"+day+".Gün, "+hour+".saat, "+minutes+".dakika, "+seconds+".saniye geride kaldi");
        

    }
}
