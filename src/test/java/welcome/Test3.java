package welcome;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test3 {

    private WebDriver driver;


    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://magento.softwaretestingboard.com");
        driver.manage().window().maximize();
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }

    @Test
    public void signIn() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        home.gotoLoginPage();
        login.signIn("nromanen.softserveinc@gmail.com", "pass");
    }


    @Test
    public void invalidSignIn() {
        String invalidEmail = "nromanen";
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        home.gotoLoginPage();
        login.signIn(invalidEmail, "pass");

        assertTrue(login.getError().contains("Please enter a valid email address"),
                "Please enter a valid email address (Ex: johndoe@domain.com).");
    }

}
