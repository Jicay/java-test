import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject) {
        celestialObjects.add(celestialObject);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massRepartition = new HashMap<>();
        massRepartition.put("Planet", 0);
        massRepartition.put("Star", 0);
        massRepartition.put("Other", 0);

        for (CelestialObject celestialObject : celestialObjects) {
            if (celestialObject instanceof Star) {
                massRepartition.put("Star", massRepartition.get("Star") + celestialObject.getMass());
            } else if (celestialObject instanceof Planet) {
                massRepartition.put("Planet", massRepartition.get("Planet") + celestialObject.getMass());
            } else {
                massRepartition.put("Other", massRepartition.get("Other") + celestialObject.getMass());
            }
        }

        return massRepartition;
    }
}
