import java.util.List;
import java.util.Objects;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        for (Integer  i : list) {
            if (Objects.equals(value, i)) {
                return true;
            }
        }
        return false;
    }
}