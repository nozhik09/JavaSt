package lesson_17;

public class CatIncapsul {
    private String test;
   private   String name;
    private int age ;
    private int weight;



public CatIncapsul(String test, String name,int age , int weight){
this.age=age;
this.name=name;
this.weight = weight;
this.test=test;


}
public void sayMeom( ){

    System.out.println("Meow " + name);
//гетеры и сетеры это методы  возвращающие или меняющие поля класса



}
public String getName(){
    return this.name;
}
public int getAge(){
    return age;

}
public void setAge(int age){
    if (age<=0) System.out.println("некоректное знач");
    else this.age=age;


}
public void setName(String name){
    if (name!=null) this.name=name;







}


}