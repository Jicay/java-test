public class ExerciseRunner {

    public static void main(String[] args) {
        Character aragorn = new Character("Aragorn", 20);
        Character uruk = new Character("Uruk", 5);

        System.out.println(aragorn.toString());
        System.out.println(uruk.toString());

        aragorn.attack(uruk);

        System.out.println(uruk.toString());

        aragorn.takeDamage(12);

        System.out.println(aragorn.toString());
    }
}