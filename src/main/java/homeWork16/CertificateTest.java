package homeWork16;


import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;


@RunWith(Parameterized.class)
public class CertificateTest extends BaseCertificate {

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(CertificateEnum.values());
    }

    public CertificateTest(CertificateEnum certNum) {

        if (bundle == null || !bundle.getString("type").equals(certNum.getType())) {
            driver.get("https://certificate.ithillel.ua/" );
            bundle = ResourceBundle.getBundle(certNum.getType());
            pageCertificate = PageFactory.initElements(driver, PageCertificate.class);
        }
    }
    @Test
    public void certValidation(){
        pageCertificate.enterCertificateNum(bundle.getString("number"));
        pageCertificate.clickButton();
        Assert.assertTrue(bundle.getString("message"),pageCertificate.messageDisplay());

    }

}
