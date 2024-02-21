package lesson_27;

public class MultiGenericBox <T,V> {


    private T Field1;
    private V Field2;


    public MultiGenericBox(T field1, V field2) {
        Field1 = field1;
        Field2 = field2;
    }


    @Override
    public String toString() {
        return "MultiGenericBox{" +
                "Field1=" + Field1 +
                ", Field2=" + Field2 +
                '}';
    }

    public T getField1() {
        return Field1;
    }

    public void setField1(T field1) {
        Field1 = field1;
    }

    public V getField2() {
        return Field2;
    }

    public void setField2(V field2) {
        Field2 = field2;
    }

    public static void main(String[] args) {
        MultiGenericBox<String,Integer> multiGenericBox = new MultiGenericBox<>("Test" , 100);
        System.out.println(multiGenericBox);
    }


}
