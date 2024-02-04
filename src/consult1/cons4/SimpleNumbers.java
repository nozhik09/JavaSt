package consult1.cons4;

public class SimpleNumbers {
    public static void main(String[] args) {
        SimpleNumbersServise servise = new SimpleNumbersServise();


        for (int i = 0; i < 100; i++) {
            boolean checkResult = servise.checkSimple(i);
            if(checkResult){
                System.out.print(i+" ");
            }
        }
        
        int number = 7;
        boolean checkResult = servise.checkSimple(number);
        System.out.println("Число " + number + "является " + checkResult);

    }


}
