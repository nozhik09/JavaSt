package lesson_30.ennnum;

public enum Day {



    MONDAY("Понедельник" , 1 ) ,
    THUESDAY("Вторник" , 2 ) ,
    WEDNESDAY("среда" , 3 ) ,
    THURSADAY("Четверг" , 4 ),
    FRIDAY("Пятница" , 5 ) ,
    SATURDAY("Суббота" , 6 ),
    SUNDAY("Воскресенье" , 7 );


    private String russian;
    private int DayOfWeek;



    Day(String russian, int dayOfWeek) {
        this.russian = russian;
        DayOfWeek = dayOfWeek;
    }



    public String getRussian() {
        return russian;
    }

    public int getDayOfWeek() {
        return DayOfWeek;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public void setDayOfWeek(int dayOfWeek) {
        DayOfWeek = dayOfWeek;
    }
}
