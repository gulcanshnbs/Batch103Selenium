package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

       // Example 1: "Anlik tarihi" (Current Date) ekrana yazdiran kodu yaziniz.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

       // Example 2: "Anlik zamani" (Current Time) ekrana yazdiran kodu yaziniz.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);



        // Example 3: "Anlik tarihi" (Current Date ve "Anlik zamani" (Current Time) ) ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        // Example 4: Japonya'daki anlik tarihi ve anlik saati ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDataTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDataTimeInJapan);

        // Example 5: Istanbul'daki anlik tarihi ve anlik saati ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDataTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDataTimeInIstanbul);


        // Example 6: Bugünden 789 gun sonra emekli olacaginiza gore; emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate= LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        // Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.
        LocalDate  dobOmer  = LocalDate.of(2011,04,16);
        LocalDate  dobAhmet = LocalDate.of(2016,03,15);

        // between(dobOmer,dobAhmet) method'u kullanildiginda daha esko olan tarih ilk yazilmalidir.
        Long differns = ChronoUnit.DAYS.between(dobOmer, dobAhmet);
        System.out.println(differns);

        // Example 8: Istanbul'un Fethi ile, Cumhuriyet'in kurulmasi arasinda kac ay oldugunu yaziniz.

        LocalDate istFethi =  LocalDate.of(1453,05,29);
        LocalDate cumhuriyet = LocalDate.of(1923,10,29);

        Long diff = ChronoUnit.MONTHS.between(istFethi,cumhuriyet);
        System.out.println(diff);

        // Example 9: Verilen Tarih'in hangi burcta oldugunu gosteren kodu yaziniz.

        LocalDate myDate = LocalDate.of(1987,03,24);

        int day   = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();


        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if((day>=21 && month==3) || (day<=20 && month==4) ){
            System.out.println("Koc");
        }else if((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }








    }

}
