package lesson_16;

public class RubberArray {
    private int[] array;
    private int cursor; //

    public RubberArray() {
        array = new int[10];

    }

    public void add(int number) {

        if (cursor > array.length * 0.9) {
            expandArray(); //методж расширающий наш массив
        }
        array[cursor] = number;
        cursor++;

    }

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? "," : "]");

        }
        return result;

    }

    private void expandArray() {
        //созать новый массив большего размера
        // переписать значения из старого массива в новый
        // перебросить ссылку

        int[] newArray = new int[array.length * 2]; //создаю массив в два раза больщше предыдущего
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray; //Перебросить ссылки

    }

    public void add(int... inst) {
//inst - я могу с ним обращаться так же как и с сыллкой на массив
        for (int i = 0; i < inst.length; i++) {
            add(inst[i]);
        }


    }

    public int size() {
        return cursor;
    }

    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else return Integer.MIN_VALUE;
        // TODO Поправить
    }

    public RubberArray(int[] ints) {
        array = new int[ints.length * 2];
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);

        }


    }

    public int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return i;
        }

        return -1;


    }

    // Удаление
    public int remove(int index) {
        if (index < 0 && index >= cursor) {
            return Integer.MIN_VALUE;
        }

        int value = array[index];
        for (int i = index; i < cursor - 1; i++) {

            if (i >= index) {

                array[i] = array[i + 1];
            }

        }
        cursor++;
        return value;
    }

    public boolean removeByValue(int value) {
        // Понять есть ли такой елемент в нашем массиве
        // Если нет - вернуть false и прекраить
        // если есть получить его индекс
        // переиспользовать метод удаляющий по индексу
       int index = indexOf(value);
       if (index==-1)return false;
       remove(index);
       return true;

        }



    }

      /*
      1.Динамическое изменение массива
      2. Добавлять в массив елементы
      3.Добавлять в массив сразу несколько эллементоав
      4. Вывод в консоль знач масива

        */