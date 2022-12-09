import java.util.Date;

public class LinkedInRecord {
  private String company;
  private String position;
  private String location;
  private String easyApply;
  private Date dateApplied;
  private Date timeApplied;

  public LinkedInRecord(String company, String position, String location, String easyApply, Date dateApplied, Date timeApplied) {
    this.company = company;
    this.position = position;
    this.location = location;
    this.easyApply = easyApply;
    this.dateApplied = dateApplied;
    this.timeApplied = timeApplied;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getEasyApply() {
    return easyApply;
  }

  public void setEasyApply(String easyApply) {
    this.easyApply = easyApply;
  }

  public Date getDateApplied() {
    return dateApplied;
  }

  public void setDateApplied(Date dateApplied) {
    this.dateApplied = dateApplied;
  }

  public Date getTimeApplied() {
    return timeApplied;
  }

  public void setTimeApplied(Date timeApplied) {
    this.timeApplied = timeApplied;
  }
}
