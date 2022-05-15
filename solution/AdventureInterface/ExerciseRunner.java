public class ExerciseRunner {

    public static void main(String[] args) {
        Character aragorn = new Character("Aragorn", 20);
        Monster slime = new Monster("Slime", 15);

        System.out.println(Character.printStatus());

        Character winner = Character.fight(aragorn, slime);

        System.out.println(Character.printStatus());
    }
}