package tek.raptors.browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserExampleWithExceptionHandling {

    public static void main(String[] args) {
        ChromeDriver driver = null ;
        try {
            driver = new ChromeDriver();
            driver.get("https://dev.insurance.tekschool-students.com/");
            Thread.sleep(10000);
            String title = driver.getTitle();
            System.out.println(title);
        }catch(Exception ex) {
            System.out.println("Exception happened");
            ex.printStackTrace();
        } finally {
            //! =
            if (driver != null)
                driver.quit();
        }

    }
}
