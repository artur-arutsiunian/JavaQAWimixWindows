package array;

import java.util.ArrayList;

class Season {

    private String name;
    public Season(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

//    int[] myArray = new int[10]; // объявление массива и создание, то есть, выделение памяти для массива на 10 элементов типа int
//        System.out.println(myArray.length);

//    String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
//        for (int i = 0; i < 4; i++) {
//            System.out.println(seasons[i]);

        ArrayList<Season> seasons = new ArrayList<>();
        Season winter = new Season("зима");
        Season spring = new Season("весна");
        Season summer = new Season("лето");
        Season autumn = new Season("осень");

        seasons.add(winter);
        seasons.add(spring);
        seasons.add(summer);
        seasons.add(autumn);

        Season secondSeason = seasons.get(1);
        System.out.println(secondSeason);

        int springIndex = seasons.indexOf(spring);
        System.out.println(springIndex);
    }
}

