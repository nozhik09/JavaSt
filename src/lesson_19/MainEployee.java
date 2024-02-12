package lesson_19;

public class MainEployee {

    public static void main(String[] args) {


        Employee employee = new Employee(" John ", 2000);
        Employee employee1 = new Employee("John", 2000);

        System.out.println(employee.info());
        System.out.println(employee1.info());

        // id - уникальный идетифактор -- что то уникальное для каждого обьуекта,
        // признак по которому можно опознать обьект




    }
}
