package lesson_20;

public class SpecicalBus extends Bus {

    private int bicyclePlace;
    private int bicycleCount;

    public SpecicalBus(String model, int yearManufactured, int capacity, int bicyclePlace) {
        super(model, yearManufactured, capacity);
        this.bicyclePlace = bicyclePlace;
    }
    public void takePassengerWithBicycle(){
        // есть ли место для
        //1. пассажира
        //2. велосипеда


    }

    public int getBicyclePlace() {
        return bicyclePlace;
    }

    public int getBicycleCount() {
        return bicycleCount;
    }
public int example(){
        return super.getCapacity();
}
}
