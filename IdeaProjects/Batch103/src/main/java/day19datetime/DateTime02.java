package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //example 1: Java'dan aldiginiz Data'i "ay/gun/yil" olarak yaziniz
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = dtf.format(currentDate);
        System.out.println(formattedDate);


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);// Oct/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);//October/21/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");// "M" 10'dan küçük ayları 1, 2, 3 şeklinde yazar.
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);// October/21/2022

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate5 = dtf4.format(currentDate);
        System.out.println(formattedDate5);// October/21/2022

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yyyy");
        String formattedDate6 = dtf4.format(currentDate);
        System.out.println(formattedDate6);// October/21/2022


        //Example 2: Java dan aldiginiz time'in formatini degistiriniz
        LocalTime myTime = LocalTime.of(16, 23, 54, 2345);
        System.out.println(myTime);// 16:23:54.000002345

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm");//"HH" 24 saat sistemini, "hh" 12 saat sistemini kullanir
        String formattedMyTime1 = dtf7.format(myTime);
        System.out.println(formattedMyTime1);//04:23

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);//04:23 P


    }
}
