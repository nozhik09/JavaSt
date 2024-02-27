package lesson_30.TestSeason;

public class SeasonsMain {
    public static void main(String[] args) {

        Seasons[] season = Seasons.values();
        for (Seasons seasons : Seasons.values()) {
            System.out.print(seasons + " ");
            System.out.println("AverageTemp " + seasons.getAverageTemp());
        }



    }
}
