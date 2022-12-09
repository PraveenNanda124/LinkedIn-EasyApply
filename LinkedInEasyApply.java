import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.LinkedInEasyApply.java

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkedInEasyApply {
public static void main(String[] args) throws IOException {
// Set up ChromeDriver
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--incognito");
WebDriver driver = new ChromeDriver(options);

    // Set up LinkedIn login page
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.get("https://www.linkedin.com/");

    // Set up login credentials
    String username = "your_username";
    String password = "your_password";
    String phoneNumber = "your_phone_number";

    // Set up LinkedInLogin object with login credentials
    LinkedInLogin login = new LinkedInLogin(username, password, phoneNumber);

    // Set up LinkedInSMS object with phone number
    LinkedInSMS sms = new LinkedInSMS(phoneNumber);

    // Set up LinkedInSearch object with search keywords and filters
    LinkedInSearch search = new LinkedInSearch("your_keywords", "your_location", "your_job_title", "your_company", "your_experience_level", "your_job_type");

    // Set up LinkedInShare object with job url and connections
    LinkedInShare share = new LinkedInShare("your_job_url", ["your_connection_1", "your_connection_2"], "your_message");

    // Log in to LinkedIn
    try {
        login.login(driver);
    } catch (IOException e) {
        e.printStackTrace();
    } catch {
        // Handle any exceptions
    }

    // Handle SMS verification
    try {
        sms.handleSMSVerification(driver);
    } catch (IOException e) {
        e.printStackTrace();
    } catch {
        // Handle any exceptions
    }

    // Search for job postings
    try {
        search.search(driver);
    } catch (IOException e) {.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkedInEasyApply {
public static void main(String[] args) throws IOException {
// Set up ChromeDriver
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--incognito");
WebDriver driver = new ChromeDriver(options);

    // Set up login credentials
    String username = "your_username";
    String password = "your_password";
    String phoneNumber = "your_phone_number";

    // Set up LinkedIn login page
    driver.get("https://www.linked
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

// Search for job postings
driver.get("https://www.linkedin.com/jobs/search/?keywords=your_keywords&location=your_location");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Loop through search results
while (true) {
// Check for job postings
if (driver.findElements(By.xpath("//button[contains(text(), 'Easy Apply')]")).size() > 0) {
// Apply to job posting
driver.findElement(By.xpath("//button[contains(text(), 'Easy Apply')
                          
// Apply to job posting
driver.findElement(By.xpath("//button[contains(text(), 'Easy Apply')]")).click();

// Wait for application form to load
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
e.printStackTrace();
}

// Fill out application form
driver.findElement(By.id("application-first-name")).sendKeys("your_first_name");
driver.findElement(By.id("application-last-name")).sendKeys("your_last_name");
driver.findElement(By.id("application-email")).sendKeys("your_email");
driver.findElement(By.id("application-phone")).sendKeys("your_phone_number");

// Upload resume and other files
for (String fileName : uploads.keySet()) {
driver.findElement(By.id("file-browse-input")).sendKeys(uploads.get(fileName));
driver.findElement(By.xpath("//button[contains(text(), 'Attach')]")).click();
}

// Press submit button
driver.findElement(By.xpath("//button[contains(text(), 'Submit application')]")).click();

// Record applied job in CSV file
appliedJobs.append(driver.findElement(By.xpath("//h1[@class='jobs-top-card__job-title t-24 t-black t-bold']")).getText());
jobCount++;

// Wait for application to process
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
e.printStackTrace();
}

// Go back to search results
driver.findElement(By.xpath("//button[contains(text(), 'Back to search results')]")).click();

// Check for maximum search time
if (System.currentTimeMillis() - startTime >= MAX_SEARCH_TIME) {
break;
}

// Wait for next page of search results to load
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
e.printStackTrace();
}

// Go to next page of search results
driver.findElement(By.xpath("//button[contains(text(), 'Next')]")).click();

// Close driver
driver.close();

// Write applied jobs to CSV file
FileWriter writer = new FileWriter(filename);
for (String appliedJob : appliedJobs) {
writer.append(appliedJob);
writer.append("\n");
}
writer.flush();
writer.close();

// Print number of applied jobs
System.out.println("Number of applied jobs: " + jobCount);
}
}

}

}

}

