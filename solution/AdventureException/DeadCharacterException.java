public class DeadCharacterException extends Exception {

    private Character character;

    public DeadCharacterException(Character character) {
        super();
        this.character = character;
    }

    @Override
    public String getMessage() {
        String type = "character";
        if (character instanceof Sorcerer) {
            type = "sorcerer";
        } else if (character instanceof Templar) {
            type = "templar";
        } else if (character instanceof Monster) {
            type = "monster";
        }
        return String.format("The %s %s is dead.", type, character.getName());
    }


}
