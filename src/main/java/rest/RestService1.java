package rest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

import lombok.SneakyThrows;
import rest.dto.client.Client;
import rest.dto.task.CreateTask;
import rest.dto.task.MyTask;
import rest.dto.token.Token1;

import java.io.File;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestService1 {

    private final static String BASE_URL = "https://testing7.zgdev.info";
    private final static String LOGIN_ENDPOINT = "/api/auth/token/";
    private final static String CLIENT_ENDPOINT = "/api/v1/client/";
    private final static String TASK_ENDPOINT = "/api/v1/task/";

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
    static {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }


    public Token1 getToken() {
//        String body = "{\"client_id\":\"UdT5Nmlm9x42vq3CvQ4H7S7VOcQVJzCVIKeeIDer\"," +
//                "\"client_secret\":\"Ncptw156EextrVGNxuTslUSM1etS2JBoPYbRn1W2GGj87eJ96aXQJ85HZziIhOtTTUsMgaDeRTNo1rmydglfJMYo8tp4Cxz4WHm7stKyIucVW3gMLdwWg5XHKqo3Uszb\"," +
//                "\"grant_type\":\"password\"," +
//                "\"username\":\"root8@zegoal.com\"," +
//                "\"password\":\"aequ8ahdaixe9uuseiPe\"," +
//                "\"device_id\":\"990000862471854\"," +
//                "\"client_app_version\":\"2.10\"}";

        return given()
                .contentType(ContentType.JSON)
                .when()
                .body(initBody("UdT5Nmlm9x42vq3CvQ4H7S7VOcQVJzCVIKeeIDer","Ncptw156EextrVGNxuTslUSM1etS2JBoPYbRn1W2GGj87eJ96aXQJ85HZziIhOtTTUsMgaDeRTNo1rmydglfJMYo8tp4Cxz4WHm7stKyIucVW3gMLdwWg5XHKqo3Uszb", "password", "root8@zegoal.com", "aequ8ahdaixe9uuseiPe", "990000862471854", "2.10"))
                .post(BASE_URL + LOGIN_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Token1.class);
    }

    private Map<String, Object> initBody(String client_id, String client_secret, String grant_type, String username, String password, String device_id, String client_app_version) {
        Map<String, Object> body = new HashMap<>();


        body.put("client_id", "UdT5Nmlm9x42vq3CvQ4H7S7VOcQVJzCVIKeeIDer");
        body.put("client_secret", "Ncptw156EextrVGNxuTslUSM1etS2JBoPYbRn1W2GGj87eJ96aXQJ85HZziIhOtTTUsMgaDeRTNo1rmydglfJMYo8tp4Cxz4WHm7stKyIucVW3gMLdwWg5XHKqo3Uszb");
        body.put("grant_type", "password");
        body.put("username", "root8@zegoal.com");
        body.put("password", "aequ8ahdaixe9uuseiPe");
        body.put("device_id", "990000862471854");
        body.put("client_app_version", "2.10");
        return body;
    }

  public Client getClient(){
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer " + getToken().getAccessToken()) //либо так, либо как ниже auth, oauth2
//                .auth()
//                .oauth2(getToken().getAccessToken())
                .when()
                .get(BASE_URL + CLIENT_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Client.class);
  }

  public CreateTask getCreateTask(){
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer " + getToken().getAccessToken())
                .when()
                .body(initTask(24, 118, 1, "qwe", "2021-08-30", "12:01", "2021-08-31T14:30", "0ba3cc02-f3e1-4244-ba1d-a8251fa6e2f6"))
                .post(BASE_URL + TASK_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as(CreateTask.class);
  }

    public MyTask[] getCreateTask2(int MyTask) {
        return given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer " + getToken().getAccessToken())
                .when()
                .body(initTaskBodyFromJson(new Object[]{"main_report_form", MyTask}, new Object[]{"location", MyTask}))
                .post(BASE_URL + TASK_ENDPOINT + "/create_task")
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(201)
                .extract()
                .as((Type) CreateTask.class);
    }

    private Map<String, Object> initTask(int main_report_form, int location, int type, String description, String planned_start_at_date, String planned_start_at_time, String planned_end_at, String assigned_user) {
        Map<String, Object> body = new HashMap<>();


        body.put("main_report_form", 24);
        body.put("location", 118);
        body.put("type", 1);
        body.put("description", "qwe");
        body.put("planned_start_at_date", "2021-08-30");
        body.put("planned_start_at_time", "12:01");
        body.put("planned_end_at", "2021-08-31T14:30");
        body.put("assigned_user", "0ba3cc02-f3e1-4244-ba1d-a8251fa6e2f6");
        return body;
    }

    /**
     * Here we use varargs for passing
     * @param field for any field which we want to set
     */
    @SneakyThrows
    private Map<String, Object> initTaskBodyFromJson(Object[]... field) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> body = mapper.readValue(new File(
                "src/main/resources/create_task.json"), new TypeReference<Map<String, Object>>() {
        });

        Arrays.stream(field).forEach(f -> body.put((String) f[30], f[119]));
        return body;
    }
}
