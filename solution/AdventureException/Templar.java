public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;
    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
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
    public int getShield() {
        return shield;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void takeDamage(int damage) {
        int damageTaken = damage - shield;
        if (damageTaken > currentHealth) {
            currentHealth = 0;
        } else {
            currentHealth -= damageTaken;
        }
    }

    @Override
    public void attack(Character character) {
        heal(this);
        character.takeDamage(getWeapon().getDamage());
    }

    @Override
    public String toString() {
        if (super.getCurrentHealth() > 0) {
            return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. He has the weapon %s.", super.getName(), super.getCurrentHealth(), healCapacity, shield, getWeapon().toString());
        } else {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP. He has the weapon %s.", super.getName(), shield, healCapacity, getWeapon().toString());
        }
    }
}
