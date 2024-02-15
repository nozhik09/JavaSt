package lesson_22;

public class Zoo {

    public static void main(String[] args) {





        Animal animal=new Animal();
        animal.voice();


        Cat cat= new Cat();
        cat.voice();


        Hamster hamster = new Hamster();
        hamster.voice();
        hamster.voice("Hrum");

        Dog dog=new Dog();
        dog.voice();


        // переопределение методов
        // Method Overriding - динамический полиморфизм - времени выполнения(RunTime)


        // Статический полиморфизм(компиляционный) - перегрузка метода
        System.out.println(animal);





    }
}
