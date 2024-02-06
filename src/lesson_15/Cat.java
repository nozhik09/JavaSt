package lesson_15;

public class Cat {
String name;
int age;
String color;


public Cat(){
    System.out.println("Конструктор 1 ");
}
public Cat(String catName){
    System.out.println("Конструктор 2 ");
    name=catName;


}

public void whoAmI(){
    System.out.println("Я котик "+name +
            ", Мой возраст: " + age
            + " color " + color);


}


void sleep (){
    System.out.println("I am sleep ");
}
void sayMeow(){
    System.out.println("Meow!!!");
}
void run (){

    System.out.println("Run");
}

}
