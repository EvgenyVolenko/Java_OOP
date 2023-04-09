import java.util.Random;

public abstract class Warrior<T extends Weapon, S extends Protection> extends Personage {

    protected static Random rnd = new Random();
    protected T weapon;
    protected S shield;

    public Warrior(String name, int hp, T weapon, S shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }

    public int harm() {
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rnd.nextInt(weapon.damage() + 1);
        }
        return damage;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon))
                .append(String.format("\n\tЩит: %s", this.shield));
        return res.toString();
    }
}
