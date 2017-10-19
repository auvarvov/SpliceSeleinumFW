package cloud.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by auvarov on 10/11/17.
 */
public class SplicemachineCreateClusterPage extends SpliceMachineSamplePage {

    public SplicemachineCreateClusterPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getInternalDatasetEditField() {
        return getElement(LocatorType.XPATH, ".//*[@id='root']/div/div[1]/div/div/form/div[1]/div[2]/div[2]/div/div[1]/div[2]/div[2]/span/input");

    }

    public WebElement getExternalDatasetEditField() {
        return getElement(LocatorType.XPATH, ".//*[@id='root']/div/div[1]/div/div/form/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/span/input");

    }

    public WebElement getOLTPSpliceUnitsEditField() {
        return getElement(LocatorType.XPATH, ".//*[@id='root']/div/div[1]/div/div/form/div[1]/div[3]/div[2]/div/div[1]/div[2]/div[2]/span/input");

    }

    public WebElement getOLAPSpliceUnitsEditField() {
        return getElement(LocatorType.XPATH, ".//*[@id='root']/div/div[1]/div/div/form/div[1]/div[3]/div[2]/div/div[2]/div[2]/div[2]/span/input");

    }
    public WebElement getClusterNameEditField()
    {
        return getElement(LocatorType.XPATH, ".//*[@class='form-control input-lg']");

    }

    public void setClusterName(String value) {
        setValuetoEditField(getClusterNameEditField(), value);
    }


    public void setValuetoEditField(WebElement Editfield, String value) {
        Editfield.clear();
        Editfield.sendKeys(value);
    }


    public void setInternalDatasetValueToEditField(String value) {
        setValuetoEditField(getInternalDatasetEditField(), value);
    }

    public void setExternalDatasetValueToEditField(String value) {
        setValuetoEditField(getExternalDatasetEditField(), value);
    }


    public void setOLTPSpliceUnits(String value) {
        setValuetoEditField(getOLTPSpliceUnitsEditField(), value);
    }


    public void setOLAPSpliceUnits(String value) {
        setValuetoEditField(getOLAPSpliceUnitsEditField(), value);
    }


    public WebElement getOLTPSpliceUnitsbar()

    {
        return getElement(LocatorType.XPATH, "(.//*[@class='min__Slider___1sPTK boundsMarker__Slider___2HPxj'])[1]");
    }

    public WebElement getOLAPSpliceUnitsbar()

    {
        return getElement(LocatorType.XPATH, "(.//*[@class='min__Slider___1sPTK boundsMarker__Slider___2HPxj'])[2]");
    }


    public void clickOnNextButton() {
        getElement(LocatorType.XPATH, ".//*[@id='cancel']/../button[3]").click();

    }


    public WebElement dummy()

    {
        return getElement(LocatorType.XPATH, ".//*[@id='root']/div/div[1]/div/div/form/div[1]/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    }


}

