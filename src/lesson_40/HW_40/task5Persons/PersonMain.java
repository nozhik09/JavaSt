package lesson_40.HW_40.task5Persons;

import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        filterPersons();


    }

    /*
        Используйте Stream API для фильтрации людей, которые старше определенного возраста
         и проживают в определенном городе, а затем соберите их в список.
         */
    private static void filterPersons(){
        List<Persons> persons  = getListPerson();

        List<Persons> filterPerson = persons.stream()
                .filter(person -> person.getAge()>21 && person.getCity().equals("Koln") )
                .collect(Collectors.toList());
        System.out.println(filterPerson);
    }



    private static List<Persons> getListPerson() {


        return List.of(
                new Persons("Vlad", 28, "Koln"),
                new Persons("Oleg", 27, "Bonn"),
                new Persons("Andrey", 21, "Berlin"),
                new Persons("Vika", 18, "Koln"),
                new Persons("Olga", 29, "Koln"),
                new Persons("Nastya", 22, "Bonn")
        );


    }


}
