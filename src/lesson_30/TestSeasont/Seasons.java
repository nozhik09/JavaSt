package lesson_30.TestSeasont;

public enum Seasons {


    WINTER(-1,-2 , -6),
    SUMMER(25,26,30),
    SPRING(20,20,20),
    AUTUMN(12,8,10);

    private double firstMonthOFSeason;
    private double secondMonthOFSeason;
    private double thirdMonthOFSeason;

    private double averageTemp;


    Seasons(double firstMonthOFSeason, double secondMonthOFSeason, double thirdMonthOFSeason) {
        this.firstMonthOFSeason = firstMonthOFSeason;
        this.secondMonthOFSeason = secondMonthOFSeason;
        this.thirdMonthOFSeason = thirdMonthOFSeason;
    }
    public double getAverageTemp(){

        averageTemp = (firstMonthOFSeason+secondMonthOFSeason+thirdMonthOFSeason)/3;

        return averageTemp;

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

    public void setAverageTemp(double averageTemp) {
        this.averageTemp = averageTemp;
    }
}
