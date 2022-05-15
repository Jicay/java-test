public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public void heal(Character character) {
        if (character.currentHealth + healCapacity >= character.getMaxHealth()) {
            character.currentHealth = character.getMaxHealth();
        } else {
            character.currentHealth += healCapacity;
        }
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public String toString() {
        if (super.getCurrentHealth() > 0) {
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", super.getName(), super.getCurrentHealth(), healCapacity);
        } else {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", super.getName(), healCapacity);
        }
    }
}
