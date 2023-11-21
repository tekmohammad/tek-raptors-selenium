package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecapActivity {
    // Navigate to retail app click on sign in, click on Create new Account.
    // Fill up form and create an account.
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        driver.findElement(By.partialLinkText("Create New Account")).click();

        driver.findElement(By.name("name")).sendKeys("Mohammad");
        driver.findElement(By.name("email")).sendKeys("Mohammad1@tekschoo.com");
        driver.findElement(By.name("password")).sendKeys("Password@123");
        driver.findElement(By.name("confirmPassword")).sendKeys("Password@123");

        driver.findElement(By.id("signupBtn")).click();
        Thread.sleep(2000);
        String actualEmail = driver.findElement(By.className("account__information-email")).getText();

        if (actualEmail.equals("Mohammad1@tekschoo.com")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}
