package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");


        //HepsiBurada sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://www.techproeducation.com");

        //Tekrar Amazon Sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().back();

        //Tekrar Facebook sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //Son sayfada sayfayi yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //ve sayfayi kapatalim
        driver.close();

    }
}
