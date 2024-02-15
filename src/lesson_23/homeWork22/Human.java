package lesson_23.homeWork22;

import java.util.Objects;

public class Human {

    private int runSpeed;

    private int restTime;

    private String typeRunner = "Human";

    public Human()
    {
        this.runSpeed = 10;
        this.restTime = 15;

    }
    public Human(int runSpeed ,int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println( typeRunner + " runs to speed " + runSpeed);
        rest();
    }

    public void rest() {

        System.out.println(typeRunner + "y need " + restTime + "min rest time");

    }


    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return runSpeed == human.runSpeed && restTime == human.restTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(runSpeed, restTime);
    }
}
