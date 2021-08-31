package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Staff> staff = getStaff();
//        staff.forEach(System.out::println);

        // todo FILTER
        List<Staff> qa = staff.stream().filter(staff1 -> staff1.getPositions().equals(Positions.QA))
                .collect(Collectors.toList());
        qa.forEach(System.out::println);
        System.out.println();


        List<Staff> nameArtur = staff.stream().filter(staff1 -> staff1.getName().equals("Artur"))
                .collect(Collectors.toList());
//        nameArtur.forEach(System.out::println);

        //todo SORT
        List<Staff> sortByNames = staff.stream().sorted(Comparator.comparing(Staff::getName))
                .collect(Collectors.toList());
//        sortByNames.forEach(System.out::println);

        List<Staff> sortByExperienceReversed = staff.stream().sorted(Comparator.comparing(Staff::getExperience)
                .reversed()).collect(Collectors.toList());
//        sortByExperienceReversed.forEach(System.out::println);

        // TODO ALL match
        //  возвращает булеву переменную если совпадение по всему листу
//        boolean allMatch = staff.stream().allMatch(staff1 -> staff1.getExperience() > 1.5);
        // todo Any match
        //  возвращает булеву переменную если совпадение хотя бы по одному полю
//        boolean anyMatch = staff.stream().anyMatch(staff1 -> staff1.getName() == "Artur");

        // TODO: None match
//        boolean NoneMatch = staff.stream().noneMatch(staff1 -> staff1.getExperience() == 30);

//        //todo Max
//        staff.stream().max(Comparator.comparing(Staff::getExperience))
//                .ifPresent(System.out::println);
//
//        //todo Min
//        staff.stream().min(Comparator.comparing(Staff::getExperience))
//                .ifPresent(System.out::println);
    }

    private static List<Staff> getStaff(){
        return List.of(
                new Staff("Artur",2,Positions.QA),
                new Staff("Artem",2,Positions.DEVELOPER),
                new Staff("Katya",3,Positions.DESIGNER),
                new Staff("Kevin",5,Positions.BA),
                new Staff("John",4,Positions.PM)
        );
    }
}


