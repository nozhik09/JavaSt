package lesson_16;

public class Cat {
    String name;
    int age;
    String color;
/*
конструктор это спец метод который автоматически вызывается
при создании обьекта этого класса
Основная задача конструктора - инициализировать новый обьект -
-(установить начальные значения свойств или полей)
второстипенно - мы можем выполнить какие то другие начальные настройки обьекта

1. Имя конструктора ВСЕГДА совпадает с названием класса
2.конструктор не имеет возваращемого типа. т.к
конструктор автоматически возваращает экземпляр класса(Cat)
3. конструктор вызываетсфя автоматически при создании обьекта

 */


    public Cat() {
        System.out.println("Конструктор 1 ");
    }

    public Cat(String catName) {
        System.out.println("Конструктор 2 ");
        name = catName;


    }
    public Cat(String name, String color) {
// this. используется для указания на текущий обьект

        this.name = name;
        this.color = color;
    }
    public Cat(String name, String color, int age) {
// this. используется для указания на текущий обьект

        this(name, color);
        this.age = age;

    }


    public void whoAmI() {
        System.out.println("Я котик " + name +
                ", Мой возраст: " + age
                + " color " + color);


    }


    void sleep() {
        System.out.println("I am sleep ");
    }

    void sayMeow() {
        System.out.println("Meow!!!");
    }

    void run() {

        System.out.println("Run");
    }

}
