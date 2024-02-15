package lesson_22.homeWork_22;

public class Human {
    private String name;
    private int speedRun = 10;

    private int timeRelax = 15;

    public Human(String name) {
        this.name = name;

    }

    public void run(){
        System.out.println(" participant " + name + "Runs at speed " + speedRun + "km/h" );
        relaxTime(timeRelax);

    }


    public int getSpeedRun() {
        return speedRun;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public int getTimeRelax() {
        return timeRelax;
    }

    public void setTimeRelax(int timeRelax) {
        this.timeRelax = timeRelax;
    }

    public void relaxTime(int timeRelax){
    System.out.println(name+ " relax " + timeRelax + "min");



}


}
