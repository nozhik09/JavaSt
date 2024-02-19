package lesson_25;

public class Wrappers {
    /*
    Byte - обертка для премитива byte
    Shorrt - обертка для премитива Shorrt
    Integer - обертка для премитива Int
    Long - long
    Double - double
    Character - char
    Boolean - boolean

     */

    public static void main(String[] args) {

        Integer integer;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("max " + maxValue);
        System.out.println("min " + Integer.MIN_VALUE);

        integer = null;
        // Автоматическое приведение типов
        // авто-упаковка и авто- распаковка
        Integer integer1 = 5; // Автоупаковка примитива int в ссылочный тип Integer
        System.out.println(integer1);

        int primitiveInt = integer1;// авто распаковка из Integer преобразовано в примитив Int
        System.out.println(integer1);


        // сравнение обьектов  == сравнение по ссылке
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);


        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);

        System.out.println(c.equals(d));


        // Схожие методы для всех оберточных типов
        // ValueOf() преобразует явным образом примитив или строку в соответствкющую обертку

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("valueOf " + (e == f));


        Integer intStr = Integer.valueOf("123");
        System.out.println(intStr + 100);
        // ParseXXX() преобразует строку в соответствующий примитив
        System.out.println(Integer.parseInt("645") + 100);
        System.out.println(Double.parseDouble("144.313")  + 200.32);


        // toString
        System.out.println(intStr.toString() + ",Hello ");



        //comparreTo() - сравнивает текущий объект с другим объектом

        System.out.println(e.compareTo(f)); // 127vs127-> 0
        System.out.println(e.compareTo(d));// 127vs128-> -1
        // xxxValue() - возвращает обьект как примитив
        Double d1  = Double.valueOf(15.65); // запаковка
        double dPrimitive = d1.doubleValue(); // расспаковка



        //==========================================
        // все ЧИСЛОВЫЕ обертки над примитивами наследуются ои абстрактного класса Number
        Number number = Integer.valueOf(155);
        /*

       Таким образом, вы можете создать объект, например, Integer, и затем извлечь его значение
       в любом другом примитивном числовом формате с помощью соответствующего метода.

           byteValue()
           shortValue()
           intValue()
           longValue()
           floatValue()
           doubleValue()
         */
        Integer integer2 = 525;
        System.out.println(integer2.shortValue());
        System.out.println(integer2.doubleValue());


    }

}
