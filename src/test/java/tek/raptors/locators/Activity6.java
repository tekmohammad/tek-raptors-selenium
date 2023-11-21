package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {
    //Sign in with your credentials and go to account
    //and print name and email from profile section use xpath.
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        driver.manage().window().maximize();

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        driver.findElement(By.name("email")).sendKeys("mohammad@tekschool.com");
        driver.findElement(By.name("password")).sendKeys("Password@123");
        driver.findElement(By.id("loginBtn")).click();

        Thread.sleep(1000);
        driver.findElement(By.linkText("Account")).click();
        Thread.sleep(1000);

       String nameTitle = driver.findElement(
                By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div/div[1]/div/h1[1]"))
                .getText();
       String emailTitle =  driver.findElement(
                By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div/div[1]/div/h1[2]"))
                .getText();
        System.out.println(nameTitle);
        System.out.println(emailTitle);

        driver.quit();
    }
}
