package lesson_23.homeWork22_2;

public class Engine {

    private final long id;

    private static long idCounter;

    private int power;

    private boolean isActive;


    private final String typePower;

    public Engine(int power, String typePower) {
        this.power = power;
        this.typePower = typePower;
        this.id=idCounter;
    }


    public void start(){
        if (!isActive){
            isActive=true;
            System.out.println("Двигатель " + id+ "Запущен ");
        } else {
            System.out.println("Двигатель ужде работает");
        }

    }



    public void stop(){
        isActive=false;
        System.out.printf("Двигатель id: %n остановлен \n" , id);


    }

    public long getId() {
        return id;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Engine.idCounter = idCounter;
    }

    public String getTypePower() {
        return typePower;
    }
}
