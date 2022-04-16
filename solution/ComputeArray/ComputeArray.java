import java.util.Locale;

public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                res[i] = 5 * array[i];
            } else if (array[i] % 3 == 1) {
                res[i] = array[i] + 7;
            } else {
                res[i] = array[i];
            }
        }

        return res;
    }
}