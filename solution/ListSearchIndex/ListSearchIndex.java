import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (Objects.equals(list.get(i), value)) {
                return i;
            }
        }
        return null;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), value)) {
                return i;
            }
        }
        return null;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if (list == null) {
            return List.of();
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), value)) {
                res.add(i);
            }
        }
        return res;
    }
}