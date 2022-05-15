public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
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
