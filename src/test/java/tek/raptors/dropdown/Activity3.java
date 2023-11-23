package tek.raptors.dropdown;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity3 {
    //Navigate to insurance app.
    //click on Create new Account fill the form and Create Account.

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.insurance.tekschool-students.com/");

        driver.findElement(By.linkText("Create Primary Account")).click();

        driver.findElement(By.name("email")).sendKeys("mohammad123123@tekschool.us");
        WebElement titleElement = driver.findElement(By.name("title"));
        Select titleSelect = new Select(titleElement);
        titleSelect.selectByVisibleText("Mr.");

        driver.findElement(By.name("firstName")).sendKeys("Mohammad");
        driver.findElement(By.name("lastName")).sendKeys("Shokriyan");
        WebElement genderElement = driver.findElement(By.name("gender"));
        Select genderSelect = new Select(genderElement);
        genderSelect.selectByIndex(1);

        WebElement maritalStatusElement =  driver.findElement(By.name("maritalStatus"));
        Select maritalStatusSelect = new Select(maritalStatusElement);
        maritalStatusSelect.selectByValue("SINGLE");

        driver.findElement(By.name("employmentStatus")).sendKeys("Software Developer");

        driver.findElement(By.name("dateOfBirth")).sendKeys("02121998");

        driver.findElement(By.xpath("//button[text()='Create Account']")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
