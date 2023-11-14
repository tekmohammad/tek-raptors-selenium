package tek.raptors.browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    //Open Chrome and navigate to facebook.com
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

    }
}
