package lesson_30.TestSeasont;

public class SeasonsMain {
    public static void main(String[] args) {

        Seasons[] seasons = Seasons.values();
        for (Seasons seasonsss : Seasons.values()) {
            System.out.print(seasonsss + " ");
            System.out.println(seasonsss.getAverageTemp());
        }



    }
}
