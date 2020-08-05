package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SabireHomePage {

    @FindBy(how = How.XPATH, using = "//div[@class='links']/a")
    public static WebElement loadLogin;
    @FindBy(how=How.XPATH, using ="//a[@href='https://hr-staging.buffsci.org/staff-positions']")
    public static WebElement positions;
    @FindBy(how= How.XPATH,using ="//a[@href='https://hr-staging.buffsci.org/home']")
    public  static WebElement staff;
    @FindBy(how=How.XPATH, using ="//a[@href='https://hr-staging.buffsci.org/staff-position-types']")
    public static WebElement positionType;
    @FindBy(how=How.XPATH,using = "//a[@href='https://hr-staging.buffsci.org/permissions']")
    public  static WebElement permission;
    @FindBy(how=How.XPATH, using = "//a[@href='https://hr-staging.buffsci.org/snapshot']")
    public static WebElement snapshot;
    @FindBy(how=How.XPATH,using="//a[@href='https://hr-staging.buffsci.org/applicants']")
    public static WebElement applicants;
   @FindBy(how=How.XPATH,using="//ul[@role='menu']")
    public  static WebElement menu;
   @FindBy(how=How.XPATH,using="/html/body/div/aside/div/div[6]/div/div/nav/ul")
    public static WebElement options;
   @FindBy(how=How.XPATH,using="//div[@class='card-body']/div/select[2]")
    public static WebElement location;
   @FindBy(how=How.XPATH,using="//input[@type='search']")
    public static WebElement searchBox;
   @ FindBy(how=How.XPATH,using="//li[@class='paginate_button page-item next disabled']")
    public static WebElement clickElement;
   @FindBy(how=How.XPATH,using="//table[@class='table table-striped dataTable no-footer dtr-inline collapsed']/tbody/tr/td[2]")
    public static WebElement dataTable;
   @FindBy(how=How.XPATH,using="//a[contains(text(),'Next')]")
    public static WebElement clickNext;







}