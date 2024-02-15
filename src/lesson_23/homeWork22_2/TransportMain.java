package lesson_23.homeWork22_2;

public class TransportMain {


    public static void main(String[] args) {
        Engine engine = new Engine(150, "Diesel");
        Engine bikeEngine = new Engine(150, "Electro");
        Vahicle[] vahicles = new Vahicle[3];


//        Vahicle vahicle = new Vahicle() ;
//           невозможно создать экземпляр абстрактного класса


        vahicles[0] = new Car(engine);
        vahicles[1] = new Bicycle();
        vahicles[2] = new Motocyrcle(bikeEngine);

//        for each -

        for (Vahicle vahicle: vahicles){
            System.out.println(vahicle);
            vahicle.startEngine();

        }



    }
}