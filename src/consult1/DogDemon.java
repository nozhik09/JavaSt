package consult1;

public class DogDemon {
    public static void main(String[] args) {

        int dogAge = 2;
        String dogName = "Zeus";
        String dogBreed = "Cano Corso";



        Dog myDog = new Dog();
        myDog.name = "Zeus";
        myDog.age = 2;
        myDog.imHungry = false;
        System.out.println(myDog);

        System.out.println(myDog.name);


        Dog mySecondDog = new Dog();
        mySecondDog.name = "Tatoshka";
        System.out.println(mySecondDog.name);


        myDog.bark();

        Dog mytecondDog = new Dog();
        mytecondDog.name = "Tatoshka";






    }




}
