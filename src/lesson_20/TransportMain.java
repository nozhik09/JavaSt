package lesson_20;

public class TransportMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(" Telega ", 1910);
        System.out.println(vehicle.toString());
        vehicle.go();
        vehicle.stop();
        Bus bus = new Bus(" Man ", 2020, 35);
        System.out.println(bus.toString());
        bus.go();
        bus.stop();
        System.out.println(bus.getCapacity());

        System.out.println("======================================");

        bus.getOutPassenger();
        bus.takePassenger();
        bus.takePassenger();
        bus.takePassenger();
        bus.takePassenger();
        System.out.println(bus.getCountPassengers());

        System.out.println("==================");
        Train train = new Train(" Exspres 1 ", 2024, 3);
        System.out.println(train.toString());
        train.go();
        train.stop();
        System.out.println(train.getWagonCounter());

        System.out.println("========================");

        SpecicalBus specicalBus = new SpecicalBus(" Ikarus ",
                1978, 30, 3);
        System.out.println(specicalBus.toString());

        specicalBus.go();
        specicalBus.stop();
        specicalBus.takePassenger();
        specicalBus.getOutPassenger();


    }


}
