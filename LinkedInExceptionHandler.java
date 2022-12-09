import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkedInExceptionHandler {
public static void main(String[] args) throws IOException {
// Set up ChromeDriver
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--incognito");
WebDriver driver = new ChromeDriver(options);
  
    try {
        // Set up LinkedIn login page
        driver.get("https://www.linkedin.com/uas/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Enter username and password
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        // Press login button
        driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]")).click();

        // Wait for SMS verification input
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Enter SMS verification code
        driver.findElement(By.id("verification-code")).sendKeys(phoneNumber);

        // Press submit button
        driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();

        // Wait for login to complete
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } catch (NoSuchElementException e) {
        // Handle incorrect login credentials
        System.out.println("Incorrect login credentials. Please try again.");
    } catch (TimeoutException e) {
        // Handle failed SMS verification
        System.out.println("SMS verification failed. Please try again.");
    }
}
}
