package logic;

public class Weapon extends Item {
    private int damage;

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }
    
     public void use(Player p) {
         p.increaseDamage(damage);
    }
}
