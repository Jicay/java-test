import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(Map<String, List<String>> men,
            Map<String, List<String>> women) {
        Map<String, List<String>> updatableMen = new HashMap<>();

        Map<String, Boolean> statusMan = new HashMap<>();
        Map<String, Boolean> statusWoman = new HashMap<>();
        Map<String, String> weddingsFromMen = new HashMap<>();
        Map<String, String> weddingsFromWomen = new HashMap<>();

        for (String n : men.keySet()) {
            statusMan.put(n, false);
            updatableMen.put(n, new ArrayList<>(men.get(n)));
        }
        for (String n : women.keySet()) {
            statusWoman.put(n, false);
        }

        String nextMan = getNextMan(statusMan, updatableMen);

        while (nextMan != null) {
            String woman = updatableMen.get(nextMan).remove(0);
            if (!statusWoman.get(woman)) {
                weddingsFromMen.put(nextMan, woman);
                weddingsFromWomen.put(woman, nextMan);
                statusMan.put(nextMan, true);
                statusWoman.put(woman, true);
            } else {
                String currentMarried = weddingsFromWomen.get(woman);
                int orderMan = women.get(woman).indexOf(nextMan);
                int orderMarried = women.get(woman).indexOf(currentMarried);

                if (orderMan < orderMarried) {
                    weddingsFromMen.remove(currentMarried);
                    weddingsFromMen.put(nextMan, woman);
                    weddingsFromWomen.put(woman, nextMan);
                    statusMan.put(nextMan, true);
                    statusMan.put(currentMarried, false);
                    statusWoman.put(woman, true);
                }
            }
            nextMan = getNextMan(statusMan, updatableMen);
        }


        return weddingsFromMen;
    }

    private static String getNextMan(Map<String, Boolean> status, Map<String, List<String>> first) {
        for (String man : status.keySet()) {
            if (!status.get(man) && !first.get(man).isEmpty()) {
                return man;
            }
        }
        return null;
    }
}