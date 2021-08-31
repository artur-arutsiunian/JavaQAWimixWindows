package rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import rest.dto.task.CreateTask;
import rest.dto.task.MyTask;
import rest.dto.token.MyToken;
import rest.dto.token.Token1;

import java.io.File;
import java.io.InputStream;

public class TetsSerialization {

    private final static ObjectMapper mapper = new ObjectMapper();

    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

//        //TODO - сериализация из  pojo класса(объекта) MyToken в файл(это боди реквеста)
//        mapper.writeValue(new File("src/main/resources/token.json"), new MyToken(
//                "UdT5Nmlm9x42vq3CvQ4H7S7VOcQVJzCVIKeeIDer",
//                "Ncptw156EextrVGNxuTslUSM1etS2JBoPYbRn1W2GGj87eJ96aXQJ85HZziIhOtTTUsMgaDeRTNo1rmydglfJMYo8tp4Cxz4WHm7stKyIucVW3gMLdwWg5XHKqo3Uszb",
//                "password",
//                "root8@zegoal.com",
//                "aequ8ahdaixe9uuseiPe",
//                "990000862471854",
//                "2.10"));

        //TODO - сериализация из  pojo класса(объекта) MyTask в файл(это боди реквеста)
        mapper.writeValue(new File("src/main/resources/create_task.json"), new MyTask(
                24,
                118,
                1,
                "qwe",
                "2021-08-30",
                "12:01",
                "2021-08-31T14:30",
                "0ba3cc02-f3e1-4244-ba1d-a8251fa6e2f6"));


//        //TODO - сериализация из  pojo класса(объекта) Result в файл(это респонс)
//        mapper.writeValue(new File("src/main/resources/results.json"), new Result(
//                660,
//                "CLienent 2asdssxfgjfk1",
//                "",
//                24,
//                true,
//                "13"));

//        //TODO - десериализация из файла в объект
//        MyToken MyToken = mapper.readValue(new File("src/main/resources/token.json"), MyToken.class);
//        System.out.println(MyToken.client_id);
//        System.out.println(MyToken.client_secret);
//        System.out.println(MyToken.grant_type);
//        System.out.println(MyToken.username);
//        System.out.println(MyToken.password);
//        System.out.println(MyToken.device_id);
//        System.out.println(MyToken.client_app_version);
//
//    }
//
//    @SneakyThrows
//    public Token1 getMyToken() {
//        InputStream bodyStream = Token1.class.getResourceAsStream("token.json");
//        return mapper.readValue(bodyStream, Token1.class);
    }
}