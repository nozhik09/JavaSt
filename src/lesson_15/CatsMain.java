package lesson_15;

public class CatsMain {
    public static void main(String[] args) {
        Cat cat = new Cat();//создаем обьект класса Сat
        // Car() вызов конструктолр класса

        cat.sayMeow();
        cat.sleep();

        String catNumberVat = cat.name;
        System.out.println("name cat " + catNumberVat);
        System.out.println("Age cat " + cat.age);
        System.out.println("Cat color  " + cat.color);
        System.out.println("==================");

        // создаем ещзе один обьект класса кет
        Cat cat2 = new Cat("Max");

        cat2.sayMeow();
        cat2.sleep();
        System.out.println("name cat is " + cat2.name);

        System.out.println("======================");
        cat.whoAmI();
        cat2.whoAmI();



    }


}
