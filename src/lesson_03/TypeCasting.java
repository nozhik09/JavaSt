package lesson_03;

public class TypeCasting {


    public static void main(String[] args) {
        // преобразование с одного вида в другой
        // не явное преобразование. происходит автоматом когда меньший в больший


        byte bytev = 123;
        int intv = bytev;
        System.out.println(intv);

        double doubleV;
        doubleV=intv;
        System.out.println(doubleV);

        // явное преобразование необходимо когда мы больший преобразуем в меньший

        doubleV =125.65;
        intv=(int) doubleV; //яывное преобразование

        System.out.println(intv);
        System.out.println("=========================");
        int x=20;
        int y=7;
        double result;
        result= (double) x / y;
        System.out.println(result);








    }
}
