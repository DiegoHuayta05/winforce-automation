package win.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import win.pages.LoginPage;

import java.time.Duration;

public class LoginSteps {

    private WebDriver driver;

    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    public void typePassword(String password){
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }
    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
    }
}
