package tests;

import cloud.ui.*;
import framework.properties.Settings;
import org.junit.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

/**
 * Created by auvarov on 10/19/17.
 */
public class CreateDataBaseTest extends MotherTest {

    @Test
    public void createCluster() throws Exception {

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
        createClusterPage.setInternalDatasetValueToEditField("0.1");
        createClusterPage.setOLTPSpliceUnits("4");
        createClusterPage.setOLAPSpliceUnits("6");
        createClusterPage.setClusterName(clustername);
        createClusterPage.clickOnNextButton();
        createClusterPage2.clickConfirrmCheckBox();
        createClusterPage2.clickOnLaunchButton();
        sleep(5000);

        createClusterPage2.clickOnNavigationDashboardButton();
        System.out.println("Cluster status:" + frontPage.getClusterStatusbyName(clustername));


        Integer timeoutSeconds = 1200;
        long starttime = System.currentTimeMillis();
        while (true) {
            if (frontPage.getClusterStatusbyName(clustername).equals("Active"))
                break;

            if (System.currentTimeMillis() - starttime > timeoutSeconds * 1000)
                throw new RuntimeException("Cluster still not created");

        }


        System.out.println();
        System.out.println();
    }


}
