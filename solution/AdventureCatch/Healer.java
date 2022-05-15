public interface Healer {
    void heal(Character character) throws DeadCharacterException;
    int getHealCapacity();
}
