package lesson_24;

public class Book implements PrintTable{
   private String title;
   private String author;





    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void sayHello(String string) {
        System.out.println("Override method sayHello" + string);
    }

    @Override
    public void print() {
        System.out.println("Book " + title + ".(Автор Книги " + author);
    }

    public void nookSayHello(){
        System.out.println("Hello" + title);

    }


}
