package tests;

import cloud.ui.*;
import framework.properties.Settings;
import org.testng.annotations.Test;


/**
 * Created by auvarov on 10/11/17.
 */
public class Zeppelin extends MotherTest {


    @Test
    public void test1() throws Exception {
        String clustername = Settings.get().getCloudParameters().getClustername();
        String login = Settings.get().getCloudParameters().getUsername();
        String password = Settings.get().getCloudParameters().getPassword();


        SplicemachineLogin start = new SplicemachineLogin(driver);
        SplicemachineFrontPage frontPage = new SplicemachineFrontPage(driver);
        SplicemachineCreateClusterPage createClusterPage = new SplicemachineCreateClusterPage(driver);
        SplicemachineCreateClusterPage2 createClusterPage2 = new SplicemachineCreateClusterPage2(driver);
        SplicemachineSettingsPage settingsPage = new SplicemachineSettingsPage(driver);

        //start.clickOnLoginWithGoogle();
        start.simpleLogin(login, password);
        frontPage.clickOncluster("qa1");
        frontPage.clickOnNavigationAccountButton();
        frontPage.clickOnNavigationDashboardButton();
        frontPage.clickOnNavigationEventsButton();
        frontPage.clickOnNavigationProfileDropDownButton();
        frontPage.clickOnNavigationSettingsDropDownButton();
        settingsPage.clickOnBillingActivityTab();
        settingsPage.clickOnCompanyInformationTab();
        settingsPage.clickOnUsersTab();
        settingsPage.clickOnNavigationLogoutDropDownButton();

    }


}
