package homeWork16;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageCertificate {
    @FindBy(xpath = "//div[@class=\"certificate-check_group\"]/input")
    WebElement input;
    @FindBy(xpath = "//div[@class=\"certificate-check_group\"]/button")
    WebElement checkButton;
    @FindBy(className = "certificate-check_message")
    WebElement checkMessage;

    public void enterCertificateNum (String certNum){
        input.sendKeys(certNum);
    }
    public void checkButtonDisabled (){
        if(checkButton.getAttribute("disabled").equals("disabled")){
            System.out.println("Button is disabled");
        }else {
            checkButton.click();
        }
    }

}
