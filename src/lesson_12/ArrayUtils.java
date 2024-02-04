package lesson_12;

import java.util.Random;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] ints = {11, 0, 77, 33, 24, 56, 83, 99, 105, 45, -8, -15};
        int minIndex = minIndexSearch(ints);
        System.out.println(minIndex + "|" + ints[minIndex]);

        printArr(ints);
        sortArray(ints);
        printArr(ints);

        System.out.println(lineSearch(ints, -15));
        System.out.println(binarySearch(ints, 20));
        int[] testInts = initTestArray(1_000_000);
        int[] searchValue = initTestArray(100);
long stert = System.currentTimeMillis();
            int[] resultSearch = new int [ 100];
        for (int i = 0; i < searchValue.length; i++) {
            resultSearch[i]=lineSearch(testInts, searchValue[i]);


        }
        long end = System.currentTimeMillis();
        System.out.println("line search time " + (end-stert));

    }

    public static int[] initTestArray(int size) {
        Random random = new Random();
        int[] res = new int[size];
        for (int i = 0; i < res.length; i++) {
            res[i] = random.nextInt(2001) - 1000;

        }

        return res;
    }


    //Найти елемент в масивк по знач
    // линейный поиск
    public static int lineSearch(int[] inst, int value) {
        // перебираем все елемены массива сравниваем с искомым
        // если найдено совпадение возвращаем индекс
        // для того что бы сказать что число отсутствует в массиве
        // нам надо совершить ints.length операций. Сложность или скорость этого алгоритма будет 0 от length

        for (int i = 0; i < inst.length; i++) {
            if (inst[i] == value) return i;

        }
        return -1;

    }

    public static int binarySearch(int[] array, int searchValue) {
        int counter = 0;
        int startIndex = 0;
        int middleIndex;
        int endIndex = array.length;
        // проверяем можно ли разделить массив пополам
        while (startIndex <= endIndex) {
            counter++;
            //вычислить индекс средины
            //            0 + (12-0)/2->6 ... 7..12 -> 7+(12-7)/2 = 9
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            // сраниваем на равенств в мредине с искомфм
            if (array[middleIndex] == searchValue) {
                System.out.println("Елемент найден " + counter);
                return middleIndex;
            }
            // надо понять в какой части массива может быть искомое число значение
            // отбросиь не нужею половину массива
            if (array[middleIndex] > searchValue) {
                // то мы должны отбросить правую часть
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        System.out.println("Елемент отсутствует.Щагов затраченго " + counter);
        return -1;
    }


    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIdex = minIndexSearch(array, i);
            // мне нужно поменять местами значения с самого левого и минимального елемента
            // нужно промежуточная переменнная
            int temp = array[i];
            array[i] = array[minIdex];
            array[minIdex] = temp;
        }

    }

    //ищем минимальное значенпие в части
    // мы запускаем цикл. Ищем мин елемент. Меняем местьами с самым лев
    // Мы умегьшаем зону поиска
    public static int minIndexSearch(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {

                min = arr[i];
                minIndex = i;
            }

        }
        return minIndex;


    }

    // метод поиска мин значения масива
    // будем возвращать индекс мин значения
    public static int minIndexSearch(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {

                min = arr[i];
                minIndex = i;
                return minIndex;
            }

        }
        return minIndex;


    }

    public static void printArr(int[] arr) {
        System.out.println("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : " ]"));

        }
        System.out.println();

    }


}
