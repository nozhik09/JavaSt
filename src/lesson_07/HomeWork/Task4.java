package lesson_07.HomeWork;

public class Task4 {

    public static void main(String[] args) {
        
        int x= 1;
        int y = 0;
        while(y<7){
            if (x%5==0){

            System.out.println(x);
            y++;}
            x++;
            if (x>100) {
                System.out.println("End ");
            break;
       }
        }
    }
}



/*
        int i =1;
        int countNumber = 0;
        while (i<=100 && countNumber<7){
            System.out.println(i);
            if(i%5==0) {
                System.out.println(i);
                countNumber++;
            }
            i++;

          //  System.out.println(i);


        }
    }
    }
*/
