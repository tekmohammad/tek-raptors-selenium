package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    //Navigate to Facebook, enter username and password. click on Login
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        By emailInputLocator = By.name("email");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys("dasdfasdfummy@email.com");

        By passwordInputLocator = By.id("pass");
        WebElement passwordElement = driver.findElement(passwordInputLocator);
        passwordElement.sendKeys("WrongPassword");

        By loginButtonLocator = By.name("login");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
       String text = loginButton.getText();
    }
}
