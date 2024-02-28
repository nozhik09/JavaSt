package consult1.concult_11.entity;

public class Reader {



    private Integer readerId;
    private String readerName;


    public Reader(Integer readerId, String readerName) {
        this.readerId = readerId;
        this.readerName = readerName;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", readerName='" + readerName + '\'' +
                '}';
    }
}
