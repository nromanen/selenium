package welcome;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class Test2 {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }

    @Test
    public void test1() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();// .setSize(new Dimension(1254, 824));
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.id("email")).sendKeys("nromanen.softserveinc@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("M8E4W8DnhbfGPHQ");
        driver.findElement(By.id("send2")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
        driver.findElement(By.cssSelector(".header:nth-child(2) > .customer-welcome .action")).click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(3))
//                .until(ExpectedConditions.elementToBeClickable(By.linkText("My Accout")));
//        foo.click();
        driver.findElement(By.linkText("My Account")).click();
        ///html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a
    }
}
