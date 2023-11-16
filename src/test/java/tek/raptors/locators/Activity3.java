package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

    /*
    Navigate to retail App. and click on sign in
    Enter any email and password and click on Login.
     */
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");

        By signInButtonLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInButtonLocator);
        signInElement.click();

        By nameInputLocator = By.name("email");
        WebElement nameInputElement = driver.findElement(nameInputLocator);
        nameInputElement.sendKeys("wrong@gmail.com");

        driver.findElement(By.name("password")).sendKeys("wrongPassword");

        driver.findElement(By.id("loginBtn")).click();

    }
}
