public class ExerciseRunner {
    public static void main(String[] args) {
        CelestialObject celestialObject = new CelestialObject();
        CelestialObject earth = new CelestialObject("Terre", 1.0, 2.0, 2.0);
        CelestialObject earth1 = new CelestialObject("Terre", 1.0, 2.0, 2.0);

        System.out.println(earth.toString());
        System.out.println(earth.equals(earth1));
        System.out.println(earth.equals(celestialObject));

        System.out.println(earth.hashCode());
        System.out.println(celestialObject.hashCode());
    }
}