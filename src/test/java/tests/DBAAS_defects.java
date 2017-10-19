package tests;

import cloud.ui.*;
import framework.properties.Settings;
import org.junit.Assert;
import org.testng.annotations.Test;


/**
 * Created by auvarov on 10/11/17.
 */
public class DBAAS_defects extends MotherTest {
    @Test
    public void dBAAS_993() throws Exception {
        String clustername = Settings.get().getCloudParameters().getClustername();
        String login = Settings.get().getCloudParameters().getUsername();
        String password = Settings.get().getCloudParameters().getPassword();


        SplicemachineLogin start = new SplicemachineLogin(driver);
        SplicemachineFrontPage frontPage = new SplicemachineFrontPage(driver);
        SplicemachineCreateClusterPage createClusterPage = new SplicemachineCreateClusterPage(driver);
        SplicemachineCreateClusterPage2 createClusterPage2 = new SplicemachineCreateClusterPage2(driver);


        //start.clickOnLoginWithGoogle();
        start.simpleLogin(login, password);
        frontPage.clickOnCreateClusterButton();
        createClusterPage.setInternalDatasetValueToEditField("50");

        Assert.assertTrue("Incorrect barsize expected: 209.533px actual: " + createClusterPage.getOLTPSpliceUnitsbar().getCssValue("right"), createClusterPage.getOLTPSpliceUnitsbar().getCssValue("right").equals("209.533px"));
        Assert.assertTrue("Incorrect barsize expected: 301.967px actual: " + createClusterPage.getOLAPSpliceUnitsbar().getCssValue("right"), createClusterPage.getOLAPSpliceUnitsbar().getCssValue("right").equals("301.967px"));
        Assert.assertTrue("Incorrect number of SpliceUnits expected: 10 actual: " + createClusterPage.getOLTPSpliceUnitsEditField().getAttribute("value"), createClusterPage.getOLTPSpliceUnitsEditField().getAttribute("value").equals("10"));
        Assert.assertTrue("Incorrect number of SpliceUnits expected: 10 actual: " + createClusterPage.getOLAPSpliceUnitsEditField().getAttribute("value"), createClusterPage.getOLAPSpliceUnitsEditField().getAttribute("value").equals("10"));

        createClusterPage.setInternalDatasetValueToEditField("100");

        Assert.assertTrue("Incorrect barsize expected: 209.533px actual: " + createClusterPage.getOLTPSpliceUnitsbar().getCssValue("right"), createClusterPage.getOLTPSpliceUnitsbar().getCssValue("right").equals("138px"));
        Assert.assertTrue("Incorrect barsize expected: 301.967px actual: " + createClusterPage.getOLAPSpliceUnitsbar().getCssValue("right"), createClusterPage.getOLAPSpliceUnitsbar().getCssValue("right").equals("264.417px"));
        Assert.assertTrue("Incorrect number of SpliceUnits expected: 10 actual: " + createClusterPage.getOLTPSpliceUnitsEditField().getAttribute("value"), createClusterPage.getOLTPSpliceUnitsEditField().getAttribute("value").equals("10"));
        Assert.assertTrue("Incorrect number of SpliceUnits expected: 10 actual: " + createClusterPage.getOLAPSpliceUnitsEditField().getAttribute("value"), createClusterPage.getOLAPSpliceUnitsEditField().getAttribute("value").equals("10"));

    }
}
