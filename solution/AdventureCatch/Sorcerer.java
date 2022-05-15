public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public void heal(Character character) throws DeadCharacterException {
        if (this.currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }
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
    public void takeDamage(int damage) throws DeadCharacterException {
        if (this.currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }
        if (damage > currentHealth) {
            currentHealth = 0;
        } else {
            currentHealth -= damage;
        }
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        if (this.currentHealth <= 0) {
            throw new DeadCharacterException(this);
        }
        heal(this);
        character.takeDamage(getWeapon().getDamage());
    }

    @Override
    public String toString() {
        if (super.getCurrentHealth() > 0) {
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP. He has the weapon %s.", super.getName(), super.getCurrentHealth(), healCapacity, super.getWeapon().toString());
        } else {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP. He has the weapon %s.", super.getName(), healCapacity, super.getWeapon().toString());
        }
    }
}
