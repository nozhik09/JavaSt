package lesson_23.homeWork23;

public class Archer extends GameCharacter{

    public Archer(String name, int physicalDamage, int magicDamage, int heals, int armor) {
        super(name, physicalDamage, magicDamage, heals,armor);
    }

    @Override
    public void attack() {
        System.out.println(getName() + "стреляет из лука" + "; уровень здровья= "  + getHeals()+ "; уровень брони= " + getArmor() + "; магический урон= " + getMagicDamage() + "; физический урон= " + getPhysicalDamage());
    }
}
