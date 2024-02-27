package lesson_30.HM_30;

public class SeasonsMain {
    public static void main(String[] args) {
        TempSeasons tempSeason = new TempSeasons(Seasons.SUMMER, 25, 30, 26);
        TempSeasons tempSeason1 = new TempSeasons(Seasons.WINTER, -2, -4, 0);
        TempSeasons tempSeason2 = new TempSeasons(Seasons.SPRING, 15, 20, 10);
        TempSeasons tempSeason3 = new TempSeasons(Seasons.AUTUMN, 6, 10, 5);

        Seasons[] season = Seasons.values();
        for (Seasons seasons: Seasons.values()){
            System.out.println(seasons);

        }
        tempSeason.getAverageTemp();
        tempSeason1.getAverageTemp();
        tempSeason2.getAverageTemp();
        tempSeason3.getAverageTemp();



    }
}
