import java.util.Objects;

public class CelestialObject {
    public static final double KM_IN_ONE_AU = 150_000_000d;
    public double x;
    public double y;
    public double z;
    public String name;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject object1, CelestialObject object2) {
        return Math.sqrt(
                Math.pow(object1.x - object2.x, 2)
                + Math.pow(object1.y - object2.y, 2)
                + Math.pow(object1.z - object2.z, 2)
        );
    }

    public static double getDistanceBetweenInKm(CelestialObject object1, CelestialObject object2) {
        return Math.sqrt(
                Math.pow(object1.x - object2.x, 2)
                + Math.pow(object1.y - object2.y, 2)
                + Math.pow(object1.z - object2.z, 2)
        ) * KM_IN_ONE_AU;
    }

    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CelestialObject that = (CelestialObject) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0
                && Double.compare(that.z, z) == 0 && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }
}
