package lesson_20.homeWork_20;

public class ElectronicDevice {


    private String model;

    private int BatteryPower;

    private int precent;


    public ElectronicDevice(String name, int batteryPower, int precent) {
        this.model = name;
       this.BatteryPower = batteryPower;
        this.precent = precent;
    }

    public int getPrecent() {
        return precent;
    }

    public String getName() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    public int getBatteryPower() {
        return BatteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        BatteryPower = batteryPower;
    }

    public void setPrecent(int precent) {
        this.precent = precent;
    }

    public void turnOn() {

        if (precent > 0) {
            System.out.println("Устройство " + model + "Включается");
        }
    }





    public void turnOff() {
        System.out.println("Устройство " + model + "Выключается");

    }


    public String toStingg() {
        return "Устройство " + model + " Емкость Аккамулятора " + BatteryPower;

    }

    public void discharge(){
        precent-=10;

    }

}
