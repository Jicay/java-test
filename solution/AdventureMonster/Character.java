import java.util.ArrayList;
import java.util.List;

public class Character {
    private static List<Character> allCharacters = new ArrayList<>();
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        currentHealth = maxHealth;
        this.name = name;
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

    public void takeDamage(int damage) {
        if (damage >= currentHealth) {
            currentHealth = 0;
        } else {
            currentHealth -= damage;
        }
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (currentHealth > 0) {
            return String.format("%s : %d/%d", name, currentHealth, maxHealth);
        } else {
            return String.format("%s : KO", name);
        }
    }
}
