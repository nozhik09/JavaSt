package lesson_30.HM_30;

public class TempSeasons {

    private Seasons seasons;

    private double firstMonthOFSeason;
    private double secondMonthOFSeason;
    private double thirdMonthOFSeason;

    private double averageTemp;


    public TempSeasons(Seasons seasons, double firstMonthOFSeason, double secondMonthOFSeason, double thirdMonthOFSeason) {
        this.seasons = seasons;
        this.firstMonthOFSeason = firstMonthOFSeason;
        this.secondMonthOFSeason = secondMonthOFSeason;
        this.thirdMonthOFSeason = thirdMonthOFSeason;
    }

    public double getAverageTemp(){

        double aveg = (firstMonthOFSeason+secondMonthOFSeason+thirdMonthOFSeason)/3;

        switch (seasons){
            case WINTER:
                System.out.println("Average tempr Winer = " + aveg);
                return aveg;
            case AUTUMN:
                System.out.println("Average tempr AUTUMN = " + aveg);
                return aveg;
            case SPRING:
                System.out.println("Average tempr SPRING = " + aveg);
                return aveg;
            case SUMMER:
                System.out.println("Average tempr SUMMER = " + aveg);
                return aveg;
            default:
                System.out.println(" cancel");



        }

return aveg;

    }




    public double getFirstMonthOFSeason() {
        return firstMonthOFSeason;
    }

    public void setFirstMonthOFSeason(double firstMonthOFSeason) {
        this.firstMonthOFSeason = firstMonthOFSeason;
    }

    public double getSecondMonthOFSeason() {
        return secondMonthOFSeason;
    }

    public void setSecondMonthOFSeason(double secondMonthOFSeason) {
        this.secondMonthOFSeason = secondMonthOFSeason;
    }

    public double getThirdMonthOFSeason() {
        return thirdMonthOFSeason;
    }

    public void setThirdMonthOFSeason(double thirdMonthOFSeason) {
        this.thirdMonthOFSeason = thirdMonthOFSeason;
    }


    public Seasons getSeasons() {
        return seasons;
    }

    @Override
    public String toString() {
        return "TempSeasons{" +
                "seasons=" + seasons +
                ", firstMonthOFSeason=" + firstMonthOFSeason +
                ", secondMonthOFSeason=" + secondMonthOFSeason +
                ", thirdMonthOFSeason=" + thirdMonthOFSeason +
                ", averageTemp=" + averageTemp +
                '}';
    }
}







