package automationTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MazaadyLogin {
    public static WebDriver login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staging.mazaady.com/login");
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("test22@gmail.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("123456789");
        WebElement login=driver.findElement(By.className("btn-login"));
        login.click();
        String actualUrl="https://staging.mazaady.com/home";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        return driver ;
    }
}
