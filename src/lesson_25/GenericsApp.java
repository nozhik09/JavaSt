package lesson_25;

import lesson_22.Cat;

public class GenericsApp {

    public static void main(String[] args) {
        GenericsBox<String> boxStr = new GenericsBox<>("Hello");

        System.out.println(boxStr);

       // boxStr.setValue(150); ошибка компиляции

        GenericsBox<Cat> catGenericsBox = new GenericsBox<>(new Cat());

      // GenericsBox<int> genericsBox = new GenericsBox<int>(100); не работают с примитивными
        // только со ссылочными типами данных
        GenericsBox<Integer> IntegerBox = new GenericsBox<>(100);

        GenericsBox<Integer>[]  boxes = new GenericsBox[3];
        boxes[0] = new GenericsBox<>(150);
        boxes[1] = new GenericsBox<>(150);
        boxes[2] = new GenericsBox<>(50);

        int sum  = 0 ;
        for (GenericsBox<Integer> val: boxes){
            sum += val.getValue();
        }
        System.out.println(sum);



        GenericMethods.printBoxes(boxes);

    }

}
