package lesson_16;

public class MainRuberArray {
    public static void main(String[] args) {


        RubberArray ra= new RubberArray();
        System.out.println(ra.toString());
ra.add(15);
ra.add(-10);
ra.add(100);
        for (int i = 0; i < 11; i++) {
            ra.add(i);
            System.out.println(ra.toString());
        }
ra.add(110, 15, 174 ,56 ,165 ,516 ,5 ,51 ,56 ,5 ,5, 6, 5,4, 5,6,4);
        System.out.println(ra.toString());


        System.out.println("size " + ra.size());

        System.out.println(ra.get(50));


        System.out.println("dasdas " + ra.toString());

        System.out.println("Индеки найден " + ra.indexOf(110));


        ra.remove(2);
        System.out.println(ra.toString());



        ra.removeByValue(100);
        ra.removeByValue(10);
        System.out.println("Удалили 2 числа " + ra.toString());
        ra.add(55,55,55,18,55);
        System.out.println(ra.toString());



    }


}
