public class ExerciseRunner {

    public static void main(String[] args) {
        Templar alistair = new Templar("Alistair", 18, 2, 4);
        Sorcerer morrigan = new Sorcerer("Morrigan", 21, 5);
        Monster dragon = new Monster("Dragon", 12);

        dragon.attack(alistair);
        dragon.attack(morrigan);

        alistair.attack(dragon);
        morrigan.attack(dragon);

        System.out.println(Character.printStatus());
    }
}