package lesson_23.homeWork23;

public class Raid {


    public static void main(String[] args) {

        GameCharacter[] gameCharacters = new GameCharacter[3];
        gameCharacters[0] = new Mage("Джайна Праудмур " , 4 , 80 , 50 , 15);
        gameCharacters[1]=new Warrior("Артас Менетил ", 120 , 15,250 , 98);
        gameCharacters[2]=new Archer("Хеминг Эрнестуэй " , 220 , 4,100,56);

        for (GameCharacter gameCharacter : gameCharacters){

            System.out.println(gameCharacter);
            gameCharacter.attack();
            System.out.println();
        }
    }

}
