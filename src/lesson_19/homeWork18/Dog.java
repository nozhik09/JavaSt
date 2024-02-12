package lesson_19.homeWork18;

public class Dog {

    private String name;

    private int jumpHeight;

    private static int maxJump;
    private static int incr;






    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJump=jumpHeight*2;
    }
    static {
        incr =10;
    }

    public void jump (){
        System.out.println("собака " + name + " совершила прыжок ");



    }
public void training(){
        this.jumpHeight +=incr;
        jumpHeight= Math.min(jumpHeight, maxJump);
    System.out.println("Прыжок после тренровки " + jumpHeight);

}

public boolean tekaBarrier(int barrier){
            System.out.println(name + " прыгнула на  " + jumpHeight + " ,barrier " + barrier);
        if (jumpHeight>=barrier){
            jump();

            return true;
        }
        else {
            if (maxJump>=barrier){
              do {
                  training();
              }
              while (jumpHeight<barrier);
                jump();
                return true;
            } else {
                System.out.println("этот барьер я взть не смогла");
                return false;
            }

        }

}


public void info (){
    System.out.println(   "dog name " + name +"тукущий прыжок " + jumpHeight + " мак спрыжок " + maxJump + "Сделано прыжков ");


}



}
