package lesson_22;

public class Casting {
    //Восходящее и нисходящее преобразование


    public static void main(String[] args) {

        Animal animal = new Hamster(); //здесь тип Hamster преобразуется к типу Animal
        Animal animal1 = new Dog();// Восходящее преобразование происходит нен явно
        Animal animal2 = new Cat();

        Animal[] animals = new Animal[3];

        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;


        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat){
                System.out.println(animals[i] + " can be DownCasting");

                Cat catCasting =(Cat)animals[i] ;
                catCasting.eat();
            }
            else System.out.println(animals[i] + " not can be DownCasting");

            System.out.println(animals[i]);
            animals[i].voice();

        }

        System.out.println("\n =========== DownCasting========");
        Cat cat1 = (Cat) animal2;
        cat1.eat();
        cat1.voice();

    }


    public static void sayHello(Animal animal) {

        animal.voice();


    }
}
