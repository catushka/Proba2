import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTest {

    @Test
    public void TestOpenPage () {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://disk.yandex.ru/");

        WebElement ButtonEnter = driver.findElement(By.cssSelector(".header__login-link"));
        ButtonEnter.click();

        WebElement FieldLogin = driver.findElement(By.id("passp-field-login"));
        FieldLogin.clear();

        FieldLogin.sendKeys("t3stowyj.t@yandex.ru");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement ButtonLogin = driver.findElement(By.cssSelector(".passp-form-button"));
        ButtonLogin.click();

        WebElement FieldPassword = driver.findElement(By.id("passp-field-passwd"));
        FieldPassword.clear();

        FieldPassword.sendKeys("t3stowyj.tQ1w2e3r4");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement ButtonPassword = driver.findElement(By.cssSelector(".passp-form-button"));
        ButtonPassword.click();

        driver.quit();

    }
}
