package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi" +driver.getTitle());

        //Sayfa basliginin "Amazon" icerdigini test edin
        String actualTitel = driver.getTitle();
        if(actualTitel.contains("Amazon")){
            System.out.println("Titel testi PASSED");
        }else System.out.println("Titel testi FAILED");

        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());

        //Sayfa url'inin "amazon" icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("amazon")){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        //Sayfa handle degerini yazdirin
        System.out.println("Windows Handle Degeri" +driver.getWindowHandle());

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String sayfaKodlari = driver.getPageSource();
        if (sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code Testi PASSED");
        }else System.out.println("Source Code Testi FAILED");

        //Sayfayi kapatin.
        driver.close(); // Sayfayi kapatmak icin clouse() methodu kullanilir

    }

}