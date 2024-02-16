package lesson_24;

public class PrintApp {

    public static void main(String[] args) {
        Book book = new Book("Java", "Eckel");

        book.print();


        PrintTable printTableBook = new Book("Twst", "someone");
        printTableBook.print();


        PrintTable presentationWB = new Presentation("Title", 24, "dsa");

        presentationWB.print();

        System.out.println("\n ============================ \n");

        ColorPrintTable presentationColor = new Presentation("Color", 12, "Color print");

        presentationColor.colorPrint();
        presentationColor.print();

        System.out.println("\n ============================== \n");

        PrintTable[] printTables = new PrintTable[2];
        printTables[0] = book;
        printTables[1] = presentationColor;

        for (PrintTable printTable : printTables) {
            printTable.print();
            printTable.sayHello("Word");
        }

        System.out.println("========================");

        PrintTable.staticMethod();

        Printer printer=new Printer();
        printer.makeCopy(book);
        printer.makeCopy(presentationWB);
        printer.makeCopy(presentationColor);





    }


}
