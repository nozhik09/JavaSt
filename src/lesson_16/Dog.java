package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog( String name , int weight){
        this.name=name;
        this.weight=weight;
    }
void eat(){
    System.out.println("Я ем вкусную косточку");
    weight++;
}
void run (){
        //Проверяем позволяет ли вес собаки бегать сейчас
    //если нет отправляем поесть
    // после еды проверить пункт 1
    while (weight<3){
        System.out.println("сорян я слишком голодная! Не могу бежать");
        System.out.println(" мой вес " + weight);
        eat();
    }


    System.out.println("I am run");
    weight-=2;
}


String whoAmI(){
        return " i am dog " +this.name + " my weight " + weight;
}


}
