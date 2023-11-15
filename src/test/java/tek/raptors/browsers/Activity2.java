package tek.raptors.browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    //open chrome, navigate to https://www.bbc.com/ get the title print title and close browser.
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com");
        //will maximize browser window.
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
