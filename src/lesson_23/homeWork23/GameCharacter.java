package lesson_23.homeWork23;

abstract public class GameCharacter {
   private String name;
   private int physicalDamage;
   private int magicDamage;
   private int heals;

   private int armor;

    public GameCharacter(String name, int physicalDamage, int magicDamage, int heals , int armor) {
        this.name = name;
        this.physicalDamage = physicalDamage;
        this.magicDamage = magicDamage;
        this.heals = heals;
        this.armor=armor;
    }

    public abstract  void attack();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(int physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getHeals() {
        return heals;
    }

    public void setHeals(int heals) {
        this.heals = heals;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
