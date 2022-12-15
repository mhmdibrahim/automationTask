package automationTask;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.sql.Driver;
import java.time.Duration;

public class AddProduct {
    public static void main(String[] args) {

        WebDriver driver =  automationTask.MazaadyLogin.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(250));
        WebElement hover = driver.findElement(By.xpath("//*[@id=\"top-header-main\"]/div/div/div[2]/div/div/div[2]/a"));
        hover.click();
        WebElement addproduct = driver.findElement(By.linkText("Add Product"));
        addproduct.click();
        /* another ways to select add product button
        WebElement addproduct = driver.findElement(By.xpath("//a[contains(@href,'https://staging.mazaady.com/add-product')]"));
        WebElement addproduct = driver.findElement(By.xpath("//*[contains(@name,'btn')])");
        WebElement addproduct = driver.findElement(By.xpath("//*[contains(text(),'Add Product')]"));
        new WebDriverWait(driver,Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(addproduct));
        */

        // first Step (1)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        WebElement nextStep=driver.findElement(By.className("continue"));
        nextStep.click();

        // Second Step (2)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

        // Add Aution Name
        WebElement autionName=driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[3]/div/span[2]/input"));
        //WebElement autionName=driver.findElement(By.name("title"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        autionName.sendKeys("aution name");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

        //Select Main Category
        WebElement mainCategory=driver.findElement(By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input"));
        mainCategory.sendKeys("CARS , MOTORCYCLES & ACCESSORIES");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
        // Select Sub Category
        WebElement subCategories=driver.findElement(By.xpath("//*[@id=\"vs4__combobox\"]/div[1]/input"));
        subCategories.sendKeys("Cars");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

        //Select Process Type
        WebElement process_type=driver.findElement(By.xpath("//*[@id=\"vs10__combobox\"]/div[1]/input"));
        process_type.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

        // Select Brand
        WebElement brand=driver.findElement(By.xpath("//*[@id=\"vs11__combobox\"]/div[1]/input"));
        brand.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
        // Transmission Type
        WebElement transmission_type=driver.findElement(By.xpath("//*[@id=\"vs12__combobox\"]/div[1]/input"));
        transmission_type.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();

        // Fuel Type
        WebElement fuel_type=driver.findElement(By.xpath("//*[@id=\"vs13__combobox\"]/div[1]/input"));
        fuel_type.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();

        //Select Condition
        WebElement condition=driver.findElement(By.xpath("//*[@id=\"vs14__combobox\"]/div[1]/input"));
        condition.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
        //Select Color
        WebElement color=driver.findElement(By.xpath("//*[@id=\"vs15__combobox\"]/div[1]/input"));
        color.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

        //Add Odometer
        WebElement Odometer=driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[4]/div/span/div[10]/div/div/input"));
        Odometer.sendKeys("12");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));

        //Select Odometer Unit
        WebElement odmeter_unit=driver.findElement(By.xpath("//*[@id=\"vs16__combobox\"]/div[1]/input"));
        odmeter_unit.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Select Cylinders
        WebElement Cylinders=driver.findElement(By.xpath("//*[@id=\"vs17__combobox\"]/div[1]/input"));
        Cylinders.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Select Drive
        WebElement Drive=driver.findElement(By.xpath("//*[@id=\"vs18__combobox\"]/div[1]/input"));
        Drive.sendKeys("Other");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Add VIN #
        WebElement vin=driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[4]/div/span/div[14]/div/div/input"));
        vin.sendKeys("3");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Select Country Made
        WebElement country_made=driver.findElement(By.xpath("//*[@id=\"vs19__combobox\"]/div[1]/input"));
        country_made.sendKeys("Egypt");
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Add Quantity
        WebElement quantity=driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[5]/div/span[2]/input"));
        quantity.sendKeys("3");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Add Auction Details

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        WebElement fr = driver.findElement(By.id("tinymce_description_ifr"));
        WebDriver frame = driver.switchTo().frame(fr);
        WebElement Auction_details = frame.findElement(By.xpath("//*[@id=\"tinymce\"]/p/br"));
        Auction_details.sendKeys("Aution Details");
        driver = frame.switchTo().parentFrame();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Add Return and Exchange policy
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        WebElement fr2 = driver.findElement(By.id("tinymce_policy_ifr"));
        WebDriver frame2 = driver.switchTo().frame(fr2);
        WebElement return_policy = frame2.findElement(By.xpath("//*[@id=\"tinymce\"]/p/br"));
        return_policy.sendKeys("Return and Exchange policy");
        driver = frame.switchTo().parentFrame();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        //Main image
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        WebElement main_image=driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[10]/div/div/div[1]/div/div[3]/label"));
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.release().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        main_image.sendKeys("limboxmas-530.jpg.cf.jpg");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //Next Step button
        WebElement next_step = driver.findElement(By.xpath("//*[@id=\"step-2\"]/span/div[2]/div[13]/div/button[2]"));
        addproduct.click();

    }

}
