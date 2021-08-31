package collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args){

        String winter = new String("зима");
        String spring = new String("весна");
        String summer = new String("лето");
        String autumn = new String("осень");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(winter,spring,summer,autumn));
        Collections.sort(solarSystem);
        System.out.println(solarSystem);
    }
}
