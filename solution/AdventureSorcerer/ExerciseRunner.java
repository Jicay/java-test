public class ExerciseRunner {

    public static void main(String[] args) {
        Sorcerer gandalf = new Sorcerer("Gandalf", 20, 5);
        Character frodon = new Character("Frodon", 20);
        Sorcerer saroumane = new Sorcerer("saroumane", 10, 3);

        Character.fight(frodon, saroumane);

        gandalf.heal(frodon);

        System.out.println(Character.printStatus());
    }
}