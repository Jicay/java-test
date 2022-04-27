import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        if (first == null || second == null) {
            return Map.of();
        }
        List<String> firstList = first.stream().toList();
        List<String> secondList = second.stream().toList();

        int i = 0;

        Map<String, String> res = new HashMap<>();

        while (i < firstList.size() && i < secondList.size()) {
            res.put(firstList.get(i), secondList.get(i));
            i++;
        }

        return res;
    }
}