package lesson_30.ennnum;

public class DaysMain {

    public static void main(String[] args) {
        Person person = new Person("john", 31, Day.SATURDAY);

        String dayStr = person.getDayWeekOfBirth().toString();

        person.getDayWeekOfBirth().toString();
        System.out.println(person);
        //получаю массив Enum
        Day[] days = Day.values();

        for (Day day : Day.values()) {
            System.out.println(day);
        }

        System.out.println("====================");


        Day enumMonday = Day.valueOf("MONDAY");
        System.out.println(enumMonday);

//Сравнение enum


        // для сравнение двух значений enum безопасно использовать ==

        System.out.println(enumMonday == Day.MONDAY);

        switch (person.getDayWeekOfBirth()){

            case FRIDAY:
                System.out.println("gznybwf");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;
            case WEDNESDAY:
                System.out.println("Wedn");
                break;

            case SATURDAY:
                System.out.println("Sybbota ");
                break;
            default:
                System.out.println("Какой то другой день недели");


        }
        //У кажлого енам есть свой порядковый номер
        System.out.println(enumMonday.ordinal());
        System.out.println(Day.SUNDAY.ordinal());

        System.out.println(enumMonday.getRussian());
        System.out.println(enumMonday.getDayOfWeek());
        enumMonday.setRussian("Mo");
        System.out.println(enumMonday.getRussian());




    }
}
