package framework.properties;


/**
 * @author Andrey Zhelezny
 *         Date: 6/16/15
 */
public class Settings {

    private static Settings settings = new Settings();

    public pish getCloudParameters() {
        return cloudParameters;
    }

    private pish cloudParameters;

    private pish fillCloudParameters() {
        pish clusterParameters;
        clusterParameters = new pish(
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
