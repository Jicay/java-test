public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
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
        character.takeDamage(getWeapon().getDamage());
    }

    @Override
    public String toString() {
        if (super.getCurrentHealth() > 0) {
            return String.format("%s is a monster with %d HP. He has the weapon %s.", super.getName(), super.getCurrentHealth(), super.getWeapon().toString());
        } else {
            return String.format("%s is a monster and is dead. He has the weapon %s.", super.getName(), super.getWeapon().toString());
        }
    }
}
