public class LinkedInSearch {
private String keywords;
private String location;
private String jobTitle;
private String company;
private String experienceLevel;
private String jobType;

public LinkedInSearch(String keywords, String location, String jobTitle, String company, String experienceLevel, String jobType) {
    this.keywords = keywords;
    this.location = location;
    this.jobTitle = jobTitle;
    this.company = company;
    this.experienceLevel = experienceLevel;
    this.jobType = jobType;
}

public void search() {
    // Set up LinkedIn jobs search page
    driver.get("https://www.linkedin.com/jobs/search/?keywords=" + keywords + "&location=" + location);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // Filter search results by job title, company, experience level, and job type
    if (jobTitle != null) {
        driver.findElement(By.id("job-title")).sendKeys(jobTitle);
    }
    if (company != null) {
        driver.findElement(By.id("company-name")).sendKeys(company);
    }
    if (experienceLevel != null) {
        driver.findElement(By.id("experience-level")).sendKeys(experienceLevel);
    }
    if (jobType != null) {
        driver.findElement(By.id("job-type")).sendKeys(jobType);
    }

    // Press search button
    driver.findElement(By.xpath("//button[contains(text(), 'Search')]")).click();

    // Loop through search results
    while (true) {
        // Check for job postings
        if (driver.findElements(By.xpath("//button[contains(text(),

