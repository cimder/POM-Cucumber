package PageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class leftNav extends AbstactClass {
  private WebDriver driver;

   public leftNav(){
       driver=Driver.getDriver();
       PageFactory.initElements(driver,this);
   }

   @FindBy(css = "span[class='nav-link-title ng-tns-c30-26 ng-star-inserted']")
    private WebElement humanresources;
   public void clickHR(){
       clickFunction(humanresources);
   }

}
