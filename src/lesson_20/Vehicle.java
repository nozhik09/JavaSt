package lesson_20;

public class Vehicle {
   private String model ;
    private final int yearManufactured;

    public Vehicle(String model, int yearManufactured) {
        System.out.println("Vehicle Start ===");
        this.model = model;
        this.yearManufactured = yearManufactured;
    }

    public void go(){
        System.out.println("vehicle " + model + "начинает движение");
    }

    public void stop(){
        System.out.println("vahicle " + model+" stop ");
    }



    public String toString(){

        return "Vahicle" + model + "year: " + yearManufactured;

    }







    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }






}
