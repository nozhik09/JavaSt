package lesson_21;

public class Autobus {
// для создания связи типа HAS-A мы определяем поле класса которое будет
    // хранить ссылку на обьект другого класса

    private BusDriver driver; // агрегация (мягкая свзяь)
    private final Autopilot autopilot;// композиция, нерарыная связь


    private int capacity;
    private final Passenger[] passengers;
    private int countPassenger;

    //Кардинальность определяет сколько обьектов одного класса
    // может быть ассоциирована с обьектом другого класса
    /*1. Один к одному- Автобус и двигатель. Каждый автобус может иметь только 1 двигатель
    и на каждый двигатель приходится только 1 автобус.
      2. Один ко многим - автобус и пассажиры. 1 автобус может перевозить много пассажиров.
      3. Многие к многим - каждый автобус может останавливаться на многих остановок
      Каждая остановка может обслуживать множество автобусов

     */


    public Autobus(BusDriver busDriver, int capacity) {
        this.driver = busDriver;
        autopilot = new Autopilot("AP-005");
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        if (countPassenger < capacity) {

            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.println("Пассажир попал в автобус");


            return true;
        }


        System.out.println(" Bus is full ");
        return false;
    }


    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder("{");

        sb.append("Auutobas: (Driver ").append(driver.getLicenseNumber())
                .append("Sof version ").append(autopilot.getSoftWareVersion()).append("}");
        sb.append(" passenger: ").append(getStringPassengersList());

        return sb.toString();


        // return "Autobus {" + " driver " + driver.getLicenseNumber()
        // + " ; autopilot " + autopilot.getSoftWareVersion() + "}";


    }

    public String getStringPassengersList() {
        // перебрать списоке пассажиров
        // приклеить у строке пассажира id + name
        // перебрать список
        // так как пассажир ссылочный тип данных приклеивать только не null в ссылке
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                Passenger current = passengers[i];
                sb.append("{ Passenger: (id:)").append(current.getId()).append(";name")
                        .append(current.getName()).append("}");
                sb.append("; ");
            }
        }
        // нам надо проверить был ли добавлен хоть 1 пассажир если был отрезать 2 последних символа
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);

        }

        sb.append("} ");
        return sb.toString();

    }


}
