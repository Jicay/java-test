import java.util.Arrays;
import java.util.stream.Collectors;

public class ExerciseRunner {
    public static void main(String[] args) {
        var array = ComputeArray.computeArray(new int[]{9, 13, 8, 23, 1, 0, 89});
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}