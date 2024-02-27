package lesson_30.HW_29;

public interface MyQueue<T>{
    T getFirst(); // значение "головы" списка
    T getLast(); // значение самого правого элемента списка
    T remove(); // Удаляет первый элемент списка
    T removeFirst(); // Удаляет первый элемент списка
    T removeLast(); //Удаляет последний элемент списка
}