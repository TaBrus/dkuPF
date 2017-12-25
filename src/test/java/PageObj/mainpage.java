package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpage {
    WebDriver wd;

    public void mainpage(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(wd, this);   }
        @FindBy(xpath = "//*[@id=\"buttonsMenu:j_idt101\"]") WebElement createdocLoc;
    public void clickCreateDoc(){
        createdocLoc.click();
    }

}
