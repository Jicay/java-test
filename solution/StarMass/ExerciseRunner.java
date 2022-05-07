public class ExerciseRunner {

    public static void main(String[] args) {
        Galaxy galaxy = new Galaxy();
        CelestialObject charron = new CelestialObject("Charron", -123.12, 392.238, 32.31, 157);
        CelestialObject lune = new CelestialObject("Lune", 3928.32, 327.239, -12.92, 3987);
        Star betelgeuse = new Star("Betelgeuse", 128.23, -12.82, 32.328, 1289.3, 538595);
        Star altair = new Star("Betelgeuse", 43894.34, -324.43, 9438.23, 123.54, 137273);
        Star bellatrix = new Star("Bellatrix", 584.34, 2103.32, -102.43, 413.2, 5483724);
        Planet naboo = new Planet("Naboo", 17.4389, 8349.1, 8943.92, betelgeuse, 32454);
        Planet tatooine = new Planet("Tatooine", 17.4389, 8349.1, 8943.92, betelgeuse, 2345);
        Planet mercure = new Planet("Mercure", 17.4389, 8349.1, 8943.92, altair, 19438);
        Planet venus = new Planet("Venus", 17.4389, 8349.1, 8943.92, altair, 9283);
        Planet mars = new Planet("Mars", 17.4389, 8349.1, 8943.92, altair, 2183);

        galaxy.addCelestialObject(lune);
        galaxy.addCelestialObject(charron);
        galaxy.addCelestialObject(mars);
        galaxy.addCelestialObject(mercure);
        galaxy.addCelestialObject(tatooine);
        galaxy.addCelestialObject(altair);
        galaxy.addCelestialObject(venus);
        galaxy.addCelestialObject(betelgeuse);
        galaxy.addCelestialObject(naboo);
        galaxy.addCelestialObject(bellatrix);

        System.out.println(galaxy.computeMassRepartition().toString());
    }
}