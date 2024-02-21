package lesson_25HW_24;

import java.util.Arrays;

public class MyArrayList<T> implements MyList <T> {
    private T[] array;
    private int cursor; // присвоено значение по умолчанию 0
    private static final int MULTIPLAYER = 2;


    @SuppressWarnings("unchecked") // подавляем предупреждение компилятора о непроверяемом приведении типа
    public MyArrayList() {
        array = (T[]) new Object[10];
    }

    // ++ Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
    @SuppressWarnings("unchecked")
    public MyArrayList(T[] ints) {
        array = (T[]) new Object[ints.length * MULTIPLAYER];

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }

    // Добавлять в массив элемент
    @Override
    public void add(T value) {
        // Добавлять значение в наш массив

        // проверка. Есть ли место в нашем внутреннем массиве?

        if (cursor > array.length * 0.9) {
            expandArray(); // метод расширяющий наш массив
        }

        array[cursor++] = value;
    }

    //Добавлять в массив сразу несколько элементов
    @Override
    public void addAll(T...values) {
        // ints - я могу с ним обращаться точно так же как со ссылкой на массив

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }


    // Динамическое изменение размера массива
    @SuppressWarnings("unchecked")
    private void expandArray() {
//        System.out.println("Расширяем массив! ================= " + cursor);
        // 1. создать новый массив Большего размера
        // 2. Переписать значения из старого массива в новый
        // 3. Перебросить ссылку

        T[] newArray = (T[]) new Object[array.length * MULTIPLAYER]; // создаю новый массив, в 2 раза больше предыдущего

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписать значения из старого массива в новый
        }

        array = newArray; // 3. Перебросить ссылку. Переменная array теперь хранит ссылку на "новый" массив
        //System.out.println("Расширение массива завершено ==================\n");
    }

    //Вывод в консоль значений массива
    public String toString() {

        if (cursor == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            sb.append(array[i]).append((i<cursor-1)? ", " : "]");
        }
        return sb.toString();
    }



    // Текущее количество элементов в массиве
    @Override
    public int size() {
        return cursor;
    }

    //Возвращение значения по индексу
    @Override
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            return null; // хорошего решения на этой стадии нет
        }
    }


    @Override
    public void set(int index, T value) {
        //1.проверка индексов
        if (index<0 || index>cursor-1) return;

        array[index] = value;
    }

    // Поиск элемента по значению (у нас есть значение, надо узнать есть ли такое значение в массиве
    @Override
    public int indexOf(T value) {
        // так int, в качестве значение, а не индекса - проверять нам его не нужно
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value) ) return i;
        }

        return -1;
    }


    @Override
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >=0 ; i--) {
            if (array[i].equals(value) ) return i;

        }


        return -1;
    }


    @Override
    public boolean contains(T value) {
        return indexOf(value)>=0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {





        T[] result = Arrays.copyOf(array, cursor);
//
//        return result;
//
//        //TODO не работает исправить!
//        // 1. Создать массив нужной длинны
//        // 2. переписать значения в новый массив
//        T[] result = (T[]) new Object[cursor]; //1.
//        for (int i = 0; i < cursor; i++) {
//            result[i] = array[i];
//
//        }
      //  return T[] Arrays.copyOf(array , cursor);// тоже что и выше

return null; //TODO исправить метод

    }







    //    Удаление элемента по индексу
    @Override
    public T remove(int index) {
        // 1. Проверка
        if (index < 0 && index >= cursor) {
            // такого индекса в массиве нет
            return null;
        }

        T value = array[index];

        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }

        cursor--;

        return value;
    }

@Override
    public boolean remove(T value) {
        // Понять есть ли такой элемент в массиве
        // Если нет - вернуть false и закончить работу методы
        // если есть - получить его индекс
        // переиспользовать метод, удаляющий по индексу.

        int index = indexOf(value);
        // Ctrl + Alt + <- вернуть курсор на предыдущую позицию

        if (index == -1) return false;

        remove(index);
        return true;

    }

    @Override
    public boolean isEmpty() {
        return cursor ==0 ;
    }








}

      /*
      1.Динамическое изменение массива
      2. Добавлять в массив елементы
      3.Добавлять в массив сразу несколько эллементоав
      4. Вывод в консоль знач масива

        */

