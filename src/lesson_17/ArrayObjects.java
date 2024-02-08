package lesson_17;

public class ArrayObjects {
    public static void main(String[] args) {
        Person person = new Person("Garry ", 31, "Photo ");
        System.out.println(person.toString());
        System.out.println(person.name);
        person.name = "harold ";
        person.age = 15;
        System.out.println(person.toString());


        Person person1 = new Person("John ", 75, "Musik");
        System.out.println(person1.toString());
        System.out.println("=================");

        Person[] people = new Person[5];
        System.out.println(people[0] = person1);
        System.out.println(people[1] = person);
        people[1].name = "Oskold ";
        System.out.println(people[1]);
        System.out.println(person.toString());
        people[4] = new Person("Tom ", 5, " crying ");

        for (int i = 0; i < people.length; i++) {

            if (people[i] != null) {
                System.out.println(people[i].name);
                System.out.println(people[i].hobby);
            } else {
                System.out.println("создаю нового персона ");
                people[i] = new Person("Name" + i, 18 + i, " Java");
                System.out.println(people[i].toString());
            }

        }


        Person testt = new Person(" test ", 58, "test");
        people[3] = testt;
        testt = null;
        System.out.println(people[3].hobby );


    }
}
