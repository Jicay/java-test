public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public void takeDamage(int damage) {
        int damageTaken = (damage * 8) / 10;
        if (damageTaken > currentHealth) {
            currentHealth = 0;
        } else {
            currentHealth -= damageTaken;
        }
    }

    @Override
    public void attack(Character character) {
        character.takeDamage(7);
    }

    @Override
    public String toString() {
        if (super.getCurrentHealth() > 0) {
            return String.format("%s is a monster with %d HP", super.getName(), super.getCurrentHealth());
        } else {
            return String.format("%s is a monster and is dead", super.getName());
        }
    }
}
