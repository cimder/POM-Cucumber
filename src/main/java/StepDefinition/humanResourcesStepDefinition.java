package StepDefinition;

import PageObjectmodel.AbstactClass;
import PageObjectmodel.applicationPage;
import PageObjectmodel.leftNav;
import PageObjectmodel.signInPage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.ReadProperteisFile;

import java.util.concurrent.TimeUnit;

public class humanResourcesStepDefinition extends AbstactClass {

    WebDriver driver;
    signInPage sip = new signInPage();
    leftNav lv = new leftNav();
    applicationPage ap = new applicationPage();

    @Given("^Go to the mercys website$")
    public void go_to_the_mercys_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(ReadProperteisFile.getData("URL"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
        sip.typeIninputUserName();
        sip.typeIninputPassword();
        sip.clickonbuttonLogin();
    }

    @Given("^Click on HumanResources$")
    public void click_on_HumanResources() throws Throwable {
        lv.clickHR();
    }

    @Given("^Click on Setup$")
    public void click_on_Setup() throws Throwable {

    }

    @Given("^Click on Salary$")
    public void click_on_Salary() throws Throwable {

    }

    @Given("^Click on plus icon$")
    public void click_on_plus_icon() throws Throwable {

    }

    @Given("^Type in the Name \"(.*?)\"$")
    public void type_in_the_Name(String arg1) throws Throwable {

    }

    @Given("^Click on User Type$")
    public void click_on_User_Type() throws Throwable {

    }


}
