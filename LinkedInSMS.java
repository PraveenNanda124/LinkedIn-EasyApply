public class LinkedInEasyApply {
public static void main(String[] args) throws IOException {
// Set up LinkedInLogin object with login credentials
LinkedInLogin login = new LinkedInLogin("your_username", "your_password", "your_phone_number");
  
    // Set up LinkedInSMS object with phone number
    LinkedInSMS sms = new LinkedInSMS("your_phone_number");

    // Set up LinkedInSearch object with search keywords and filters
    LinkedInSearch search = new LinkedInSearch("your_keywords", "your_location", "your_job_title", "your_company", "your_experience_level", "your_job_type");

    // Set up LinkedInShare object with job url and connections
    LinkedInShare share = new LinkedInShare("your_job_url", ["your_connection_1", "your_connection_2"], "your_message");

    // Set up ChromeDriver
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    WebDriver driver = new ChromeDriver(options);

    // Log in to LinkedIn
    try {
        login.login(driver);
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Handle SMS verification
    try {
        sms.handleSMSVerification(driver);
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Search for job postings
    try {
        search.search(driver);
    } catch (IOException e) {
        e.printStackTr
