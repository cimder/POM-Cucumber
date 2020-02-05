package PageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReadProperteisFile;

public class signInPage extends AbstactClass {
    private WebDriver driver ;

    public signInPage(){

        driver=Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

//    public void signInMethod(){
//
//        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("nigeria_tenant_admin");
//        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("TnvLOl54WxR75vylop2A");
//        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();
//    }

    //     find by is working as driver.findelement
    @FindBy(css="[formcontrolname=\"username\"]")
    private WebElement inputUserName;

    @FindBy(css="[formcontrolname=\"password\"]")
    private WebElement inputPassword;

    @FindBy(css="button[aria-label=\"LOGIN\"]")
    private WebElement buttonLogin;

    public void typeIninputUserName(){
        sendkeysFunction(inputUserName , ReadProperteisFile.getData("Username") );
    }

    public void typeIninputPassword(){
        sendkeysFunction(inputPassword , ReadProperteisFile.getData( "Password" ) );
    }

    public void clickonbuttonLogin(){
        clickFunction(buttonLogin);
    }
}
