package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static WebDriver driver;

    public static String connexion_btn = "authorization-link";
    public static String email_input = "//input[@id='email']";
    public  static String password_input = "//input[@id='password']";
    public static String login_btn = "send2";

    public static void click_connexion_btn () throws  InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mytek.tn/");
        Thread.sleep(2000);
        driver.findElement(By.className(connexion_btn)).click();
    }

    public static void email_username() throws InterruptedException {


        Thread.sleep(2000);
        driver.findElement(By.xpath(email_input)).sendKeys("ramirbehi92@gmail.com");
    }

    public static void password() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_input)).sendKeys("19921920Mytek");
    }

    public static void logging_in() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id(login_btn)).click();
    }

}
