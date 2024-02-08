package lesson_17.homeWork_17;

public class Employee {

    private String name;
    private int age;
    private double salary;



    public Employee(String name, int age , double salary){
        if (age<18 || age>=70) System.out.println("Не подходящий возраст для работы");
        if (salary<=0) System.out.println(" я не рвботаю за бесплатно))");


        this.name = name;
        this.age=age;
        this.salary=salary;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<18 || age>=70) System.out.println("Не подходящий возраст для работы");
else this.age=age;
    }


public void setName(String name){
        if(name!=null){
            this.name=name;
        }
else System.out.println("Вы ввели некоректное имя");
}
public String getName(){
        return name;
}


public double getSalary(){
return salary;
}

public void setSalary(double salary){
        if (salary<=0) System.out.println(" я не рвботаю за бесплатно))");
        else this.salary=salary;
}





    public void info(){
        System.out.printf("Меня зовут %s, мне %d лет, у меня %f Евро зарплата ", name , age, salary);
        System.out.println();


    }




}
