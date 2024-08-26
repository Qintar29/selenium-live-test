import org.junit.jupiter.api.Test;
import config.env_target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class login extends env_target{
    @Test
    public void main(){
        // set driver location path
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        // maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // set url
        driver.get(baseurl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/button"))
        );
        driver.findElement(By.id("email")).sendKeys("aaaa@gmail.com");
        driver.findElement(By.id("password")).sendKeys("aaaa");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/button")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/a[1]/div/div/div"))
        );

        driver.quit();
    }

    @Test
    public void invalidEmail(){
        // set driver location path
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        // maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // set url
        driver.get(baseurl);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/button"))
        );
        driver.findElement(By.id("email")).sendKeys("aa@gmail.com");
        driver.findElement(By.id("password")).sendKeys("aaaa");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/button")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[1]/span"))
        );

        driver.quit();
    }
}
