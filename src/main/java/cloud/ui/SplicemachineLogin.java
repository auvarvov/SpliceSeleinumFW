package cloud.ui;

import org.openqa.selenium.WebDriver;

/**
 * Created by auvarov on 10/11/17.
 */
public class SplicemachineLogin extends AbstractPage {


    public SplicemachineLogin(WebDriver driver) {
        super(driver);


    }

    public void clickLoginButton() {

        getElement(LocatorType.CSS, ".root__ActionButton___KYjY8.next__ActionButton___2GwLr.undefined.btn.btn-default").click();
    }

    public void clickOnLoginWithGoogle() {

        getElement(LocatorType.CSS, ".//*[@class='googleBtn__Login___3FARq btn btn-default btn-block']").click();


    }

    public void fillCredentials(String email, String password) {

        getElement(LocatorType.XPATH, ".//*[@id='email']").sendKeys(email);
        getElement(LocatorType.XPATH, ".//*[@id='password']").sendKeys(password);


    }


    public void simpleLogin(String email, String password) {
        fillCredentials(email, password);
        clickLoginButton();

    }

}
