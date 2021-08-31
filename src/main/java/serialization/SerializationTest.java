package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

public class SerializationTest {

    @SneakyThrows
    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();

//        //TODO - сериализация данных файла в java объект
//        mapper.writeValue(new File("src/main/java/serialization/user.json"), new MyClass("John", "LA", 26));

        //TODO - десериализация из файла
        MyClass myClass = mapper.readValue(new File("src/main/java/serialization/user.json"), MyClass.class);
        System.out.println(myClass.age);//55

//        //TODO - десереализация из строки
//        String json  = "{\"name\":\"John\",\"address\":\"LA\",\"age\":\"60\"}";
//        MyClass myClass2 = mapper.readValue(json, MyClass.class);
//        System.out.println(myClass2.age);//60
    }

}
