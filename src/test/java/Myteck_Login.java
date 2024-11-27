import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myteck_Login {

    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginToMytek() throws InterruptedException {
        driver.navigate().to("https://www.mytek.tn/");
        Thread.sleep(4000);
        driver.findElement(By.className("authorization-link")).click();
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ramirbehi92@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("19921920Mytek");
        Thread.sleep(4000);
        driver.findElement(By.id("send2")).click();
    }


}
