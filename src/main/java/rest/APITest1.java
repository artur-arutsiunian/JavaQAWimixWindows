package rest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class APITest1 extends TestRunner1 {

    private static final RestService1 REST_SERVICE = new RestService1();
    private static String token;

    @BeforeAll
    static void setUp() {
        token = REST_SERVICE.getToken().getAccessToken();
    }

    @Test
    public void checkReceiveToken() {
        assertEquals(REST_SERVICE.getToken().getScope(), "read write groups",
                "Token is incorrect");
    }

    @Test
    public void checkGetClient(){
        assertEquals(REST_SERVICE.getClient().getCount(), 655,
        "Client is incorrect");
    }

    @Test
    public void checkCreateTask(){
        assertEquals(REST_SERVICE.getCreateTask().getAssignedUser(), "0ba3cc02-f3e1-4244-ba1d-a8251fa6e2f6",
                "Task is inccorect");
    }

    @Test
    public void checkCreateTask2(){
        assertEquals(REST_SERVICE.getCreateTask2().getClass(), "0ba3cc02-f3e1-4244-ba1d-a8251fa6e2f6",
                "Task is inccorect");
    }
}