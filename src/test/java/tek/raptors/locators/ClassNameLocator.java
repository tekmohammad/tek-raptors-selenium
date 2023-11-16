package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

    public static void main(String[] args) throws InterruptedException{
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

        Thread.sleep(1000);
        //Using Class Name.
        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);
        String errorText = errorElement.getText();
        System.out.println(errorText);

        driver.quit();
    }
}
