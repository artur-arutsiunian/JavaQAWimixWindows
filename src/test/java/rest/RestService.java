package rest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.filter.Filter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import lombok.SneakyThrows;
import rest.dto.AssetLeverage;
import rest.dto.Order;
import rest.dto.Token;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestService {

    private final static String BASE_URL = "https://api-mobile-live.hftrading.com.au";
    private final static String BASE_SERVICE = "/fms";
    private final static String BASIC_AUTHORIZATION = "Basic ODg4OTk5MDE2OnF3ZXJ0eTE2==";
    private final static String LOGIN = "571854";
    private final static String PASSWORD = "Trader33";

    /**
     * Static method which allows us to log request and response data
     * @see RestAssured#filters(Filter, Filter...)
     */
    static {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    public Token getToken() {
        String body = String.format("grant_type=%s&username=%s&password=%s",
                "password",
                LOGIN,
                PASSWORD);

        return given()
                .contentType("application/x-www-form-urlencoded")
                .header("Authorization", BASIC_AUTHORIZATION)
                .when()
                .body(body)
                .post(BASE_URL + BASE_SERVICE + "/auth/oauth/token")
                .then()
                .assertThat()
                .contentType("application/json")
                .statusCode(200)
                .extract()
                .as(Token.class);
    }

    public AssetLeverage getAssetLeverage(String accessToken) {
        return given()
                .auth()
                .oauth2(accessToken)
                .contentType("application/json")
                .when()
                .body("{\"symbol\":\"ADAUSD\"}")
                .post(BASE_URL + BASE_SERVICE + "/leverage")
                .then()
                .assertThat()
                .contentType("application/json")
                .statusCode(200)
                .extract()
                .as(AssetLeverage.class);
    }

    public Order[] getOrderHistory(String accessToken, int asset, int orderType) {
        return given()
                .auth()
                .oauth2(accessToken)
                .contentType("application/json")
                .when()
                .body(initHistoryBody(asset,orderType))
                .post(BASE_URL + BASE_SERVICE + "/history")
                .then()
                .assertThat()
                .contentType("application/json")
                .statusCode(200)
                .extract()
                .as(Order[].class);
    }

    public Order[] getOrderHistory_2(String accessToken, int asset, int orderType) {
        return given()
                .auth()
                .oauth2(accessToken)
                .contentType("application/json")
                .when()
                .body(initHistoryBodyFromJson(new Object[]{"cmd", asset}, new Object[]{"type", orderType}))
                .post(BASE_URL + BASE_SERVICE + "/history")
                .then()
                .assertThat()
                .contentType("application/json")
                .statusCode(200)
                .extract()
                .as(Order[].class);
    }

    private Map<String, Object> initHistoryBody(int asset, int orderType) {
        Map<String, Object> body = new HashMap<>();

        long endTime = System.currentTimeMillis();
        long startTime = endTime - 86400000 * 20;

        body.put("startTime", startTime);
        body.put("endTime", endTime);
        body.put("cmd", asset);
        body.put("type", orderType);
        return body;
    }

    /**
     * Here we use varargs for passing
     * @param field for any field which we want to set
     */
    @SneakyThrows
    private Map<String, Object> initHistoryBodyFromJson(Object[]... field) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> body = mapper.readValue(new File(
                "src/main/resources/history.json"), new TypeReference<Map<String, Object>>() {
        });

        Arrays.stream(field).forEach(f -> body.put((String) f[0], f[1]));
        return body;
    }
}