package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {
    //navigate to insurance app. (https://dev.insurance.tekschool-students.com/)
    //Then click on Login. and then enter wrong username and password.
    //Then Click on Sign In and you get error print error Message.
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.name("username")).sendKeys("WrongUsername");
        driver.findElement(By.id("password")).sendKeys("WrongPassword");

        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        Thread.sleep(1000);

        By errorLocator = By.xpath("//div[contains(@class,'banner-error')]");
        String errorText = driver.findElement(errorLocator).getText();
       String replaced = errorText.substring(6);
        System.out.println(replaced);
        driver.quit();
    }

}
