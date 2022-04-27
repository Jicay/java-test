import java.util.Comparator;
import java.util.List;

public class Sort {

    public static List<Integer> sort(List<Integer> list) {
        if (list == null) return null;
        return list.stream().sorted().toList();
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) return null;
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }
}