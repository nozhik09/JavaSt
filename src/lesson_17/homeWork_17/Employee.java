package lesson_17.homeWork_17;

public class Employee {

    private String name;
    private int age;
    private double salary;



    public Employee(String name, int age , double salary){
        this.name = name;
        this.age=age;
        this.salary=salary;

    }

    public void info(){
        System.out.printf("Меня зовут %s, мне %d лет, у меня %f Евро зарплата ", name , age, salary);


    }




}
