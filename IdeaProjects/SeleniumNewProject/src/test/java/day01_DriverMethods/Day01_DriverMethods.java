package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Bos Browser olarak actik
        driver.get("https://www.amazon.com");  //ilk olarak gitmek istedigimiz sayfayi belirtiriz
        System.out.println("Sayfa Basligi : " +driver.getTitle());
        System.out.println("Sayfa Url" +driver.getCurrentUrl());

        driver.getPageSource();
        System.out.println(driver.getWindowHandle()); //Bize o window'a ait hash degerini verir. Biz bu hash degerlerini
                                                      //bir String'e atayip pencereler arasi gecis yapabiliriz.
    }

}
