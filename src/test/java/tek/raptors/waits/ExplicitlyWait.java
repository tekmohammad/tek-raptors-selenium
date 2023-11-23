package tek.raptors.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitlyWait {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        //Apply Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By singInLocator = By.linkText("Sign in");
        WebElement signInElement = wait.until(ExpectedConditions.elementToBeClickable(singInLocator));
        signInElement.click();

        By emailLocator = By.name("email");
        WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(emailLocator));
        emailElement.sendKeys("wrongEmeil@email.com");

        By passwordLocator = By.name("password");
        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        passwordElement.sendKeys("wrongPassword");

        By loginLocator = By.id("loginBtn");
        WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(loginLocator));
        loginElement.click();

        By errorLocator  = By.cssSelector("div.error");
        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorLocator));
        String text = errorElement.getText();
        System.out.println(text);
        driver.quit();
    }
}
