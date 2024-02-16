package lesson_24;

public interface PrintTable {

    /* по умолчанию -> */ public static final   int power = 220;

    /*
    1. Интерфейс абстрактный и публияный по умолчанию
    2. так же как и методы прописанные в нем

     */


    void print();

    // методы по умолчанию
    default void sayHello(String string) {
        System.out.println("Hello " + string);
        privateMethod();
        staticPrivateMethod();
    }

    //JDK 8 ljcnegys cтатические методы
    static void staticMethod() {
        System.out.println("Iam static");

    }

    // JDK 9 мы мождеи определять приват методы
    private void privateMethod() {
        System.out.println("I am privat");


    }

    private static void staticPrivateMethod(){
        System.out.println("I am staticPrivate");


    }


}
