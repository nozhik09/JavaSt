package consult1.consult_11Tesst.repository;


import consult1.consult_11Tesst.entity.Reader;
import consult1.consult_11Tesst.util.MyList;

public class ReaderRepository {
    private final MyList<Reader> readers;

    public ReaderRepository(MyList<Reader> readers) {
        this.readers = readers;
    }

    public void add(Reader newReader){
        readers.add(newReader);
    }

    public Reader findById(Integer readerId){

        //------
        for (int i = 0; i < readers.size(); i++) {

            Reader currentReader = readers.get(i);

            if (currentReader.getReaderId().equals(readerId)) {
                return currentReader;
            }
        }
        //------
        return null;
    }

    public MyList<Reader> findAll(){
        return readers;
    }
}
