package lesson_21;

public class StringBuilderExemple {
    public static void main(String[] args) {
        //StringBuilder - класс для работы с последовательностью символов
        // в отличие от String обьекты можно изменять после их создания.
        // Это делает его особенно удобным в ситуациях когда
        // нам требуется много операций по изменению строки( добавление или конкатенации вставка вырезание и тд)
        // существенно снижает нагрузку на память и повышает производительность
        StringBuilder sb = new StringBuilder();
        // append - добавляет строковое представление любого типа данных(строка число символ)
        sb.append("hello").append(" , ").append("world");
        String result = sb.toString();
        System.out.println(result);
        // toString- возвращающий строку

        // insert - вставляет строку в указаною позицию SB
        sb.insert(3, "Java");
        System.out.println(sb.toString());

        //delete, deleteCharAt - удаление диапазона - удаление 1 символа по индексу
        sb.delete(3, 6);
        System.out.println(sb.toString());
        sb.deleteCharAt(3);
        System.out.println(sb.toString());

        //revers(gthtdjhfxbdftmn содержимое обьекта делает строку зеркальной
        sb.reverse();
        System.out.println(sb.toString());

        // lenght возвращает текущее кол во символов в объекте
        System.out.println(sb.length());

        sb.reverse();
        // setlenght устанавливает новую длину последовательности
        sb.setLength(11);
        System.out.println(sb.toString());


        //брать близнец, но работает медленнее так как потокобезопасен
        StringBuffer stringBuffer= new StringBuffer();




    }


}
