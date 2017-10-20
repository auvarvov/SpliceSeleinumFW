package framework.properties;


/**
 * @author Andrey Zhelezny
 *         Date: 6/16/15
 */
public class Settings {

    private static Settings settings = new Settings();

    public CloudParameters getCloudParameters() {
        return cloudParameters;
    }

    private CloudParameters cloudParameters;

    private CloudParameters fillCloudParameters() {
        CloudParameters clusterParameters;
        clusterParameters = new CloudParameters(
                System.getProperty("username"),
                System.getProperty("password"), System.getProperty("clustername")
        );

        return clusterParameters;
    }


    private Settings() {
        cloudParameters = fillCloudParameters();
        System.out.println();

    }

    public static Settings get() {
        return settings;
    }


}
