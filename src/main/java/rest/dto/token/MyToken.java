package rest.dto.token;

public class MyToken {
    public String client_id = "123";
    public String client_secret = "test";
    public String grant_type = "dasd";
    public String username = "qwe";
    public String password = "455";
    public String device_id = "device_id";
    public String client_app_version= "2";


    public MyToken () {

    }

    public MyToken(String client_id, String client_secret, String grant_type, String username, String password, String device_id, String client_app_version){

        this.client_id = client_id;
        this.client_secret = client_secret;
        this.grant_type = grant_type;
        this.username = username;
        this.password = password;
        this.device_id = device_id;
        this.client_app_version = client_app_version;
    }
}


