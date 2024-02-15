package lesson_23.homeWork22;

public class RunnersMain {
    public static void main(String[] args) {

        Human human= new Human();
        human.run();

        ProfRunner profRunner = new ProfRunner();
        profRunner.run();

        Human human1 = new Human(10 , 15);

        System.out.println(human);
        System.out.println(human1);

        System.out.println("Сравнивает ссылки " + (human==human1));//сравнивает ссылки
        System.out.println("Сравнивает значения " + (human.equals(human1)));



    }
}
