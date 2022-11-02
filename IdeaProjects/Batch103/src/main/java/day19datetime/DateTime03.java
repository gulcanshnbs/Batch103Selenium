package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayin.

        LocalDateTime japan  = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long diff = ChronoUnit.HOURS.between( germany,japan);
        System.out.println(diff);

        //Example 2: Sabit bir tarih olusturunuz
        LocalDate myData = LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myData);


        /*
           1) Java'da sabit datalari(Gun isimleri, Ay isimleri, Amerika'daki eyalet isimleri, etc.)  depolamak ve gerektiginde kullanmak icin
              depolar olustururuz. Bu depolara "Enum" denir.
         */

        //Example 3: USA icin "Woos!", UK icin "Big", Canada icin "Cold", Turkey icin "Vatan", Germany icin "Araba", Rwanda icin "Cay"

        Countries country = Countries.USA;

        switch (country){

            case USA:
                System.out.println("Woos!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");
        }



    }
}
