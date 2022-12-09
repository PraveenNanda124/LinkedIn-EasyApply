public class LinkedInLogin {
private String username;
private String password;
private String phoneNumber;

public LinkedInLogin(String username, String password, String phoneNumber) {
    this.username = username;
    this.password = password;
    this.phoneNumber = phoneNumber;
}

public void login() {
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

    // Handle login errors or exceptions
    try {
        if (driver.findElement(By.id("session_key-login-error")).isDisplayed()) {
            log.error("Invalid username or password");
        } else if (driver.findElement(By.id("verification-code-login-error")).isDisplayed()) {
            log.error("Invalid SMS verification code");
        }
    } catch (NoSuchElementException e) {
        log.debug("Login successful");
    }
}

