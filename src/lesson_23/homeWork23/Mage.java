package lesson_23.homeWork23;

public class Mage extends GameCharacter{

    public Mage(String name, int physicalDamage, int magicDamage, int heals , int armor) {
        super(name, physicalDamage, magicDamage, heals , armor);
    }


    @Override
    public void attack() {
        System.out.println(getName() + "кастует огненный шар" + "; уровень здровья= "  + getHeals() + "; уровень брони= " + getArmor() + "; магический урон= " + getMagicDamage() + " ; физический урон= " + getPhysicalDamage());
    }
}
