package lesson_40;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesExample {
    public static void main(String[] args) {


        // Consuner<T> выполняет операции над обьектом над обьектом типа T
        //accept(T t)

        Consumer<String> printCons = t -> System.out.println(t);
        printCons.accept("Hello World");
        Consumer<String> consumer1 = str-> System.out.println("str1 "  + str.length());
        Consumer<String> consumer2 = str-> System.out.println("str2 "  + str + "!");
        Consumer<String> resultCunsumer = consumer1.andThen(consumer2);
        resultCunsumer.accept("Test");

//        Predicate<T> - простая функция которая принимает обьект типа Т и возвращает буль знач
//        Этот интерфейс особенно полезен для проверки соответсвия элемента неким условием (фильтрация)
        Predicate<String> isNotEmpty = str->!str.isEmpty();
        boolean result = isNotEmpty.test("Hellow, word");
        System.out.println(result);
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,0,5,3,4,2,5,3,-46,1,2,-5,-12));
        List<Integer> res1 = getListByPredicate(list,i->i<0);
        System.out.println(res1);
        List<Integer> res2 = getListByPredicate(list,i->i%2==0);
        System.out.println(res2);


//        метод or
//        and
//        negate
//        fanction <T,R> - операция над обьектом типа Т возвращающая результат типа R
//        R apply (T t)


        Predicate<String> isContainsJava = str->str.contains("Java");

        Predicate<String> combinePredicate  = isNotEmpty.and(isContainsJava);
        Predicate<String> combinePredicate2  = isNotEmpty.negate();// конвертация
        System.out.println(combinePredicate.test(""));


        Function<String,Integer> function = str->str.length();
        int leght = function.apply("Hello, world!");
        System.out.println("leght " + leght);

        Function<String,String> toUpperCase = String::toUpperCase;
        Function<String,String> concatenate = s->s+"!!!";
        Function<String,String> combinedFunc=toUpperCase.andThen(concatenate);
        String result1 = combinedFunc.apply("Hello");
        System.out.println("result1-> " + result1);



    }


    public static List<Integer> getListByPredicate(List<Integer> integers, Predicate<Integer> predicate){
        List<Integer> result = new ArrayList<>();

        for (Integer val:integers){
            if (predicate.test(val)){
                result.add(val);
            }
        }


        return result;

    }
}
