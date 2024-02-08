package lesson_17.homeWork_17;

public class EmployerMain {
    public static void main(String[] args) {

        Employee employee= new Employee("Вася " , 28 , 1600);
        employee.info();
        employee.setName("Игорь");
        employee.setAge(35);
        employee.setSalary(1800);

        employee.info();


        Employee employee1=new Employee("Джон", 31 , 2500);
        employee1.info();




    }



}
