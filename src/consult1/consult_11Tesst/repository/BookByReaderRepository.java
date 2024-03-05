package consult1.consult_11Tesst.repository;

import book.Book;
import entity.BookByReader;
import entity.Reader;
import util.MyList;

public class BookByReaderRepository {
    private final MyList<BookByReader> bookByReaders;

    public BookByReaderRepository(MyList<BookByReader> bookByReaders) {
        this.bookByReaders = bookByReaders;
    }


    public void add(BookByReader newRecord){
        bookByReaders.add(newRecord);
    }

    public MyList<BookByReader> getBookByReaders() {
        return bookByReaders;
    }
}
