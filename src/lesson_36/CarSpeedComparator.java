package lesson_36;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {


    @Override
    public int compare(Car car1, Car car2) {

        return car1.getMaxSpeed() - car2.getMaxSpeed();
    }
    /*
    Car1<car2 отрицательное
    Car1>car2 положительное
    Car1>car2 ->0
     */
}
