public class ExerciseRunner {

    public static void main(String[] args) {
        Templar alistair = new Templar("Alistair", 20, 5, 4);
        Templar roderick = new Templar("Roderick", 10, 3, 2);

        Character.fight(alistair, roderick);

        alistair.heal(alistair);

        System.out.println(Character.printStatus());
    }
}