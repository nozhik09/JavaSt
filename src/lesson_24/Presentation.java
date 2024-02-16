package lesson_24;

public class Presentation implements ColorPrintTable {

    private String title;

    private int countPages;

    private String theme;

    public Presentation(String title, int countPages, String theme) {
        this.title = title;
        this.countPages = countPages;
        this.theme = theme;
    }

    @Override
    public void colorPrint() {


        System.out.printf("презентация %s  в цевете (тема %s) . Всего страниц %d\n", title, theme, countPages);

    }

    @Override
    public void print() {

        System.out.printf("Распечатывается презентация %s (тема %s) в ч/б. Всего страниц %d\n", title, theme, countPages);


    }


}


