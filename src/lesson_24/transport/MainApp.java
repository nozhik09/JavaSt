package lesson_24.transport;

import lesson_24.Book;

public class MainApp {

    public static void main(String[] args) {
        Duck duck = new Duck("Black");
        Airplane airplane = new Airplane(130);
        Ship ship = new Ship(50);

        FlyAble[] flyers = new FlyAble[2];
        flyers[0] = airplane;
        flyers[1] = duck;

        for (FlyAble flyer : flyers) {
            flyer.fly();

            if (flyer instanceof Airplane) {
                Airplane airplaneCurrent = (Airplane) flyer;
                System.out.println("Вместимость самолета " + airplaneCurrent.getCapacity());
                airplaneCurrent.takePassenger();

            }

        }
        SwimmAble[] swimmers = new SwimmAble[3];
        swimmers[0]=ship;
        swimmers[1]=duck;
        swimmers[2]= new Duck("Yellow");


        for (SwimmAble swimmer: swimmers ){
            swimmer.swim();


            if (swimmer instanceof Duck){
                Duck duck1 = (Duck) swimmer;
                System.out.println("Я утка с цветом " + duck1.getColor());
            }

        }


    }
}
