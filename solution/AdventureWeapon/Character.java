import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private static List<Character> allCharacters = new ArrayList<>();
    private final int maxHealth;
    protected int currentHealth;
    private final String name;
    private final Weapon weapon;

    public Character(String name, int maxHealth, Weapon weapon) {
        this.maxHealth = maxHealth;
        currentHealth = maxHealth;
        this.name = name;
        this.weapon = weapon;
        allCharacters.add(this);
    }

    public static String printStatus() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("------------------------------------------\n");
        if (allCharacters.isEmpty()) {
            stringBuilder.append("Nobody's fighting right now !\n");
        } else {
            stringBuilder.append("Characters currently fighting :\n");
            for (Character c : allCharacters) {
                stringBuilder.append(" - ").append(c.toString()).append("\n");
            }
        }
        stringBuilder.append("------------------------------------------");
        return stringBuilder.toString();
    }

    public static Character fight(Character c1, Character c2) {
        Character attacker = c1;
        Character defender = c2;

        while (attacker.getCurrentHealth() > 0 && defender.getCurrentHealth() > 0) {
            attacker.attack(defender);
            Character c = attacker;
            attacker = defender;
            defender = c;
        }

        return c1.getCurrentHealth() > 0 ? c1 : c2;
    }

    public abstract void takeDamage(int damage);

    public abstract void attack(Character character);

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        if (currentHealth > 0) {
            return String.format("%s : %d/%d. He has the weapon %s.", name, currentHealth, maxHealth, weapon.toString());
        } else {
            return String.format("%s : KO. He has the weapon %s", name, weapon.toString());
        }
    }
}
