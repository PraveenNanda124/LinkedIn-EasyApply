public class LinkedInSMS {
public static void main(String[] args) throws IOException {
// Set up LinkedInSMS object with phone number
LinkedInSMS sms = new LinkedInSMS("your_phone_number");

      // Set up ChromeDriver
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    WebDriver driver = new ChromeDriver(options);

    // Handle SMS verification
    try {
        sms.handleSMSVerification(driver);
    } catch (IOException e) {
        e.printStackTrace();
    } catch {
        // Handle any exceptions
    }

    // Close the WebDriver instance
    driver.quit();
}
}
