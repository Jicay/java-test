import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.Set;
import javax.print.attribute.IntegerSyntax;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> list = new ArrayList<>();

        for (Integer coin : coins.stream().sorted(Comparator.reverseOrder()).toList()) {
            while (amount - coin >= 0) {
                list.add(coin);
                amount -= coin;
            }
        }

        return list;
    }
}