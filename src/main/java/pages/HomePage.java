package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(linkText = "Sign In")
    WebElement signIn;


    //Method that performs login action using the web elements
    public void gotoLoginPage() {
        signIn.click();
        //return new LoginPage(driver);
    }

}
