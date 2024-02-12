package lesson_20;

public class Bus extends Vehicle {

   private int capacity;
    int countPassengers;



    public Bus(String model, int yearManufactured, int capacity) {
        super(model, yearManufactured); //вызов конструктора родителя
        System.out.println("Bus ===============");
        this.capacity = capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassenger(){
      // Проверить. есть ли место в автобусе
      if (countPassengers<capacity){
          countPassengers++;
          System.out.println("new passenger add in the " + this.getModel());
          return true;
      }
        System.out.println("The Bus is full ");
      return false;
    }
public void getOutPassenger(){
        if (countPassengers>0) {

            countPassengers--;
            System.out.println("Passenger got off the bas");
        }
        else System.out.println("no more passenger");
}


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        //TODO надо проверять что бы кол во мест не стало меньшще чем пассажиров
    }
}
