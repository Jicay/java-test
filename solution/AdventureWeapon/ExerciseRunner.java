public class ExerciseRunner {


    public static void main(String[] args) {
        Weapon narsil = new Weapon("Narsil", 15);
        Weapon baguette = new Weapon("Baguette magique", 20);
        Weapon massue = new Weapon("Massue", 8);
        Monster troll = new Monster("Troll", 30,  massue);
        Sorcerer dumbledore = new Sorcerer("Dumbledore", 25, 5, baguette);
        Templar alistair = new Templar("Alistair", 18, 2, 3, narsil);

        Character.fight(alistair, troll);

        System.out.println(Character.printStatus());
    }
}