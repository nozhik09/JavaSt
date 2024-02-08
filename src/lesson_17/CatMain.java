package lesson_17;

public class CatMain {


    public static void main(String[] args) {
CatIncapsul cat = new CatIncapsul("Test", " Name" , 2 , 5);
cat.sayMeom();
String catName =cat.getName();
        System.out.println(catName);
        int getAge = cat.getAge();

        System.out.println(getAge);

cat.setAge(-10);
        System.out.println(cat.getAge());

        cat.setName(null);
        System.out.println("Name" + cat.getName());

    }
}
