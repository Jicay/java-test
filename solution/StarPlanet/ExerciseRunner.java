public class ExerciseRunner {

    public static void main(String[] args) {
        Planet earth = new Planet();
        Planet naboo = new Planet("Naboo", 17.4389, 8349.1, 8943.92, new Star("Betelgeuse", 128.23, -12.82, 32.328, 1289.3));

        System.out.println(naboo.toString());
        System.out.println(earth.toString());
        System.out.println(naboo.getCenterStar().toString());
    }
}