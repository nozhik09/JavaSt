package lesson_23.homeWork23;

public class Warrior extends GameCharacter {

    public Warrior(String name, int physicalDamage, int magicDamage, int heals,int armor) {
        super(name, physicalDamage, magicDamage, heals,armor);
    }

    @Override
    public void attack() {
        System.out.println(getName() + "атакует мечом " + "; уровень здровья= "  + getHeals()+ "; уровень брони= " + getArmor() + "; магический урон= " + getMagicDamage() + "; физический урон= " + getPhysicalDamage());
    }
}
