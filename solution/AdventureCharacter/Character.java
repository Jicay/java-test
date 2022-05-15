public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        currentHealth = maxHealth;
        this.name = name;
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
