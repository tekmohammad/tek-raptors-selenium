package tek.raptors.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
    /*
    navigate to tek retail app and the goto sign in and create new account.
    enter name and enter invalid email and print error message for email field.
     */
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/");

        driver.findElement(By.linkText("Sign in")).click();

        driver.findElement(By.partialLinkText("New Account")).click();

        driver.findElement(By.name("name")).sendKeys("Mohammad");

        driver.findElement(By.name("email")).sendKeys("wrongEmail");

        driver.findElement(By.name("password")).sendKeys("");

        String errorText = driver.findElement(By.className("error")).getText();

        System.out.println(errorText);

    }
}
