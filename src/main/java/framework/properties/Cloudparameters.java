package framework.properties;

/**
 * Created by auvarov on 10/19/17.
 */
public class CloudParameters {


    private String username;
    private String password;
    private String clustername;

    public CloudParameters(String username, String password, String clustername) {
        this.username = username;
        this.password = password;
        this.clustername = clustername;
    }

    public String getClustername() {
        return clustername;
    }

    public String getPassword() {
        return password;
    }


    public String getUsername() {
        return this.username;
    }


}
