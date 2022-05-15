public class ExerciseRunner {

    public static void main(String[] args) {
        Weapon excalibur = new Weapon("Excalibur", 7);
        Weapon baton = new Weapon("Baton", 3);
        Templar arthur = new Templar("Arthur", 30, 5, 3, excalibur);
        Sorcerer merlin = new Sorcerer("Merlin", 28, 2, baton);

        try {
            arthur.takeDamage(50);
        } catch (DeadCharacterException e) {
            System.out.println(e.getMessage());
        }

        try {
            arthur.takeDamage(2);
        } catch (DeadCharacterException e) {
            System.out.println(e.getMessage());
        }
        try {
            arthur.attack(merlin);
        } catch (DeadCharacterException e) {
            System.out.println(e.getMessage());
        }
    }
}