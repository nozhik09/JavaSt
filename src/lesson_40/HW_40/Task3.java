package lesson_40.HW_40;

import java.util.function.BiConsumer;

public class Task3 {


    /*
    Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате "ключ=значение
     */
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer = (key,value)-> System.out.println(key + "=" + value);


        biConsumer.accept("Vlad" , 28);
        biConsumer.accept("Oleg" , 25);

    }
}
