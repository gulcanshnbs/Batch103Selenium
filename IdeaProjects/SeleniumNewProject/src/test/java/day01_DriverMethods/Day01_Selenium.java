package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day01_Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        /*
            En Temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan
            Webdriver'in yerini göstermemiy gerekir. Bunun icin Java kütüphanesinden System.setProperty()
            methodunun icine ilk olarak driveri yazariz. ikinci olarak da driver'in fiziki yolunu kopyalariz.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

    }
}
