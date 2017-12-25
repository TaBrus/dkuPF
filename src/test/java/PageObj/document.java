package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class document {
    WebDriver wd;
    public document(WebDriver wd){
        this.wd = wd;
        PageFactory.initElements(wd, this);}


        @FindBy(xpath = "//*[@id=\"editOrderForm:operType_input\"]")    WebElement operType;
        @FindBy(xpath = "//*[@id=\"editOrderForm:contragC_input\"]")    WebElement randomclick;
        @FindBy(xpath = "//*[@id=\"editOrderForm:orderNum\"]")          WebElement numDoc;
        @FindBy(xpath = "//*[@id=\"editOrderForm:nextRegInfo\"]")       WebElement nextStep;
        @FindBy(xpath = "//*[@id=\"editOrderForm:depAccC_input\"]")     WebElement numDepAcc;
        @FindBy(xpath = "//*[@id=\"editOrderForm:depoSec_input\"]")     WebElement numDepSec;
        @FindBy(xpath = "//*[@id=\"editOrderForm:editReceiverHeader_content\"]/a/span[2]")    WebElement nextStep2;
        @FindBy(xpath = "//*[@id=\"editOrderForm:corrCode_input\"]")    WebElement numCorrCode;
        @FindBy(xpath = "//*[@id=\"editOrderForm:corrAccCInput\"]")    WebElement numCorrAcc;
        @FindBy(xpath = "//*[@id=\"editOrderForm:corrSecCInput\"]")    WebElement numCorrSec;
        @FindBy(xpath = "//*[@id=\"editOrderForm:editSecurityBtn\"]")    WebElement NextStep3;
        @FindBy(xpath = "//*[@id=\"editOrderForm:securityList:0:j_idt552\"]/img")    WebElement viborBumagi;
        @FindBy(xpath = "//*[@id=\"editOrderForm:securityListSelect:j_idt583:filter\"]")    WebElement vvodBumagi;
        @FindBy(xpath = "//*[@id=\"editOrderForm:securityListSelect_data\"]/tr/td[3]")   WebElement clickNABumagi;
        @FindBy(xpath = "//*[@id=\"editOrderForm:securityListSelectBtn1\"]/span\n")    WebElement podtvBumagi;
        @FindBy(xpath = "//*[@id=\"editOrderForm:securityList:0:security_q\"]")    WebElement kolvoBumag;
        @FindBy(xpath = "//*[@id=\"editOrderForm:saveOrderBtn\"]/span")    WebElement saveDoc;
        @FindBy(xpath = "//*[@id=\"editOrderForm:j_idt127\"]")    WebElement prodRedac;





}
