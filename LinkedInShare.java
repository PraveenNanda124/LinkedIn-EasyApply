public class LinkedInShare {
private String jobUrl;
private String[] connections;
private String message;

public LinkedInShare(String jobUrl, String[] connections, String message) {
    this.jobUrl = jobUrl;
    this.connections = connections;
    this.message = message;
}

public void share() {
    // Navigate to job posting
    driver.get(jobUrl);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // Press share button
    driver.findElement(By.xpath("//button[contains(text(), 'Share')]")).click();

    // Wait for share options to load
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Select connections to share with
    for (String connection : connections) {
        driver.findElement(By.id("connection-name")).sendKeys(connection);
        driver.findElement(By.id("connection-name")).sendKeys(Keys.RETURN);
    }

    // Enter message to include with job posting
    if (message != null) {
        driver.findElement(By.id("share-message")).sendKeys(message);
    }

    // Press share button
    driver.findElement(By.xpath("//button[contains
