package lesson_18;

public class Car {

    private static int countCar;
    private String model;
    private int powerPS;

    public Car(String model, int poserPS) {
        this.model = model;
        this.powerPS = poserPS;
        countCar++;
    }

    public void info (){
        System.out.println("Car " + this.model + "power " + powerPS);

    }





    public static void main(String[] args) {
        Car car =new Car("BMW ",300);
        Car car1 = new Car("VW " , 200);
        Car car2 =new Car("Ford " , 250);
        car.info();
        car1.info();
        car2.info();
        System.out.println("Создана всего авто " + Car.countCar);

    }
public static int getCountCar(){

        return countCar;
}



}

